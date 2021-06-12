package _07_abtract_interFace.practice;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chiken: Ò ó o ò";
    }

    @Override
    public String howToEat() {
        return "Cooking";
    }
}
