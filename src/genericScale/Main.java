package genericScale;

public class Main {
    public static void main(String[] args) {
        Scale<Integer> integerScale = new Scale<>(1, 5);
        System.out.println(integerScale.getHeavier());

        Scale<String> stringScale = new Scale<>("A", "A");
        System.out.println(stringScale.getHeavier());
    }
}
