package swapStrings;

import java.util.ArrayList;
import java.util.List;

public class SwapStrings<T> {
    private List<T> list;

    public SwapStrings(){
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        this.list.add(element);
    }

    public T get(int index) {
        return this.list.get(index);
    }

    public void set(int index, T element) {
        this.list.set(index, element);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(T item : list) {
            sb.append(item.getClass().getName()).append(String.format(": %s", item));
            sb.append(System.lineSeparator());
        }
        return  sb.toString();
    }

}
