package _11_dsa_stack_queue.exercise;

import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        String string = "Hứa thật nhiều thất hứa thật nhiều nhiều hứa";
        String string1 = string.toLowerCase();
        System.out.println(string1);
        String[]word = string1.split(" ");
        Map<String,Integer>map = new java.util.TreeMap<String,Integer>();
        for(int i = 0; i<word.length;i++){
            if (!map.containsKey(word[i])){
                map.put(word[i],1);
            }else {
                int a = map.get(word[i])+1;
                map.put(word[i],a);
            }
        }
        System.out.println(map);
    }
}

