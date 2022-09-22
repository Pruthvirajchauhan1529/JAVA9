package com.praviteMethod;

public interface PrivateInter {

    default void card(){
        System.out.println("This is default method for card");
        createCard();
        //displayCard();
    }
    static void test(){
        System.out.println("This is public static method");
        //displayCard();
    }
    private void createCard(){
        System.out.println("This is private method for card");
    }
   /* private static void displayCard(){
        System.out.println("This is private static method for card");
        //createCardId();
    }*/
}
