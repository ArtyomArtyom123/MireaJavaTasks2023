public abstract class Shape {
    public abstract String getType();
    public abstract double getArea();
    public abstract double getPerimeter();
    protected String color;
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    @Override
    public String toString(){
        return "Shape";
    }
    Shape(){
        color = "Black";
    }
    Shape(String color){
        this.color = color;
    }
}

class Circle extends Shape{
    @Override
    public String getType(){
        return "Circle";
    }
    private double radius;
    public double getRadius() {return radius;}
    public void setRadius(double radius) {this.radius = radius;}
    @Override
    public double getArea(){
        return Math.pow(radius, 2) * Math.PI;
    }
    @Override
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString(){
        return String.format("Circle\nradius = %f\nArea = %.2f\nPerimeter = %.2f",
                radius, getArea(),getPerimeter());
    }
    Circle(double radius, String color){
        super(color);
        this.radius = radius;
    }
    Circle(double radius){
        super();
        this.radius = radius;
    }
    Circle(){
        super();
        radius = 0;
    }
}

class Triangle extends Shape{
    @Override
    public String getType(){
        return "Rectangle";
    }
    private double a;
    private double b;
    private double c;
    public void setSides(double a, double b, double c){
        if (a + b <= c || a + c <= b || b + c <= a){
            System.out.println("Wrong values!");
            return;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double[] getSides(){
        return new double[] {a,b,c};
    }
    @Override
    public double getPerimeter(){
        return a + b + c;
    }
    @Override
    public double getArea(){
        double hp = getPerimeter() / 2.0;
        return Math.sqrt(hp*(hp-a)*(hp-b)*(hp-c));
    }
    @Override
    public String toString(){
        return String.format("Triangle\na = %f\nb = %f\nc = %f\nArea = %.2f\nPerimeter = %.2f",
                a,b,c, getArea(),getPerimeter());
    }
    Triangle (double a, double b, double c, String color){
        super(color);
        if (a + b <= c || a + c <= b || b + c <= a)  a = b = c = 0;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    Triangle(double a, double b, double c){
        super();
        if (a + b <= c || a + c <= b || b + c <= a)  a = b = c = 0;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    Triangle()
    {
        super();
        a = 0;
        b = 0;
        c = 0;
    }
}

class Square extends Shape{
    @Override
    public String getType(){
        return "Square";
    }
    private double side;
    public void setSide(double side) {this.side = side;}
    public double getSide() {return side;}
    @Override
    public double getArea(){
        return Math.pow(side, 2);
    }
    @Override
    public double getPerimeter(){
        return 4*side;
    }
    @Override
    public String toString(){
        return String.format("Square\nside = %f\nArea = %.2f\nPerimeter = %.2f",
                side, getArea(),getPerimeter());
    }
    Square(double side, String color){
        super(color);
        this.side = side;
    }
    Square(double side){
        super();
        this.side = side;
    }
    Square(){
        super();
        side = 0;
    }
}
