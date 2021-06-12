package _07_abtract_interFace.exercise;

public class TestAbtractColorable {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Rectangle(10, 12);
        shapes[2] = new Square1(15);
        for (Shape shape: shapes) {
            System.out.println(shape);
            if (shape instanceof Square1){
                Colorable colorable = (Square1) shape;
                colorable.howToColor();
            }
        }

    }
}
