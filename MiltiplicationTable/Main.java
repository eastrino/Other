package com.eastrino;

public class Main {

    public static void main(String[] args) {
        for (int y=1; y<=9; y++){
            for (int x=1; x<=9; x++) {
                System.out.printf("%d\t", x * y);
            }
            System.out.println();
        }
    }
}
