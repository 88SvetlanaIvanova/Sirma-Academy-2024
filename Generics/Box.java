import java.util.Scanner;

public class Box <T>{
    private T value;

    public Box(T value) {
        this.value = value;
    }

    @Override
    public String toString() {

        return (value.getClass().getName() + ": " + value);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < lines; i++) {
            String input = sc.nextLine();

            Box<String> box = new Box<>(input);
            System.out.println(box.toString());
        }
        sc.close();

    }
}
