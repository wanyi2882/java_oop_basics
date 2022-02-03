package cardSuit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String input = bfr.readLine();

        if(input.equals("Card Suits")){
            System.out.println(input + ":");

            for(Deck each : Deck.values()){
                System.out.println("Ordinal value: " + each.getValue() + ";" + " Name value: " + each);
            }
        }
    }
}
