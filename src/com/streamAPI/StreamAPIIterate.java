package com.streamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIIterate {
    public static void main(String[] args) {

        System.out.println("Stream.iterate--------------------------------------------------");
        List<Integer> collect = Stream.iterate(1, i->i+1).limit(10).collect(Collectors.toList());
        System.out.println(collect);
        collect.forEach(l-> System.out.println(l));
        System.out.println("-------------------------");

    }
}
