package _07_abtract_interFace.exercise;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10,12);
        System.out.println(rectangle1);
        rectangle1.resize(20);
        System.out.println(rectangle1);
    }
}
