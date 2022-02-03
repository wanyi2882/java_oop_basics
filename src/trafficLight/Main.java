package trafficLight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        String[] colours = bfr.readLine().split("\\s+");
        int n = Integer.parseInt(bfr.readLine());

        for(int i = 0; i < n; i++){
            for(int j = 0; j < colours.length; j++){
                TrafficLights trafficLights = new TrafficLights(colours[j]);
                String color = TrafficLights.changeColor(trafficLights);
                colours[j] = color;
                System.out.print(color + " ");
            }
            System.out.println();
        }
    }
}
