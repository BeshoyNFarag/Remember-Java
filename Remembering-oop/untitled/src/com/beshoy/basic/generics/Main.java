package com.beshoy.basic.generics;

public class Main {
    public static void main(String[] args) {
        Storage <String> stringStorage = new Storage();
        stringStorage.addItem("Banana");
        stringStorage.addItem("Chicken");
        stringStorage.addItem("Duck");
        stringStorage.addItem("Panda");

        stringStorage.displayItems();
        System.out.println();
        stringStorage.removeItem("Chicken");
        stringStorage.displayItems();
        System.out.println();

        stringStorage.swapItems("Duck", "Panda");
        stringStorage.displayItems();




    }



}
