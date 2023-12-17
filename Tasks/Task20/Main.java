// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       SomeClass<Integer, Double, String> sc = new SomeClass<>(1,2.55, "Dog");
       sc.getTypenameT();
       sc.getTypenameV();
       sc.getTypenameK();

       Integer[] x = {1,2,-3,78,9};
       MinMax<Integer> minMax = new MinMax<>(x);
       System.out.println(minMax.getMax());
       System.out.println(minMax.getMin());
       Byte b = 1;
       System.out.println(Calculator.sum(1,b));

    }
}