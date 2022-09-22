package com.tryWithResource;

import java.io.*;
import java.util.Scanner;

public class tryWithResourceInJava7 {
    public static void main(String[] args){
        try(InputStream inputStream = new FileInputStream("D:\\newFile.txt");
        Scanner scanner = new Scanner(inputStream)) {
            while (scanner.hasNextLine()){
                System.out.println((scanner.nextLine()));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

