package _05_accessModifier_staticMethod_staticProperty.practice;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota","Robocon");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("Huyndai","Robocon1");
        System.out.println(Car.numberOfCar);
    }
}
