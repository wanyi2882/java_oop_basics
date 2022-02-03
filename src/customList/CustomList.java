package customList;

import java.util.ArrayList;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> list;

    public CustomList(){
        this.list = new ArrayList<>();
    }

    public void add(T element){
        list.add(element);
    }

    public T remove(int index){
        return list.remove(index);
    }

    public boolean contains(T element){
        return list.contains(element);
    }

    public void swap(int indexOne, int indexTwo){
        T one = list.get(indexOne);
        T two = list.get(indexTwo);
        list.set(indexOne, two);
        list.set(indexTwo, one);
    }

    public int countGreaterThan(T element){
        int count = 0;

        for(T eachElement : this.list){
            if(eachElement.compareTo(element) > 0){
                count++;
            }
        }
        return count;
    }

    public T getMax(){
        T maxElement = this.list.get(0);

        for(T eachElement : this.list){
            if(eachElement.compareTo(maxElement) > 0){
                maxElement = eachElement;
            }
        }

        return maxElement;
    }

    public T getMin(){
        T minElement = this.list.get(0);

        for(T eachElement : this.list){
            if(eachElement.compareTo(minElement) < 0){
                minElement = eachElement;
            }
        }

        return minElement;
    }

    public void print(){
        for(T eachElement : this.list){
            System.out.println(eachElement);
        }
    }
}
