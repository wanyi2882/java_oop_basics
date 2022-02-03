package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bfr.readLine().split("[,\\s]+");

        System.out.println("Count = " + input.length);

        if(input.length < 2){
            System.out.println(("Sum = " + input[0]));
        } else {
            Function<String, Integer> parser = (x -> Integer.parseInt(x));

            int sum = 0;
            for (String s : input){
                sum += parser.apply(s);
            }

            System.out.println("Sum = " + sum);
        }
    }

}
