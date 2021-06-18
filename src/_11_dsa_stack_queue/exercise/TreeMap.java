package _11_dsa_stack_queue.exercise;

import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        String string = "a b  a";
        String string1 = string.toLowerCase();
        System.out.println(string1);
        String[]word = string1.split(" ");
        for (String w:word){
            System.out.println(w);
        }
        Map<String,Integer>map = new java.util.TreeMap<String,Integer>();

        for(int i = 0; i<word.length;i++){
            if (word[i].equals("")) {
                continue;
            }else {
                if (!map.containsKey(word[i])) {
                    map.put(word[i], 1);
                } else {
                    int a = map.get(word[i]) + 1;
                    map.put(word[i], a);
                }
            }
        }
        System.out.println(map);
    }
}

