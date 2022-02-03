package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PureFunctionDemo {
    private static int sum (int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        System.out.println(sum(5, 10));
    }
}
