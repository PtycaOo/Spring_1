package org.example;

import com.google.common.base.Joiner;
public class Main {
    public static void main(String[] args) {
        String[] words = {"Hello World!"};
        String massage = Joiner.on(", ").join(words);
        System.out.println(massage);
    }
}