package com.diamond;

public class DiamondOperator {
    public static void main(String[] args) {
        MyClass<Integer> myClass = new MyClass<>() {
            Integer add(Integer x, Integer y) {
                return x+y;
            }
        };
        Integer sum = myClass.add(100,101);
        System.out.println(sum);
    }
}
