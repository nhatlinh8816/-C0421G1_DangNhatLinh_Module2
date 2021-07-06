package _case_Study.Exception;

import java.util.Scanner;

public class Choice {
    public Scanner input = new Scanner(System.in);
    public Integer choiceInteger(){
        int choice = 0;
        try {
            choice = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println("Vui lòng nhập giá trị số nguyên");
        }
        return choice;
    }
    public Float choiceFloat(){
        float choice = 0;
        try {
            choice = Float.parseFloat(input.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println("Vui lòng nhập giá trị số thực");
        }
        return choice;
    }
}
