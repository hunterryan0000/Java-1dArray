package com.example;

public class Override {
    public static void main(String[] args) {
        Poppable obj = new Balloon();
        obj.pop(); // calls the balloon pop method
    }
}
class Poppable {
    public void pop(){
        System.out.println("Pop");
    }
}
class Balloon extends Poppable{
    public void pop() {
        System.out.println("Pop!");
    }
}