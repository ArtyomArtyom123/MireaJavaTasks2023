// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0,10,10,0, 1,1);
        System.out.println(rectangle.toString());
        System.out.println(rectangle.getX());
        System.out.println(rectangle.getY());
        rectangle.moveUp(7);
        rectangle.moveRight(6);
        rectangle.setXSpeed(5);
        rectangle.setYSpeed(3);
        System.out.println(rectangle.toString());
        System.out.println(rectangle.getX());
        System.out.println(rectangle.getY());
    }
}