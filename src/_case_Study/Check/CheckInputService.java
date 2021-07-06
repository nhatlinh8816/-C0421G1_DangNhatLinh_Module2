package _case_Study.Check;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckInputService {
    public boolean checkVilla(String input){
        boolean check = false;
        final String REGEX_VILLA = "^[S][V][V][L][-]\\d{4}$";
        Pattern pattern = Pattern.compile(REGEX_VILLA);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()){
            check = true;
        }
        return check;
    }
    public boolean checkHouse(String input){
        boolean check = false;
        final String REGEX_HOUSE = "^[S][V][H][0][-]\\d{4}$";
        Pattern pattern = Pattern.compile(REGEX_HOUSE);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()){
            check = true;
        }
        return check;
    }
    public boolean checkRoom(String input){
        boolean check = false;
        final String REGEX_ROOM = "^[S][V][R][O][-]\\d{4}$";
        Pattern pattern = Pattern.compile(REGEX_ROOM);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()){
            check = true;
        }
        return check;
    }
    public boolean checkTypeOfRent(String input){
        boolean check = false;
        final String REGEX_TYPE_DAY = "^[D][A][Y][-]\\d{4}$";
        final String REGEX_TYPE_MONTH = "^[M][O][N][-]\\d{4}$";
        final String REGEX_TYPE_YEAR = "^[Y][E][A][-]\\d{4}$";
        final String REGEX_TYPE_HOUR = "^[H][O][U][-]\\d{4}$";
        Pattern pattern = Pattern.compile(REGEX_TYPE_DAY);
        Pattern pattern1 = Pattern.compile(REGEX_TYPE_MONTH);
        Pattern pattern2 = Pattern.compile(REGEX_TYPE_YEAR);
        Pattern pattern3 = Pattern.compile(REGEX_TYPE_HOUR);
        Matcher matcher = pattern.matcher(input);
        Matcher matcher1 = pattern1.matcher(input);
        Matcher matcher2 = pattern2.matcher(input);
        Matcher matcher3 = pattern3.matcher(input);
        if (matcher.matches()||matcher1.matches()||matcher2.matches()||matcher3.matches()){
            check = true;
        }
        return check;
    }
    public boolean checkStandardVilla(String input){
        boolean check = false;
        final String REGEX_STANDARD_VILLA = "^[S][T][V][L][-]\\d{4}$";
        Pattern pattern = Pattern.compile(REGEX_STANDARD_VILLA);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()){
            check = true;
        }
        return check;
    }
    public boolean checkStandardHouse(String input){
        boolean check = false;
        final String REGEX_STANDARD_HOUSE = "^[S][T][H][0][-]\\d{4}$";
        Pattern pattern = Pattern.compile(REGEX_STANDARD_HOUSE);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()){
            check = true;
        }
        return check;
    }
    public boolean checkStandardRoom(String input){
        boolean check = false;
        final String REGEX_STANDARD_ROOM = "^[S][T][R][0][-]\\d{4}$";
        Pattern pattern = Pattern.compile(REGEX_STANDARD_ROOM);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()){
            check = true;
        }
        return check;
    }


}
