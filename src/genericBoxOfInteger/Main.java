package genericBoxOfInteger;

import genericBox.Box;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bfr.readLine());

        for(int i = 0 ; i < n; i++){
            Box input = new Box<>(Integer.parseInt(bfr.readLine()));

            System.out.println(input);
        }
    }
}
