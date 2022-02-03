package genericBoxOfInteger;

public class Box<T> {

    private T value;

    public Box(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(value.getClass().getName()).append(String.format(": %s", value));
        return sb.toString();
    }
}
