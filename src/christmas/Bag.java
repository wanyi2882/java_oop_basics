package christmas;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private List<Present> data;
    private String color;
    private int capacity;

    public Bag(String color, int capacity){
        this.color = color;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Present> getData() {
        return data;
    }

    public void setData(List<Present> data) {
        this.data = data;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int count(){
        return this.data.size();
    }

    public void add(Present present){
        this.data.add(present);
    }

    public boolean remove(String name){
        return this.getData().removeIf(p -> p.getName().equals(name));
    }

    public Present heaviestPresent(){
        double weight = 0.0;
        Present item = null;

        for (Present present : this.getData()) {
            if(present.getWeight() > weight){
                item = present;
            }
        }
        return item;
    }

    public Present getPresent(String name) {
        for(Present present : this.getData()) {
            if(present.getName().equals(name)) {
                return present;
            }
        }
        return null;
    }

    public String report(){
        String guildInfo = String.format("%s bag contains:%n", this.getColor());
        StringBuilder sb = new StringBuilder(guildInfo);

        for(Present present : this.getData()){
            sb.append(present.toString()).append(System.lineSeparator());
        }

        return sb.toString().trim();
    }
}
