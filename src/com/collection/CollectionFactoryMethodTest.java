package com.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFactoryMethodTest {
    public static void main(String[] args) {
        List<String> list = List.of("pruthviraj", "Abhi", "Harsh", "Nikunj","Prakash");
        System.out.println(list);
        list.forEach(l-> System.out.println(l));
        //list.add("MMM");
        System.out.println("============================================================================");

        Set<String> set = Set.of("pruthviraj", "Abhi", "Harsh", "Nikunj","Prakash");
        System.out.println(set);
        set.forEach(s-> System.out.println(s));
        System.out.println("============================================================================");

        Map<Integer,String> map= Map.of(123,"Hetvi", 124,"Rimpal");
        //map.forEach(m-> System.out.println(m));
        System.out.println(map);
        for (Map.Entry m: map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
