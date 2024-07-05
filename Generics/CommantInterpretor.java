import java.util.Scanner;

public class CommantInterpretor {
    public static void main(String[] args) {
        CustomList<String> newList = new CustomList<>();
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split("\s+");
        while (!command[0].equals("end")) {
            if ("Add".equals(command[0])) {
                String element = command[1];
                newList.add(element);
            } else if ("Remove".equals(command[0])) {
                int index = Integer.parseInt(command[1]);
                newList.remove(index);
            } else if ("Contains".equals(command[0])) {
                String element = command[1];
                System.out.println(newList.contains(element));
            } else if ("Swap".equals(command[0])) {
                int index1 = Integer.parseInt(command[1]);
                int index2 = Integer.parseInt(command[2]);
                newList.swap(index1, index2);
            } else if ("Greater".equals(command[0])) {
                String element = command[1];
                System.out.println(newList.countGreaterThan(element));
            } else if ("Max".equals(command[0])) {
                System.out.println(newList.getMax());
            } else if ("Min".equals(command[0])) {
                System.out.println(newList.getMin());
            } else if ("Print".equals(command[0])) {
                newList.print();
            } else if ("End".equals(command[0])) {
                break;
            } else {
                System.out.println("Invalid command");
            }
            command = command = scanner.nextLine().split("\s+");
        }

        scanner.close();
    }
}
