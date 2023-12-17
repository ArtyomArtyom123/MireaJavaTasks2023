public class ShapeTester {
    static public void main(String[] args){
        Shape shape = new Circle(10, "Red");
        System.out.println(shape.toString());
        System.out.println();
        Shape shape1 = new Triangle(2,3,4);
        System.out.println(shape1.toString());
        System.out.println();
        Shape shape2 = new Square(5, "Yellow");
        System.out.println(shape2.toString() + "\n" + shape2.getColor());
    }
}
