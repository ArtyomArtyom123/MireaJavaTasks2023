public class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public String toString(){
        return String.format("Point\nx: %d\ny: %d\nxSpeed: %d\nySpeed: %d",
                x,y,xSpeed,ySpeed);
    }
    @Override
    public void moveUp(int d){
        y += d;
    }
    @Override
    public void moveDown(int d){
        y -= d;
    }
    @Override
    public void moveRight(int d){
        x += d;
    }
    @Override
    public void moveLeft(int d){
        x -= d;
    }
    @Override
    public void setXSpeed(int speed){
        xSpeed = speed;
    }
    @Override
    public void setYSpeed(int speed){
        ySpeed = speed;
    }
    @Override
    public int getXSpeed() {return xSpeed;}
    @Override
    public int getYSpeed() {return ySpeed;}
    public int getX() {return x;}
    public int getY() {return y;}
}
