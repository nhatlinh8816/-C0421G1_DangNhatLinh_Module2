package _13_search_agorithm.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class AscendingStringLargestLength {
    static Scanner input  = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Input String");
        String string = input.nextLine();
        ArrayList<Integer> array = getSymbolToAscii(string);
        ArrayList<Integer>arraySort = new ArrayList<>();
        arraySort.add(array.get(0));
        for (int i = 1;i<array.size();i++) {
            boolean isBig = false;
            for (int j=0;j<arraySort.size();j++){
                if (array.get(i)<=arraySort.get(j)){
                    isBig = false;
                    break;
                }else {
                    isBig = true;
                }
            }
            if (isBig==true){
                arraySort.add(array.get(i));
            }
        }
        for (int nums: arraySort){
            char a = (char) nums;
            System.out.print(a);
        }
    }
//phương thức chuyển đổi chữ cái của chuỗi string sang bảng chữ cái ASCII
    public static ArrayList<Integer> getSymbolToAscii(String string) {
        ArrayList<Integer>array = new ArrayList<>();
        for (int i =0; i<string.length();i++){
            char sym = string.charAt(i);
            int asciivalue1 = sym;
            array.add(asciivalue1);
        }
        return array;
    }

}
