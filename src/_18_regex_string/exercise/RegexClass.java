package _18_regex_string.exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass {
    public static Scanner scanner = new Scanner(System.in);
    public static final String REGEX_CLASS = "^[S][V][H][O][-]\\d{4}$";
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX_CLASS);
        System.out.println("Nhập tên lớp học");
        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()){
            System.out.println("lớp học "+input +" hợp lệ");
        }else {
            System.out.println("lớp học "+input +" không hợp lệ");
        }
    }
}
