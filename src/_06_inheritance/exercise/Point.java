package _06_inheritance.exercise;

public class Point {
    float x = 0.0f;
    float y = 0.0f;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
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
        return "Point "+ "("+x+","+y+")";
    }

    public static void main(String[] args) {
        Point point1 = new Point(4,5);
        System.out.println(point1);
        float []array = point1.getXY();
        for (int i =0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }
}
