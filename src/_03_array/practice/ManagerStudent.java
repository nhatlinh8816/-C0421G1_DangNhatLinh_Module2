package _03_array.practice;

import java.util.Scanner;

public class ManagerStudent {
    private static Scanner input = new Scanner(System.in);
    private static Student[]students;
     static {
        students = new Student[50];
        students[0] = new Student(1,"Trung",33,"Đà Nẵng");
        students[1] = new Student(2,"Nhật",23,"Quảng Nam");
        students[2] = new Student(3,"Tài",24,"Quảng Ngãi");
        students[3] = new Student(4,"Minh",25,"Vinh");
    }
    public static void main(String[] args) {
        System.out.println("----------Manager Student Program-----------");
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
            if (students[i]==null){
                continue;
            }
            else if (deleteStudent==students[i].id){
                students[i]=null;
                break;
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
                break;          // thêm xong phải thoát vòng lặp
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
        int idCurrentStudent = Integer.parseInt(input.nextLine());
        for(int i = 0; i<students.length;i++){
            if (idCurrentStudent==students[i].id){
                String newStudentName = inputOutput("Please input new name");
                students[i].name=newStudentName;
                System.out.println("Please input new age");
                int newStudentAge = Integer.parseInt(input.nextLine());
                students[i].age=newStudentAge;
                String newStudentAdress = inputOutput("Please input new adress");
                students[i].address=newStudentAdress;
                break;
            }else {
                System.out.println("Student you want to edit is not invalid");
                break;
            }
        }
    }
}
