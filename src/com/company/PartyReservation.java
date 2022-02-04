package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class PartyReservation {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String[] party = bfr.readLine().split(" ");

        List<String> partyList = new ArrayList<>(Arrays.asList(party));
        List<String> unwantedList = new ArrayList<>();

        Map<String, BiPredicate<String, String>> functions = new LinkedHashMap<>();

        BiPredicate<String, String> startsWith = (name, givenChar) -> name.startsWith(givenChar) ;
        BiPredicate<String, String> endsWith = (name, givenChar) -> name.endsWith(givenChar) ;
        BiPredicate<String, String> length = (name, nameLength) -> name.length() == Integer.parseInt(nameLength) ;
        BiPredicate<String, String> contains = (name, givenChar) -> name.contains(givenChar);

        functions.put("Starts with", startsWith);
        functions.put("Ends with", endsWith);
        functions.put("Length", length);
        functions.put("Contains", contains);

        String[] command = bfr.readLine().split(";");

        while(!command[0].equals("Print")){
            String commandOne = command[0];
            String commandTwo = command[1];
            String commandThree = command[2];

            switch (commandOne) {
                case "Add filter":
                    for(int i = 0; i < partyList.size(); i++){
                        if(functions.get(commandTwo).test(partyList.get(i), commandThree)) {
                            unwantedList.add(partyList.get(i));
                            partyList.remove(partyList.get(i));
                            i--;
                        }
                    }
                    break;

                case "Remove filter":
                    for(int i = 0; i < unwantedList.size(); i++){
                        if(functions.get(commandTwo).test(unwantedList.get(i), commandThree)) {
                            partyList.add(unwantedList.get(i));
                        }
                    }
                    break;
            }
            command = bfr.readLine().split(";");
        }

        for(String person : party){
            if (partyList.contains(person)) {
                System.out.print(person + " ");
            }
        }

        //System.out.println(partyList.stream().collect(Collectors.joining(" ")).toString());
    }
}