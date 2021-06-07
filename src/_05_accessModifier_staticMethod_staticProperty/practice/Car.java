package _05_accessModifier_staticMethod_staticProperty.practice;

public class Car {
    private String name;        //thuộc tính name của class Car
    private String engine;       //thuộc tính engine của class Car
    public static int numberOfCar;
    // contructor (khởi tạo các đối tượng của class)
    public Car(String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCar++;
    }
    public int setNumberOfCar(){
        return numberOfCar;
    }
    public int getNumberOfCar(){
        return numberOfCar;
    }
}
