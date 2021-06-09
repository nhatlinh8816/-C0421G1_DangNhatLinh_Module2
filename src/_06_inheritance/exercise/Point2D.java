package _06_inheritance.exercise;

public class Point2D {
    float x = 0.0f;
    float y = 0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float[]array = {x,y};
        return array;
    }

    @Override
    public String toString() {
        return "Point2D "+ "("+x+","+y+")";
    }

    public static void main(String[] args) {
        Point2D point2D1 = new Point2D(4,5);
        System.out.println(point2D1);
        float []array = point2D1.getXY();
        for (int i =0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }

}
