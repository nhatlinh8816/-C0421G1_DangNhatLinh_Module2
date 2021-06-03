package _2_java_loop.exercise;

public class First20Prime {
    public static void main(String[] args) {
        int number = 1;
        int countPrime = 0;
          while (true){
              int count = 0;
              for (int i = 1;i<=number;i++) {
                  if (number%i == 0) {
                      count++;
                  }
              }
                  if (count==2){
                      System.out.println(number);
                      countPrime++;
                  }
                  if (countPrime==20){
                      break;
                  }
                  number++;
              }
          }
    }
