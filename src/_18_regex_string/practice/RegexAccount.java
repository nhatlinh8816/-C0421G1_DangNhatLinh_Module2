package _18_regex_string.practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexAccount {
    public static Scanner scanner = new Scanner(System.in);
    public static final String REGEX_ACCOUNT = "^\\w{6,}$";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX_ACCOUNT);
        System.out.println("Nhập tên account");
        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()){
            System.out.println("account "+input +" hợp lệ");
        }else {
            System.out.println("account "+input +" không hợp lệ");
        }
    }
}
