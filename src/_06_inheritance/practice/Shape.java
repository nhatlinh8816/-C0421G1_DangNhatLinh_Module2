package _06_inheritance.practice;

public class Shape {
    String color;
    boolean filled;
    public Shape(){
        this.color = "green";
        this.filled = true;
    }
    public Shape(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public String toString(){
        return "a Shape with color of "+ color +" and "+ (isFilled() ? "filled" : "not filled");
    }

    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1.toString());
        Shape shape2 = new Shape("red",false);
        System.out.println(shape2.toString());
    }
}



