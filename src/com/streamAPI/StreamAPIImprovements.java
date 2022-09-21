package com.streamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIImprovements {
    public static void main(String[] args) {

        System.out.println("Stream.iterate--------------------------------------------------");
        List<Integer> collect = Stream.iterate(1, i->i+1).limit(10).collect(Collectors.toList());
        System.out.println(collect);
        collect.forEach(l-> System.out.println(l));
        System.out.println("-------------------------");
//        List<Integer> collect2 = Stream.iterate(1,i->i<=10, i->i+1).collect(Collectors.toList());
//        System.out.println(collect2);
        System.out.println("Stream.takewhile--------------------------------------------------------------");
        List<Integer> collect3 = Stream.of(12,22,34,59,9,21,43,55,98,8,9).takeWhile(number -> number%2 == 0).
                collect(Collectors.toList());
        collect3.forEach(c-> System.out.println(c));
        System.out.println("Stream.dropwhile--------------------------------------------------------------");
        List<Integer> collect4 = Stream.of(12,22,34,59,9,21,43,55,98,8,9).dropWhile(number -> number%2 == 0).
                collect(Collectors.toList());
        collect4.forEach(c-> System.out.println(c));
    }
}
