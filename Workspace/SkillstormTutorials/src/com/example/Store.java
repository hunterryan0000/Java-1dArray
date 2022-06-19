package com.example;

public class Store {
    public static void main(String[] args) {
        Furniture chair = new Chair(); // reference type is Furniture object type is Chair
    }
}
class Furniture{ }
class Chair extends Furniture{}
class Table extends Furniture{}