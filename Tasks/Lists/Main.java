import java.util.Iterator;
import java.util.LinkedList;
public class Main {
    public static void f(Iterator<Student> iter){
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }
    public static void main(String[] args) {
        ForwardList<Student> fw = new ForwardList<>();
        fw.push_front(new Student("Ivan", 18));
        fw.push_front(new Student("Oleg", 19));
        fw.push_front(new Student("Arkady", 20));
        fw.insert(1,new Student("Andrey", 21));
        for (int i = 0; i != fw.size(); ++i){
            System.out.println(fw.at(i).toString());
        }
        fw.erase(3);
        System.out.println();
        ForwardList<Student>.Iterator iterator = fw.begin();
        f(iterator);
        MyList<Integer> myList = new MyList<>();
        myList.push_back(12);
        MyList<Integer>.Iterator it = myList.begin();
        System.out.println(it.next());
        System.out.println(it.prev());
    }
}