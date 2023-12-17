import java.io.Serializable;

public class SomeClass<T extends Comparable<T>,V extends Serializable,K> {
    private T valueT;
    private V valueV;
    private K valueK;
    SomeClass(T valueT, V valueV, K valueK){
        this.valueT = valueT;
        this.valueV = valueV;
        this.valueK = valueK;
    }
    public T getValueT(){
        return valueT;
    }
    public V getValueV(){
        return valueV;
    }
    public K getValueK(){
        return valueK;
    }
    public void getTypenameT(){
        System.out.println(valueT.getClass().getName());
    }
    public void getTypenameV(){
        System.out.println(valueV.getClass().getName());
    }
    public void getTypenameK(){
        System.out.println(valueK.getClass().getName());
    }
}
