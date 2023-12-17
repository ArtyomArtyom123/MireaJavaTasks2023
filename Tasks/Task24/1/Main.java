// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ComplexAbstractFactory caf = new ConcreteFactory();
        Complex c= caf.CreateComplex(1,-2);
        System.out.println(c.toString());
    }
}