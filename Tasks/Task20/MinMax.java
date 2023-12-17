public class MinMax<E extends Comparable<E>> {
    private E[] arr;
    MinMax(E[] arr){
        this.arr = arr;
    }
    public E getMax(){
        if (arr.length == 0) return null;
        E max = arr[0];
        for (int i = 1; i != arr.length; ++i){
            if (arr[i].compareTo(max) > 0){
                max = arr[i];
            }
        }
        return max;
    }
    public E getMin(){
        if (arr.length == 0) return null;
        E min = arr[0];
        for (int i = 1; i != arr.length; ++i){
            if (arr[i].compareTo(min) < 0){
                min = arr[i];
            }
        }
        return min;
    }

}
