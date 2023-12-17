public interface Queue<T> {
    public void enqueue(T value);
    public T dequeue();
    public T peek();
    public T get(int index);
    public boolean isEmpty();
    public boolean isFull();
}
