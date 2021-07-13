package finalExamModule2.utils;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckSpace {
    public Scanner input(){
        Scanner scanner = new Scanner(System.in);
        return scanner;
    }
    public String inputString(){
        String text = null;
        String regexCheck = "^\\w+$";
        boolean check = true;
        while (check){
            text =  new CheckSpace().input().nextLine();
            if (Pattern.matches(regexCheck, text)) {
                check = false;
            }else {
                System.out.println("Chưa có giá trị. Vui lòng nhập lại");
            }
        }
        return text;
    }
}
