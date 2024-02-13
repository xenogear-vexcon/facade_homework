package org.example;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("110", "101100")); // 6 + 44
        System.out.println(bins.mult("100", "110")); // 4 * 6
    }
}