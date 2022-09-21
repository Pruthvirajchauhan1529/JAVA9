package com.tryWithResource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class tryWithResource02 {
    public static void main(String[] args) {
        System.out.println(readData());
    }
    static String readData(){
        Reader inputString = new StringReader("Hello Java Team");
        BufferedReader br = new BufferedReader(inputString);
        try(br) {
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
