package trafficLight;

public class TrafficLights {
    static String color = "";

    TrafficLights(String color){
        TrafficLights.color = color;
    }

    public static String changeColor(TrafficLights trafficLights) {
        String color = "";
        if(trafficLights.getColor().equals("RED")){
            color = "GREEN";
        } else if (trafficLights.getColor().equals("GREEN")){
            color = "YELLOW";
        } else if(trafficLights.getColor().equals("YELLOW")){
            color = "RED";
        }

        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
