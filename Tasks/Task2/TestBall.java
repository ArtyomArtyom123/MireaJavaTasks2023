import java.util.Scanner;
public class TestBall {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = 0;
        if (sc.hasNextDouble()) {
            x = sc.nextDouble();
        }
        System.out.print("Enter y: ");
        double y = 0;
        if (sc.hasNextDouble())
        {
            y = sc.nextDouble();
        }
        Ball ball = new Ball(x,y);
        ball.move(-1, -2);
        System.out.print(ball);
    }
}

class Ball
{
    private double x;
    private double y;
    Ball()
    {
        x = 0;
        y = 0;
    }
    Ball(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public double getX() {return x;}
    public double getY() {return y;}
    public void setX(double x) {this.x = x;}
    public void setY(double y) {this.y = y;}
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp, double yDisp)
    {
        x += xDisp;
        y += yDisp;
    }
    @Override
    public String toString() {return "x: " + x + ", y: " + y;}
}