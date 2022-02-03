package customList;

public class CommandInterpreter<T extends Comparable> {
    private CustomList<String> customList;

    public CommandInterpreter(CustomList<String> customList){
        this.customList = customList;
    }

    public void readCommand(String... args) {
        String command = args[0];

        switch(command) {
            case "Add":
                customList.add(args[1]);
                break;

            case "Remove":
                customList.remove(Integer.parseInt(args[1]));
                break;

            case "Contains":
                System.out.println(customList.contains(args[1]));
                break;

            case "Swap":
                customList.swap(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                break;

            case "Greater":
                System.out.println(customList.countGreaterThan(args[1]));
                break;

            case "Max":
                System.out.println(customList.getMax());
                break;

            case "Min":
                System.out.println(customList.getMin());
                break;

            case "Print":
                customList.print();
        }
    }
}
