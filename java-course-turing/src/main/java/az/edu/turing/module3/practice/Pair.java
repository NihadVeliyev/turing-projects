package az.edu.turing.module3.practice;

public class Pair<T> {
    private T first;

    public Pair(T first){
        this.first=first;


    }

    public T getFirst() {
        return first;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +

                '}';
    }
    public  <T> void printer(T first){
        System.out.println(first);
    }
}
