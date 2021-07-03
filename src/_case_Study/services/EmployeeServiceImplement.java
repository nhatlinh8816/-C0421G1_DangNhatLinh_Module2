package _case_Study.services;

import _12_java_collection_frame_work.exercise.Product;
import _case_Study.models.Employee;
import _case_Study.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImplement implements EmployeeService {
    public static Scanner input = new Scanner(System.in);
    public static final String EMPLOYEE_FILE_PATH = "src\\_case_Study\\data\\employee.csv";
    private static String inputOutput(String message){
        System.out.println(message);
        String output = input.nextLine();
        return output;
    }
    List<Employee> listEmployee = new ArrayList<>();
    public void readDataEmployee(){
        listEmployee = ReadAndWriteFile.readFile(EMPLOYEE_FILE_PATH);
    }
    @Override
    public void display() {
        if (listEmployee.size()==0){
            System.out.println("Không có nhân viên nào");
        }else {

            for (Employee element: listEmployee){
                System.out.println(element.toString());

            }
        }
    }

    @Override
    public void add() {
//        readDataEmployee();
        int id;
        if (listEmployee.isEmpty()){
            id = 1;
        } else {
            id = listEmployee.get(listEmployee.size()-1).getIdEmployee()+1;
        }
        System.out.println("Nhập tên nhân viên");
        String name = input.nextLine();
        System.out.println("Nhập ngày sinh");
        String dateOfBith = input.nextLine();
        System.out.println("Nhập giới tính");
        String gender = input.nextLine();
        System.out.println("Nhập số CMND");
        String identityNumber = input.nextLine();
        System.out.println("Nhập số điện thoại");
        String phoneNumber = input.nextLine();
        System.out.println("Nhập email");
        String email = input.nextLine();
        System.out.println("Nhập bằng cấp");
        String level = input.nextLine();
        System.out.println("Nhập chức vụ");
        String position = input.nextLine();
        System.out.println("Nhập mức lương");
        float salary = Float.parseFloat(input.nextLine());
        Employee newEmployee = new Employee(name,dateOfBith,gender,identityNumber,phoneNumber,email,id,level,position,salary);
        listEmployee.add(newEmployee);
        Employee line = null;
        for (Employee element: listEmployee){
            line = element;
            ReadAndWriteFile.writeFile(EMPLOYEE_FILE_PATH,line);
        }
    }

    @Override
    public void creat() {

    }

    @Override
    public void edit() {
        if (listEmployee.size()==0){
            System.out.println("Không có nhân viên nào");
        }else {
            System.out.println("Nhập id nhân viên cần chỉnh sửa");
            int searchId = Integer.parseInt(input.nextLine());
            boolean check = false;
            for (Employee element: listEmployee){
                Employee line = null;
                if (searchId!=element.getIdEmployee()){
                    check =false;
                }else {
                    check = true;
                    String newName = inputOutput("Nhập lại tên nhân viên ");
                    element.setName(newName);
                    String newDateOfBirth = inputOutput("Nhập lại ngày sinh ");
                    element.setDateOfBirth(newDateOfBirth);
                    String newGender = inputOutput("Nhập lại giới tính ");
                    element.setGender(newGender);
                    String newIdentityNumber = inputOutput("Nhập lại số CMND");
                    element.setIdentityNumber(newIdentityNumber);
                    String newPhoneNumber = inputOutput("Nhập lại số điện thoại");
                    element.setPhoneNumber(newPhoneNumber);
                    String newEmail = inputOutput("Nhập lại email");
                    element.setEmail(newEmail);
                    String newLevel = inputOutput("Nhập lại bằng cấp");
                    element.setLevel(newLevel);
                    String newPosition = inputOutput("Nhập lại chức vụ");
                    element.setPosition(newPosition);
                    System.out.println("Nhập lại mức lương");
                    float newSalary = Float.parseFloat(input.nextLine());
                    element.setSalary(newSalary);
                    line = element;
                    ReadAndWriteFile.writeFile(EMPLOYEE_FILE_PATH,line);
                    break;
                }
            }
            if (check==false){
                System.out.println("No employee found");
            }
        }
    }
}
