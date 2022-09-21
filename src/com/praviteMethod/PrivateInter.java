package com.praviteMethod;

public interface PrivateInter {

    default void cardName(){
        System.out.println("This is default method for card");
        createCardId();
        displayCardDetails();
    }
    public static void test(){
        System.out.println("This is public static method");
        displayCardDetails();
    }
    private void createCardId(){
        System.out.println("This is private method for card");
    }
    static void displayCardDetails(){
        System.out.println("This is private static method for card");
        //createCardId();
    }
}
