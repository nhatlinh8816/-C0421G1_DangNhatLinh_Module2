package _05_accessModifier_staticMethod_staticProperty.excercise;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Linh", "C04");
        System.out.println(student1);
        student1.setName("Tuấn");
        student1.setClasses("C05");
    }

}

