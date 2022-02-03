package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.BiPredicate;

public class PredicateParty {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String[] guestArray = bfr.readLine().split(" ");

        List<String> guestList = new ArrayList<>(Arrays.asList(guestArray));

        Map<String, BiPredicate<String, String>> functions = new LinkedHashMap<>();

        BiPredicate<String, String> startsWith = (name, givenChar) -> name.startsWith(givenChar) ;
        BiPredicate<String, String> endsWith = (name, givenChar) -> name.endsWith(givenChar) ;
        BiPredicate<String, String> length = (name, nameLength) -> name.length() == Integer.parseInt(nameLength) ;

        functions.put("StartsWith", startsWith);
        functions.put("EndsWith", endsWith);
        functions.put("Length", length);

        String[] command = bfr.readLine().split(" ");

        while(!command[0].equals("Party!")){
            String commandOne = command[0];
            String commandTwo = command[1];
            String commandThree = command[2];

            switch (commandOne) {
                case "Double":
                    int size = guestList.size();
                    for(int i = 0; i < size; i++){
                        if(functions.get(commandTwo).test(guestList.get(i), commandThree)) {
                            guestList.add(guestList.get(i));
                        }
                    }
                    break;

                case "Remove":
                    for(int i = 0; i < guestList.size(); i++){
                        if(functions.get(commandTwo).test(guestList.get(i), commandThree)) {
                            guestList.remove(guestList.get(i));
                            i--;
                        }
                    }
                    break;
            }
            command = bfr.readLine().split(" ");
        }

        Collections.sort(guestList);

        if(guestList.size() == 0){
            System.out.println("Nobody is going to the party!");
        } else {

            System.out.println(String.join(", ", guestList) + " are going to the party!");
        }
    }
}
