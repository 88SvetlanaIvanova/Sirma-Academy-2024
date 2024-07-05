import java.util.ArrayList;
import java.util.List;

public class Jar <T>{
    private List<T> elements = new ArrayList<>();

    public void add(T el){
        elements.add(el);
    }
    public T remove(){
        if(!elements.isEmpty()){
            return elements.removeLast();
        }
        throw new IllegalStateException("The Jar is empty.");
    }
}
