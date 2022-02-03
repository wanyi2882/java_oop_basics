package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) throws IOException {
        // Write your code here
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers = Arrays.stream(bfr.readLine().split("[,\\s]+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));

        numbers.removeIf(n -> n % 2 != 0);

        System.out.println(numbers.toString().replaceAll("[\\[\\]]", ""));

        numbers.sort((a, b) -> a.compareTo(b));

        System.out.println(numbers.toString().replaceAll("[\\[\\]]", ""));

    }
}