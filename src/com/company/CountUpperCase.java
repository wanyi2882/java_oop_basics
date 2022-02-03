package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CountUpperCase {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        Predicate<String> startWithCapital = x -> x.toUpperCase().charAt(0) == x.charAt(0);

        String[] words = Arrays.stream(bfr.readLine().split("\\s+")).filter(startWithCapital).toArray(String[]::new);

        System.out.println(words.length);

        Consumer<String> print = System.out::println;

        Arrays.stream(words).forEach(print);
    }
}
