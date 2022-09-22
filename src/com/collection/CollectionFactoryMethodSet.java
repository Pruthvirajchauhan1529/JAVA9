package com.collection;

import java.util.Set;

public class CollectionFactoryMethodSet {
    public static void main(String[] args) {

        Set<String> set = Set.of("Pruthviraj", "Abhi", "Harsh", "Nikunj","Anup");
        System.out.println(set);
        set.forEach(s-> System.out.println(s));
        System.out.println("============================================================================");
    }
}
