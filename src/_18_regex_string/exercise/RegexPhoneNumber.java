package _18_regex_string.exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPhoneNumber {
    public static Scanner scanner = new Scanner(System.in);
    public static final String REGEX_PHONE_NUMBER = "^\\(\\d{2}\\)\\-\\(0\\d{9}\\)$";
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX_PHONE_NUMBER);
        System.out.println("Nhập số điện thoại");
        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()){
            System.out.println("số điện thoại "+input +" hợp lệ");
        }else {
            System.out.println("số điện thoại "+input +" không hợp lệ");
        }
    }
}
