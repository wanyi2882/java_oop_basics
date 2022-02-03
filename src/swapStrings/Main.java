package swapStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bfr.readLine());

        SwapStrings<String> list = new SwapStrings<>();
        for(int i = 0; i < n; i++){
            String text = bfr.readLine();
            list.add(text);
        }

        int[] swapIndexes = Arrays
                .stream(bfr.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String elementOne = list.get(swapIndexes[0]);
        String elementTwo = list.get(swapIndexes[1]);

        list.set(swapIndexes[0], elementTwo);
        list.set(swapIndexes[1], elementOne);

        System.out.println(list.toString());

    }
}
