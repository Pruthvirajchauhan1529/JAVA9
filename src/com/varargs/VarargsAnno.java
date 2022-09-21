package com.varargs;

import java.util.ArrayList;
import java.util.List;

public class VarargsAnno {
    public static void main(String[] args) {

        //List<String> list = List.of("Pruthviraj","Prakash","Harsh");
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("PHP");
        VarargsAnno varargsAnno = new VarargsAnno();
        varargsAnno.display(list);
    }
    @SafeVarargs
    private void display(List<String>... list) {
        for (List<String> list1: list) {
            for (String s: list1) {
                System.out.println(s);
            }
            //System.out.println(list1);
        }
    }
}
