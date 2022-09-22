package com.tryWithResource;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class tryWithResourceInJava9 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Files.newInputStream(Paths.get("D:\\newFile.txt"));
        Scanner scanner = new Scanner((inputStream));
        try(inputStream;scanner) {
            while (scanner.hasNextLine()){
                System.out.println((scanner.nextLine()));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
