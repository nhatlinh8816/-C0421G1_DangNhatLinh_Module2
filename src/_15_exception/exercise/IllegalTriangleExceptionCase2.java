package _15_exception.exercise;

public class IllegalTriangleExceptionCase2 extends Exception {
    public IllegalTriangleExceptionCase2(String message) {
        super(message);
    }

    public IllegalTriangleExceptionCase2() {
    }

    @Override
    public String getMessage() {
        return "tổng độ dài 2 cạnh phải lớn hơn cạnh còn lại";
    }
}
