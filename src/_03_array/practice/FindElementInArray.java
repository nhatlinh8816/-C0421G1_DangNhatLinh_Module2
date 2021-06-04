package _03_array.practice;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        int m;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please input array length");
            m = Integer.parseInt(scanner.nextLine());   //vì nhập số và chuỗi liên tiếp nhau từ bàn phím nên không dùng next.Int và
            // phải dùng Integer.parseInt để lấy phần nguyên.
        } while (m<=0);
        String[]array = new String[m];
        for (int i=0;i<m;i++){
            System.out.println("Please input name of student in index "+i+":");
            array[i] = scanner.nextLine();
        }
        System.out.println("Please input name of student you want to check");
        String nameOfStudent;
        nameOfStudent = scanner.nextLine();

        for (int i = 0;i<m;i++){
            if (array[i].equals(nameOfStudent)){
                System.out.println("Position of student you have input is "+(i));
            }
            }
        }
    }

