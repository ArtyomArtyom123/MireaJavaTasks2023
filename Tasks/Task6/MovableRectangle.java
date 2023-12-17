public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint topRight;
    MovableRectangle(int x1,int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        topRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }
    @Override
    public String toString(){
        return String.format("Rectangle\nx1 = %d, y1 = %d\nx2 = %d, y2 = %d\nxSpeed: %d\nySpeed: %d\n",
                topLeft.getX(),topLeft.getY(),topRight.getX(),topRight.getY(),
                topLeft.getXSpeed(), topLeft.getYSpeed());
    }
    @Override
    public void moveUp(int d){
        topLeft.moveUp(d);
        topRight.moveUp(d);
    }
    @Override
    public void moveDown(int d){
        topLeft.moveDown(d);
        topRight.moveDown(d);
    }
    @Override
    public void moveRight(int d){
        topLeft.moveRight(d);
        topRight.moveRight(d);
    }
    @Override
    public void moveLeft(int d){
        topLeft.moveLeft(d);
        topRight.moveLeft(d);
    }
    public float getX(){
        return (topLeft.getX() + topRight.getX())/2.0f;
    }
    public float getY(){
        return (topLeft.getY() + topRight.getY())/2.0f;
    }
    @Override
    public void setXSpeed(int speed){
        topLeft.setXSpeed(speed);
        topRight.setXSpeed(speed);
    }
    @Override
    public void setYSpeed(int speed){
        topLeft.setYSpeed(speed);
        topRight.setYSpeed(speed);
    }
    @Override
    public int getXSpeed(){
        return topLeft.getXSpeed();
    }
    @Override
    public int getYSpeed(){
        return topLeft.getYSpeed();
    }
}
