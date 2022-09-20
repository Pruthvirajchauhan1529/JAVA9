package com.practice;

public interface PrivateInter {

    default void cardName(){
        System.out.println("This is default method for card");
        createCardId();
        displayCardDetails();
    }
    private void createCardId(){
        System.out.println("This is private method for card");
    }
    private static void displayCardDetails(){
        System.out.println("This is private static method");
    }
}
