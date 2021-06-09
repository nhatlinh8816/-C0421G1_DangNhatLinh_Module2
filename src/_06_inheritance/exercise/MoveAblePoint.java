package _06_inheritance.exercise;

public class MoveAblePoint extends Point {
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveAblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveAblePoint(){
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }


    @Override
    public String toString() {
        return "("+x+","+y+")"+"speed"+"("+this.xSpeed+","+this.ySpeed+")";
    }
    public MoveAblePoint move() {
        this.setX(this.getX() + this.xSpeed);
        this.setY(this.getY() + this.ySpeed);
        return this;
    }

    public static void main(String[] args) {
        MoveAblePoint move1 = new MoveAblePoint(1,1);
        System.out.println(move1.move());
    }

}
