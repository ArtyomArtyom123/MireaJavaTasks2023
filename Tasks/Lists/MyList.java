import java.util.NoSuchElementException;

public class MyList<T> {
    private class Node{
        T value;
        Node  next;
        Node prev;
        Node(T value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
        Node(){
            value = null;
            next = this;
            prev = this;
        }
    }
    private Node fake;
    private int sz;
    MyList(){
        fake = new Node();
        sz = 0;
    }
    public class Iterator implements java.util.Iterator<T>{
        private Node node;
        Iterator(Node node){
            this.node = node;
        }
        public boolean hasNext(){
            return node.next != fake;
        }
        public boolean hasPrev(){
            return node.prev != fake && node != fake;
        }
        public T next() throws NoSuchElementException {
            if (node.next == fake) throw new NoSuchElementException();
            node = node.next;
            return node.value;
        }
        public T prev() throws NoSuchElementException {
            if (node.prev == fake || node == fake) throw new NoSuchElementException();
            node = node.prev;
            return node.value;
        }

    }
    public Iterator begin(){
        return new Iterator(fake);
    }

    public void push_back(T value){
        if (value == null) throw new NullPointerException();
        Node node = new Node(value, fake.prev, fake);
        fake.prev.next = node;
        fake.prev = node;
        ++sz;
    }
    public void push_front(T value){
        if (value == null) throw new NullPointerException();
        Node node = new Node(value, fake, fake.next);
        fake.next.prev = node;
        fake.next = node;
        ++sz;
    }
    public void insert(int index, T value){
        if (value == null) throw new NullPointerException();
        if (index >= 0 && index <= sz) {
            int i;
            Node node;
            if (index < sz / 2) {
                i = 0;
                node = fake.next;
                while (i != index) {
                    node = node.next;
                    ++i;
                }
            }
            else {
                i = sz;
                node = fake;
                while (i != index) {
                    node = node.prev;
                    --i;
                }
            }
            Node new_node = new Node(value, node.prev, node);
            node.prev.next = new_node;
            node.prev = new_node;
            ++sz;
        }
        else throw new IndexOutOfBoundsException();
    }

    public void pop_back(){
        if (sz != 0) {
            Node del = fake.prev;
            del.prev.next = fake;
            fake.prev = del.prev;
            --sz;
        }
        else throw new NoSuchElementException("List is already empty!");
    }
    public void pop_front(){
        if (sz != 0) {
            Node del = fake.next;
            del.next.prev = fake;
            fake.next = del.next;
            --sz;
        }
        else throw new NoSuchElementException("List is already empty!");
    }
    public void erase(int index){
        if (index >= 0 && index < sz) {
            int i;
            Node node;
            if (index < sz / 2) {
                i = 0;
                node = fake.next;
                while (i != index) {
                    node = node.next;
                    ++i;
                }
            }
            else
            {
                i = sz - 1;
                node = fake;
                while (i != index) {
                    node = node.prev;
                    --i;
                }
            }
            node.next.prev = node.prev;
            node.prev.next = node.next;
            --sz;
        }
        else throw new NoSuchElementException("List is already empty!");
    }

    public T at(int index){
        if (index >= 0 && index < sz) {
            int i;
            Node node;
            if (index < sz / 2) {
                i = 0;
                node = fake.next;
                while (i != index) {
                    node = node.next;
                    ++i;
                }
            }
            else
            {
                i = sz - 1;
                node = fake;
                while (i != index) {
                    node = node.prev;
                    --i;
                }
            }
            return node.value;
        }
        else throw new NoSuchElementException("List is already empty!");
    }

    public int size(){
        return sz;
    }
    public void clear(){
        fake.next = null;
        fake.prev = null;
        sz = 0;
    }
    public boolean isEmpty(){
        return sz == 0;
    }

}
