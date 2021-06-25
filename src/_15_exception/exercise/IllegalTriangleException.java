package _15_exception.exercise;

public class IllegalTriangleException extends Exception {
    @Override
    public String getMessage() {
        return "cạnh tam giác không được nhỏ hơn 0 và tổng độ dài 2 cạnh phải lớn hơn cạnh còn lại";
    }

    public IllegalTriangleException(String message) {

        super(message);
    }

    public IllegalTriangleException() {
    }
}
