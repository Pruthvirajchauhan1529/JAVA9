package com.tryWithResource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class tryWithResource01 {
    public static void main(String[] args){
        System.out.println(readData("Hello Java Team"));
    }
    static String readData(String message) {
        Reader inputString = new StringReader(message);
        BufferedReader br = new BufferedReader(inputString);
        try (BufferedReader br1 = br) {
            return br1.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

