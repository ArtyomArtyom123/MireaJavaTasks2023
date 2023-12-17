import java.util.Iterator;
import java.util.NoSuchElementException;

public class ForwardList<T> {

    private class Node{
        T value;
        Node next;
        Node(T value, Node next){
            this(value);
            this.next = next;
        }
        Node(T value){
            this.value = value;
        }
    }
    private Node root;
    private int sz;
    ForwardList(){
        root = null;
        sz = 0;
    }
    public class Iterator implements java.util.Iterator<T> {
        private Node node;
        Iterator(Node node){
            this.node = node;
        }
        public boolean hasNext(){
            return node != null;
        }
        public T next() throws NoSuchElementException {
            if (node == null) throw new NoSuchElementException();
            Node copy = node;
            node = node.next;
            return copy.value;
        }
        public void removeNext(){
            if (node != null) {
                node.next = node.next.next;
                --sz;
            }
            else{
                throw new NoSuchElementException();
            }
        }
    }
    public Iterator begin() {
        return new Iterator(root);
    }
    public void push_front(T value){
        if (value == null) throw new NullPointerException();
        root = new Node(value, root);
        ++sz;
    }
    public void pop_front(){
        if (root == null) throw new NoSuchElementException("Forward list is empty already!");
        root = root.next;
        --sz;
    }
    public void insert(int index, T value){
        if (value == null) throw new NullPointerException();
        if (index == 0){
            push_front(value);
        }
        else if (index > 0 && index <= sz){
            Node prev = root;
            int i = 1;
            while (i != index){
                prev = prev.next;
                ++i;
            }
            prev.next = new Node(value, prev.next);
            ++sz;
        }
        else throw new IndexOutOfBoundsException();
    }
    public void erase(int index){
        if (index == 0){
            pop_front();
        }
        else if (index > 0 && index < sz){
            Node prev = root;
            int i = 1;
            while (i != index){
                prev = prev.next;
                ++i;
            }
            prev.next = prev.next.next;
            --sz;
        }
        else throw new IndexOutOfBoundsException();
    }

    public T at(int index){
        if (index >=0 && index < sz){
            int i = 0;
            Node node = root;
            while (i != index){
                node = node.next;
                ++i;
            }
            return node.value;
        }
        else throw new IndexOutOfBoundsException();
    }

    public void clear(){
        root = null;
        sz = 0;
    }
    public boolean isEmpty(){
        return sz == 0;
    }

    public int size(){
        return sz;
    }

}
