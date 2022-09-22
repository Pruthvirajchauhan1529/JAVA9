package com.tryWithResource;

import java.io.*;
import java.util.Scanner;

public class TryWithResourceBefore7 {
    public static void main(String[] args) {
        Scanner scanner = null;
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("D:\\newFile.txt");
            scanner = new Scanner(inputStream);
            while (scanner.hasNextLine()){
                System.out.println((scanner.nextLine()));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (scanner != null)
                scanner.close();
            if (scanner != null)
                scanner.close();
        }
    }
}
