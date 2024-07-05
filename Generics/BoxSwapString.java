import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoxSwapString<T>{
    private T value;

    public BoxSwapString(T value) {
        this.value = value;
    }

    @Override
    public String toString() {

        return (value.getClass().getName() + ": " + value);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = Integer.parseInt(sc.nextLine());

        List<String> boxes = new ArrayList<>();

        for (int i = 0; i < lines; i++) {
            boxes.add(sc.nextLine());
        }

        String []indices = sc.nextLine().split(" ");
        int index = Integer.parseInt(indices[0]);
        int index2 =  Integer.parseInt(indices[1]);
        sc.close();

        swap(boxes, index, index2);

        for (String box : boxes){
            System.out.println(box);
        }


    }
    public static <T> void swap(List<T> list, int index, int index2){
        T temp = list.get(index);
        list.set(index, list.get(index2));
        list.set(index2, temp);
    }

}
