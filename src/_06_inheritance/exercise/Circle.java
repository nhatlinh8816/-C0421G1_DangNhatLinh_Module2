package _06_inheritance.exercise;

public class Circle {
    double radius;
    String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public Circle(){
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + getArea()  +
                '}';
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(10,"Green");
        System.out.println(circle1);

    }
}

