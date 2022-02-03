package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.BiFunction;

public class SumNumbersBifunction {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bfr.readLine().split(", ");

        int sum = Integer.parseInt(input[0]);

        if(input.length >= 2){
            BiFunction<Integer, String, Integer> parser = (x, y) -> x + Integer.parseInt(y);

            for(int i = 1; i < input.length; i++){
                sum = parser.apply(sum, input[i]);
            }
        }

        System.out.println("Count = "+ input.length);
        System.out.println("Sum = " + sum);
    }
}
