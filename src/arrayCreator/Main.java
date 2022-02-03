package arrayCreator;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = ArrayCreator.create(3, 10);
        String[] stringArray = ArrayCreator.create(3, "DEFAULT", String.class);


    }
}
