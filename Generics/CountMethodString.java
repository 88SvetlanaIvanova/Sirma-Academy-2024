import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CountMethodString<T extends Comparable<T>>{


    private T value;

    @SuppressWarnings("unchecked")
    public CountMethodString(T value) {
        this.value = (T) value;
    }

    public T getValue() {
        return value;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass()!= obj.getClass()) return false;
        CountMethodString<?> box = (CountMethodString<?>) obj;
        return Objects.equals(value, box.value);
    }
    @Override
    public int hashCode(){
        return Objects.hash(value);
    }
    @Override
    public String toString() {
        return (value.getClass().getName() + ": " + value);
    }

    public static <T extends Comparable<T>> int countGreater (List<CountMethodString<T>> list, T value){
        int count = 0;
        for (CountMethodString<T> box : list) {
            if (box.getValue().compareTo(value) > 0){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = Integer.parseInt(sc.nextLine());

        List<CountMethodString<String>> boxes = new ArrayList<>();
        for (int i = 0; i < lines; i++) {
            String input = sc.nextLine();
            try {
                CountMethodString<String> box = new CountMethodString<>(input);
                boxes.add(box);
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid comparable type.");
            }
        }

        String lettersToCompare = sc.nextLine();

        try {

            int count = countGreater(boxes, lettersToCompare);
            System.out.println(count);
        } catch (Exception e) {
            System.out.println("Invalid comparison value. Please enter a valid comparable type.");
        }
        sc.close();


    }

}
