package com.example;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        IO.println("Helló");
        System.out.println("valami");
        // Írj egy ciklust
        for (int i = 0; i < 5; i++) {
            System.out.println("Szám: " + i);
        }

        int j = 0;
        while (j < 3) {
            System.out.println("While ciklus: " + j);
            j++;
        }
    }
    public void valami() {}
}