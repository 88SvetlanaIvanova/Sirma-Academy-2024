public class Scale <T extends Comparable<T>>{
    private T left;
    private T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }
    public T getHeavier(){
        int result =(right.compareTo(left));
        if (result== 0){
            return null;
        }
        else if(result>0){
            return right;
        }
        else return left;
    }
}
