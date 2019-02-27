package oop.generic;


public class TestGenericContainer {

    public static void main(String[] args) {

        GenericContainer<String> container = new GenericContainer<String>("53");
        container.setEl("2342");

        String el = container.getEl();
    }
}