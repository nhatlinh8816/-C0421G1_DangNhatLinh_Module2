package _2_java_loop.exercise;

public class First20Prime {
    public static void main(String[] args) {
    }
    public static void checkPrime(int number){
        int count = 0;
        int countPrime = 0;
        if (number<2){
            System.out.println(number+" is not prime");
        } else{
            for (int i=1;i<=number;i++){
                count++;
            }
           if (count==2){
               System.out.println(number);
               countPrime++;
           }
        }
    }
}
