import java.util.ArrayList;

public class ArrayQueue<T> implements Queue<T> {
    private final int N = 100;
    private ArrayList<T> elements;
    ArrayQueue(){
        elements = new ArrayList<>(N);
    }
    @Override
    public void enqueue(T value){
        if (isFull()) throw new RuntimeException("Queue is already full!");
        else if (value == null) throw new NullPointerException();
        else elements.add(value);
    }
    @Override
    public T dequeue(){
        if (isEmpty()) throw new RuntimeException("Queue is already empty!");
        else  return elements.removeFirst();
    }
    @Override
    public T peek(){
        if (isEmpty()) throw new RuntimeException("Queue is empty!");
        else return elements.getLast();
    }
    @Override
    public T get(int index){
        if (index < 0 || index >= elements.size()){
            throw new IndexOutOfBoundsException();
        }
        return elements.get(index);
    }
    @Override
    public boolean isEmpty(){
        return elements.isEmpty();
    }
    @Override
    public boolean isFull(){
        return elements.size() == N;
    }
    public int size(){
        return elements.size();
    }
}
