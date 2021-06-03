package _01_introduction_to_java.practice;

public class Nháp {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        for (int i = 1; i<arr.length;i++){
            arr[i]= arr[i-1];
        }
        for (int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
