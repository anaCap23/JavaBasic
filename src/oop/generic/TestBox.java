package oop.generic;

public class TestBox {

    public static void main(String[] args) {
        Box<String> box = new Box<String>("my mind");

        String el = box.getEl();
    }
}
