package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bag<T> {
    List<T> list = new ArrayList<>();

    public void add(T t) {
        list.add(t);
    }

    public void remove(T t) {
        list.remove(t);
    }

    public void clear() {
        list.clear();
    }
}
