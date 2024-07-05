import java.util.ArrayList;
import java.util.Comparator;

public class CustomList <T extends Comparable<T>>{
    private ArrayList<T> list;

    public CustomList(){
        list = new ArrayList<>();
    }
    public void add(T element) {
        list.add(element);
    }

    public T remove(int index) {
        return list.remove(index);
    }

    public boolean contains(T element) {
        return list.contains(element);
    }

    public void swap(int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
    public int countGreaterThan(T element){
        int count = 0;
        for (T item: list) {
            if (item.compareTo(element) > 0){
                count++;
            }
        }
        return count;
    }

    public T getMax() {
        return list.stream().max(Comparator.naturalOrder()).orElse(null);
    }
    public T getMin() {
        return list.stream().min(Comparator.naturalOrder()).orElse(null);
    }
    public void print() {
        for (T item : list) {
            System.out.println(item);
        }
    }

}
