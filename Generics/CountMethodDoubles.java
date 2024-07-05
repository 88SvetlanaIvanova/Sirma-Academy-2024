import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CountMethodDoubles<T extends Comparable<T>> {


    private T value;

    @SuppressWarnings("unchecked")
    public CountMethodDoubles(T value) {
        this.value = (T) value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CountMethodDoubles<?> box = (CountMethodDoubles<?>) obj;
        return Objects.equals(value, box.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return (value.getClass().getName() + ": " + value);
    }

    public static <T extends Comparable<T>> int countGreater(List<T> list, T value) {
        int count = 0;
        for (T box : list) {
            if (box.compareTo(value) > 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = Integer.parseInt(sc.nextLine());

        List<Double> boxes = new ArrayList<>();
        for (int i = 0; i < lines; i++) {
            String input = sc.nextLine();
            try {
                CountMethodDoubles<Double> box = new CountMethodDoubles<>(Double.parseDouble(input));
                boxes.add(box.getValue());
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid comparable type.");
            }
        }

        Double numToCompare = Double.parseDouble(sc.nextLine());

        try {

            int count = countGreater(boxes, numToCompare);
            System.out.println(count);
        } catch (Exception e) {
            System.out.println("Invalid comparison value. Please enter a valid comparable type.");
        }
        sc.close();


    }


}
