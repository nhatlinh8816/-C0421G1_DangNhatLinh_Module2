package _15_exception.exercise;

public class IllegalTriangleExceptionCase1 extends Exception {
    @Override
    public String getMessage() {
        return "cạnh tam giác không được nhỏ hơn 0 ";
    }

    public IllegalTriangleExceptionCase1(String message) {

        super(message);
    }

    public IllegalTriangleExceptionCase1() {
    }

}
