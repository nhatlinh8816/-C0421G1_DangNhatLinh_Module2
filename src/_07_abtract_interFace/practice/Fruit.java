package _07_abtract_interFace.practice;

public class Fruit implements Edible {
    @Override
    public String howToEat() {
        return "peeling ";
    }
}
