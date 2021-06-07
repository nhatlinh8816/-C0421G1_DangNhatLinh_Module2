package _05_accessModifier_staticMethod_staticProperty.excercise;

public class Student {
    private String name;
    private String classes;
    public Student(){
    }
    public Student(String name,String classes){
        this.name = name;
        this.classes = classes;
    }
    public String setName(String name){
        return this.name;
    }
//    private String setName(String name){
//        return this.name;
//    }
    public String setClasses(String classes){
        return this.classes;
    }
//    private String setClasses(String classes){
//        return this.classes;
//    }
}
