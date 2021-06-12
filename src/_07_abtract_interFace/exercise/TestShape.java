package _07_abtract_interFace.exercise;

public class TestShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(10, 12);
        shapes[2] = new Square(15);
        System.out.println("Trước khi resize");
        for (int i = 0 ; i < 3; i++) {
            System.out.println(shapes[i]);
        }
        for (int i = 0; i < 3; i++) {
            shapes[i].resize(Math.random() * 100);
        }
        System.out.println("Sau khi resize");
        for (int i = 0 ; i < 3; i++) {
            System.out.println(shapes[i]);
        }
    }
}
