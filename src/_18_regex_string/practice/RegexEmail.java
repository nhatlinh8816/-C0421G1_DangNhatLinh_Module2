package _18_regex_string.practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmail {
    public static Scanner scanner = new Scanner(System.in);
    public static final String REGEX_EMAIL = "^\\w+@\\w+(\\.\\w+){1,2}$";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX_EMAIL);
        System.out.println("Nhập địa chỉ email");
        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()){
            System.out.println("địa chỉ email "+input +" hợp lệ");
        }else {
            System.out.println("địa chỉ email "+input +" không hợp lệ");
        }
    }
}
