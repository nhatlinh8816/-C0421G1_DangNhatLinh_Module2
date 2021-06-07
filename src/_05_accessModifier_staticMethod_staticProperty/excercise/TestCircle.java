package _05_accessModifier_staticMethod_staticProperty.excercise;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());
    }
}
