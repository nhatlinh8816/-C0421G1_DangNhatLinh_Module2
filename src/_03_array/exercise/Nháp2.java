package _03_array.exercise;

public class Nháp2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length-1; i++) {
            array[i] = array[i + 1];
        }
        array[4] = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
