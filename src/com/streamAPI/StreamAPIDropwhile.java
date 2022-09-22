package com.streamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDropwhile {
    public static void main(String[] args) {
        System.out.println("Stream.dropwhile--------------------------------------------------------------");
        List<Integer> collect4 = Stream.of(12,22,34,59,9,21,43,55,98,8,9).
                dropWhile(number -> number%2 == 0).collect(Collectors.toList());

        collect4.forEach(c-> System.out.println(c));
    }
}
