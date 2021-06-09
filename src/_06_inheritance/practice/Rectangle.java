package _06_inheritance.practice;

public class Rectangle extends Shape {
    double width;
    double length;
    public Rectangle(){
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return"A Rectangle with width is "+ this.width+ " length is "+ this.length+" with " + super.toString();
    }
    //test
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(2.5,5);
        System.out.println(rectangle2);
        Rectangle rectangle3 = new Rectangle("blue",true,2.5,5);
        System.out.println(rectangle3);
    }
}
