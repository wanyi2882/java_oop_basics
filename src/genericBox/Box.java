package genericBox;

public class Box <T> {

    private T box;

    public Box(T box) {
        this.box = box;
    }

    public T getBox() {
        return box;
    }

    public void setBox(T box) {
        this.box = box;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(box.getClass().getName()).append(String.format(": %s", box));
        return  sb.toString();
    }
}
