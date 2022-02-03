package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class FilterByAge {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        BiPredicate<Map.Entry<String, Integer>, Integer> youngerThan = (person, ageLimit) -> person.getValue() <= ageLimit;

        BiPredicate<Map.Entry<String, Integer>, Integer> olderThan = (person, ageLimit) -> person.getValue() >= ageLimit;

        Consumer<Map.Entry<String, Integer>> printName = person -> System.out.println(person.getKey());
        Consumer<Map.Entry<String, Integer>> printAge = person -> System.out.println(person.getValue());
        Consumer<Map.Entry<String, Integer>> printNameAndAge = person -> System.out.printf("%s - %d%n", person.getKey(), person.getValue());

        Map<String, Integer> people = new LinkedHashMap<>();
        int peopleCount = Integer.parseInt(bfr.readLine());

        for(int i = 0; i < peopleCount; i++){
            String[] input = bfr.readLine().split(", ");
            people.put(input[0], Integer.parseInt(input[1]));
        }

        String comparison = bfr.readLine();
        int ageLimit = Integer.parseInt(bfr.readLine());
        String printType = bfr.readLine();

        people.entrySet().stream()
                .filter(person -> comparison.equals("younger") ? youngerThan.test(person, ageLimit) :
                        olderThan.test(person, ageLimit))
                .forEach(person -> {
                    switch (printType) {
                        case "age":
                            printAge.accept(person);
                            break;

                        case "name":
                            printName.accept(person);
                            break;

                        default:
                            printNameAndAge.accept(person);
                            break;
                    }
                });
    }
}
