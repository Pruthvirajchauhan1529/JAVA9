package com.praviteMethod;

public class PrivateImpl implements PrivateInter {

    public static void main(String[] args) {

        System.out.println("Hello World");
        PrivateInter inter = new PrivateImpl();
        inter.card();
        PrivateInter.test();
        // PrivateInter.displayCard();
    }
}
