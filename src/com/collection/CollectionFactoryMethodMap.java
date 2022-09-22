package com.collection;

import java.util.Map;

public class CollectionFactoryMethodMap {
    public static void main(String[] args) {

        Map<Integer,String> map= Map.of(123,"Hetvi", 124,"Rimpal");
        System.out.println(map);
        for (Map.Entry m: map.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
