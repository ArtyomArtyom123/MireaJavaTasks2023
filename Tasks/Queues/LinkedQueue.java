import java.util.NoSuchElementException;

public class LinkedQueue<T> implements Queue<T>{
    private final int N = 100;
    private class Node{
        public T value;
        public Node next;
        Node(T value){
            this.value = value;
            this.next = null;
        }
    }
    private Node first;
    private Node last;
    private int sz;
    LinkedQueue(){
        first = last = null;
        sz = 0;
    }
    @Override
    public void enqueue(T value){
        if (isFull()) throw new RuntimeException("Queue is already full!");
        else if (value == null) throw new NullPointerException();
        else{
            if (last == null){
                first = last = new Node(value);
                first.next = first;
            }
            else{
                Node new_node = new Node(value);
                new_node.next = first;
                last.next = new_node;
                last = last.next;
            }
            ++sz;
        }
    }

    @Override
    public T dequeue() {
        if (isEmpty()) throw new RuntimeException("Queue is already empty!");
        T deleted = first.value;
        first = first.next;
        --sz;
        if (isEmpty()){
            first = last = null;
        }
        return deleted;
    }

    @Override
    public T peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty!");
        return last.value;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= sz) throw new IndexOutOfBoundsException();
        Node node = first;
        for(int i = 0; i < index; ++i){
            node = node.next;
        }
        return node.value;
    }

    @Override
    public boolean isEmpty() {
        return sz == 0;
    }

    @Override
    public boolean isFull() {
        return sz == N;
    }
    public int size(){
        return sz;
    }
}
