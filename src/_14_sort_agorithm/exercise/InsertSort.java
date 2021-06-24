package _14_sort_agorithm.exercise;

import java.util.Scanner;

public class InsertSort {
    private static int[]list = {2,1,4,6,8,3};
    public static void main(String[] args) {
        new InsertSort().insertionSort(list);
    for (int value: list){
        System.out.print(value+" ");
    }

    }
    public void insertionSort(int[] array){
      for (int i = 1; i<array.length;i++){
          int nowElement = array[i];
          int index;
          for (index = i-1;index>=0&&array[index]>nowElement;index-- ){
              array[index+1] = array[index];
          }
          array[index+1] = nowElement;
      }
    }
    }



