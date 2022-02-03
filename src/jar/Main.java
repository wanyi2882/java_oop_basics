package jar;

public class Main {
    public static void main(String[] args) {
        Jar<String> stringsJar = new Jar<>();
        stringsJar.add("Hello");
        stringsJar.add("world");
        System.out.println(stringsJar.remove());
    }
}
