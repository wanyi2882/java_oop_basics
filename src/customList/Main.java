package customList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bfr.readLine().split("\\s+");

        CustomList list = new CustomList<>();

        CommandInterpreter commands = new CommandInterpreter<>(list);

        while(!input[0].equals("END")){
            commands.readCommand(input);
            input = bfr.readLine().split("\\s+");
        }
    }
}
