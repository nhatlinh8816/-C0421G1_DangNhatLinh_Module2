package _01_introduction_to_java.practice;

public class Nháp {
    public static void main(String[] args) {
        int a = 5;
        if(a == 5) {
            ++a;
            int b = a++*5;
            System.out.println(b);
        }
        System.out.println(a);

    }
}
