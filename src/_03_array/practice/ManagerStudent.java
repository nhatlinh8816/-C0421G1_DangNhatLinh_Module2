package _03_array.practice;

import java.util.Scanner;

public class ManagerStudent {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("----------Manager Student Program-----------");
        String[]list = new  String[50];         //khởi tạo mảng danh sách sinh viên với 50 sinh viên
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
                    displayStudent(list);
                    break;
                case 2:
                    deleteStudent(list);
                    break;
                case 3:
                    creatStudent(list);
                    break;
                case 4:
                    editStudent(list);
                    break;
                case 5:
                    System.exit(5);
                    break;
            }
        } while (choice!=5);
    }
    private static void displayStudent(String[]list) {
        for (String eachStudent : list) {             //dùng vòng lặp for each duyệt từng phần tử
            if (eachStudent != null) {
                System.out.println(eachStudent);
            }
        }
    }
    private static void deleteStudent(String[]list){
        String deleteStudent = inputOutput("Please input name of student you want to delete");
        for (int i = 0; i<50;i++){
            if (deleteStudent.equals(list[i])){
                list[i]=null;
            }
        }
    }
    private static void creatStudent(String[]list){

        String newStudent = inputOutput("Please input new student");
        for (int i =0;i<list.length;i++){
            if (list[i]==null){         //nếu phần tử thuộc mảng đang rỗng thì sẽ thêm giá trị mới vào
                list[i] = newStudent;
                break;
            }
        }
    }
    private static String inputOutput(String message){
        System.out.println(message);
        String output = input.nextLine();
        return output;
    }

    private static void editStudent(String[]list){
        String currentStudent = inputOutput("Please input name of student you want to edit");
        String newStudent = inputOutput("Please input new name");
        for(int i = 0; i<list.length;i++){
            if (currentStudent.equals(list[i])){
                list[i]=newStudent;
            }else {
                System.out.println("Student you want to edit is not invalid");
            }
        }
    }
}
