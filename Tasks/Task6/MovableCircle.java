public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.radius = radius;
        center = new MovablePoint(x,y,xSpeed,ySpeed);
    }
    @Override
    public String toString(){
        return String.format("MovableCircle\nradius: %d\nx: %d\ny: %d\nxSpeed: %d\nySpeed: %d",
                radius,center.getX(),center.getY(),center.getXSpeed(),center.getYSpeed());
    }
    @Override
    public void moveUp(int d){
        center.moveUp(d);
    }
    @Override
    public void moveDown(int d){
        center.moveDown(d);
    }
    @Override
    public void moveLeft(int d){
        center.moveLeft(d);
    }
    @Override
    public void moveRight(int d){
        center.moveRight(d);
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    public int getX(){
        return center.getX();
    }
    public int getY(){
        return center.getY();
    }
    @Override
    public void setXSpeed(int speed){
        center.setXSpeed(speed);
    }
    @Override
    public void setYSpeed(int speed){
        center.setYSpeed(speed);
    }
    @Override
    public int getXSpeed(){
        return center.getXSpeed();
    }
    @Override
    public int getYSpeed(){
        return center.getYSpeed();
    }
}
