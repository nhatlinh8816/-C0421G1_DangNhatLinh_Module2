package _05_accessModifier_staticMethod_staticProperty.excercise;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle(){
    }
    public Circle(double r){
        radius = r;
    }
    public double getRadius(){
        return radius;
    }
//    private double getRadius(){
//        return radius;
//    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
//    private double getArea(){
//        return radius*radius*Math.PI;
//    }
}
