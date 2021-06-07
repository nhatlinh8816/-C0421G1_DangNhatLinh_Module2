package _03_array.practice;

import java.util.Scanner;

public class ManagerStudent {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("----------Manager Student Program-----------");
        Student[]students = new Student[50];         //khởi tạo mảng danh sách sinh viên với 50 sinh viên
        int choice;
        do {
            System.out.println("Program List");
            System.out.println("1.Xem danh sách sinh viên");
            System.out.println("2.Xóa sinh viên");
            System.out.println("3.Thêm mới sinh viên");
            System.out.println("4.Chỉnh sửa thông tin sinh viên");
            System.out.println("5.Thoát chương trình");
            System.out.println("Chọn chức năng muốn sử dụng");
            choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    displayStudent(students);
                    break;
                case 2:
                    deleteStudent(students);
                    break;
                case 3:
                    creatStudent(students);
                    break;
                case 4:
                    editStudent(students);
                    break;
                case 5:
                    System.exit(5);
                    break;
            }
        } while (choice!=5);
    }
    private static void displayStudent(Student[]students) {
        for (Student student : students) {             //dùng vòng lặp for each duyệt từng phần tử
            if (student != null) {
                System.out.println(student);
            }
        }
    }
    private static void deleteStudent(Student[]students){
        int  deleteStudent = Integer.parseInt(inputOutput("Please enter id of student you want to delete"));
        for (int i = 0; i<50;i++){
            if (deleteStudent==students[i].id){
                students[i]=null;
            }
        }
    }
    private static void creatStudent(Student[]students){
        System.out.println("Input id for new student");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Input name for new student");
        String name = input.nextLine();
        System.out.println("Input age for new student");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("Input adress for new student");
        String address = input.nextLine();
        Student newStudent = new Student (id,name,age,address);
        for (int i =0;i<students.length;i++){
            if (students[i]==null){         //nếu phần tử thuộc mảng đang rỗng thì sẽ thêm giá trị mới vào
                students[i] = newStudent;
                break;
            }
        }
    }
    private static String inputOutput(String message){
        System.out.println(message);
        String output = input.nextLine();
        return output;
    }

    private static void editStudent(Student[]students){
        System.out.println("Please input id of students you want to edit");
        int idCurrentStudent = input.nextInt();
        String newStudentName = inputOutput("Please input new name");
        for(int i = 0; i<students.length;i++){
            if (idCurrentStudent==students[i].id){
                students[i].name=newStudentName;
            }else {
                System.out.println("Student you want to edit is not invalid");
            }
        }
    }
    public static class Student {
        private int id;
        private String name;
        private int age;
        private String address;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Student(int id, String name, int age, String address) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Student() {
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", address='" + address + '\'' +
                    '}';
        }
    }

}
