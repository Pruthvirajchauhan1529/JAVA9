package com.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFactoryMethodList {
    public static void main(String[] args) {
        List<String> list = List.of("pruthviraj", "Abhi", "Harsh", "Nikunj","Anup");
        System.out.println(list);
        list.forEach(l-> System.out.println(l));
        //list.add("MMM");
        System.out.println("============================================================================");

    }
}
