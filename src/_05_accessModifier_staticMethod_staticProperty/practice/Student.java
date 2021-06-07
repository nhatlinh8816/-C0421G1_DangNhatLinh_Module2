package _05_accessModifier_staticMethod_staticProperty.practice;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    //contructor:
    Student(int r, String n){
        rollno = r;
        name = n;
    }
    //phương thức thay đổi giá trị biến static
    static void change(){
        college = "CODEGYM";
    }
    //phương thức hiển thị giá trị:
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
