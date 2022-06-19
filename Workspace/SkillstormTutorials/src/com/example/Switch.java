package com.example;

public class Switch {
    public static void main(String[] args) {
        switchCase("default");
    }
    static void switchCase(String val){
        switch (val){
            case "A":{
                System.out.println("A shows");
                break; //without, it goes to next case
            }case "B":{
                System.out.println("B shows");
                break;
            } default:{
                System.out.println("Default shows");
                break;
            }
        }
    }
}
