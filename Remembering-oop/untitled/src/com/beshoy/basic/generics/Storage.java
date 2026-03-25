package com.beshoy.basic.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Storage <T> {
    private T item;
    private ArrayList<T> items = new ArrayList<>();

    public void setItem(T item) {
        this.item = item;
    }
    public T getItem() {
        return item;
    }

    public void addItem(T item) {
        items.add(item);
    }
    public void removeItem(T item) {
        items.remove(item);
    }

    public void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }

    public void swapItems(T item1, T item2) {
        int index1 = items.indexOf(item1);
        int index2 = items.indexOf(item2);
        Collections.swap(items, index1, index2);
    }

}
