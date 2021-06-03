package _2_java_loop.exercise;

public class PrimeUnder100 {
    public static void main(String[] args) {
        int number = 1;
        while (number<100) {
            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(number);
            }
            number++;
        }
    }
}