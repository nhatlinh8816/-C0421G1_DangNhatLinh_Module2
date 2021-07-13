package finalExamModule2.services.employeeService;

import finalExamModule2.DataStream.ReadAndWriteDataMap;
import finalExamModule2.utils.CheckDateOfBirth;
import finalExamModule2.utils.CheckSpace;
import finalExamModule2.utils.CheckChoice;
import finalExamModule2.models.employee.AcademicLevel;
import finalExamModule2.models.employee.Employee;
import finalExamModule2.models.employee.Gender;
import finalExamModule2.models.employee.PositionChoice;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private static final String EMPLOYEE_CSV = "src\\finalExamModule2\\data\\Employee.csv";
    private static List<Employee> employeeArrayList = new ArrayList<>();
    private static ReadAndWriteDataMap<Employee> readAndWriteDataMap = new ReadAndWriteDataMap<Employee>();

    @Override
    public List<Employee> readDataFromFile() {
        employeeArrayList = readAndWriteDataMap.readDataFromFileList(EMPLOYEE_CSV);
        return employeeArrayList;
    }

    @Override
    public void add() {
        new EmployeeServiceImpl().readDataFromFile();
        int idEmployee;
        if (employeeArrayList.isEmpty()) {
            idEmployee = 1;
        } else {
            idEmployee = employeeArrayList.get(employeeArrayList.size() - 1).getCode() + 1;
        }
        System.out.println("Nhập tên nhân viên");
        String name = new CheckSpace().inputString();
        System.out.println("Nhập ngày sinh nhân viên");
        String dateBirth = new CheckDateOfBirth().CheckDateOfBirth();
        System.out.println("Lựa chọn giới tính");
        String gender = new Gender().gender();
        System.out.println("Nhập số CMND");
        String identityNumber = new CheckSpace().inputString();
        System.out.println("Nhập số điện thoại di động");
        String phoneNumber = new CheckSpace().inputString();
        System.out.println("Nhập email ");
        String email = new CheckSpace().inputString();
        System.out.println("Chọn trình độ");
        String academicLevel = new AcademicLevel().choiceAcademicLevel();
        System.out.println("Chọn vị trí");
        String position = new PositionChoice().positionChoicee();
        System.out.println("Nhập mức lương");
        int salary = 0;
        boolean check = true;
        while (check){
            salary =new CheckChoice().choice();
            if(salary == 0){
                System.out.println("Lương không đúng");
            }else {
                check = false;
            }
        }
        Employee employee = new Employee(idEmployee, name, dateBirth, gender, identityNumber, phoneNumber, email, academicLevel, position, salary);
        employeeArrayList.add(employee);
        readAndWriteDataMap.writeDataFromFileList(employeeArrayList, EMPLOYEE_CSV);
    }

    @Override
    public void edit() {
        new EmployeeServiceImpl().readDataFromFile();
        System.out.println("Nhập ID nhân viên bạn muốn sửa");
        int id = new CheckChoice().choice();
        for (int i = 0; i < employeeArrayList.size(); i++) {
            if (employeeArrayList.get(i).getCode() == id) {
                boolean check = true;
                while (check) {
                    System.out.println("Bạn muốn sửa thông tin nào cho " + employeeArrayList.get(i).getFullName());
                    System.out.println("1. Tên");
                    System.out.println("2. Ngày sinh");
                    System.out.println("3. Giới tính");
                    System.out.println("4. Số Chứng minh nhân dân");
                    System.out.println("5. Số điện thoại");
                    System.out.println("6. Địa chỉ email");
                    System.out.println("7. Trình độ");
                    System.out.println("8. Vị trí");
                    System.out.println("9. Lương");
                    System.out.println(" 10. Thoát");
                    int choice = new CheckChoice().choice();
                    switch (choice) {
                        case 1:
                            System.out.println("Nhập tên mới");
                            String name = new CheckSpace().inputString();
                            employeeArrayList.get(i).setFullName(name);
                            break;
                        case 2:
                            System.out.println("Nhập ngày sinh mới");
                            String day = new CheckDateOfBirth().CheckDateOfBirth();
                            employeeArrayList.get(i).setDateOfBirth(day);
                            break;
                        case 3:
                            System.out.println("chon giới tính mới");
                            String gender = new Gender().gender();
                            employeeArrayList.get(i).setDateOfBirth(gender);
                            break;
                        case 4:
                            System.out.println("Nhập số CMND mới");
                            String idPerson = new CheckSpace().inputString();
                            employeeArrayList.get(i).setIdNumber(idPerson);
                            break;
                        case 5:
                            System.out.println("Nhập số điện thoại mới");
                            String number = new CheckSpace().inputString();
                            employeeArrayList.get(i).setPhoneNumber(number);
                            break;
                        case 6:
                            System.out.println("Nhập email mới");
                            String email = new CheckSpace().inputString();
                            employeeArrayList.get(i).setEmail(email);
                            break;
                        case 7:
                            System.out.println("chon trình độ mới");
                            String academicLevel = new AcademicLevel().choiceAcademicLevel();
                            employeeArrayList.get(i).setAcademicLevel(academicLevel);
                            break;
                        case 8:
                            System.out.println("Nhập vị trí mới");
                            String position = new PositionChoice().positionChoicee();
                            employeeArrayList.get(i).setPosition(position);
                            break;
                        case 9:
                            System.out.println("Nhập lương mới");
                            int salary = new CheckChoice().choice();
                            employeeArrayList.get(i).setSalary(salary);
                            break;
                        case 10:
                            check = false;
                            break;
                        default:
                            break;
                    }
                }
                break;
            }
        }
        readAndWriteDataMap.clearData(EMPLOYEE_CSV);
        readAndWriteDataMap.writeDataFromFileList(employeeArrayList, EMPLOYEE_CSV);
    }

    @Override
    public void disPlay() {
        new EmployeeServiceImpl().readDataFromFile();
        if (employeeArrayList.size() == 0) {
            System.out.println("No employees to display");
        } else {
            for (Employee lists : employeeArrayList) {
                System.out.println(lists.toString());
            }
        }
    }

    @Override
    public void remove() {
        new EmployeeServiceImpl().readDataFromFile();
        System.out.println("Nhập ID nhân viên bạn muốn xóa");
        int id = new CheckChoice().choice();
        for (int i = 0; i < employeeArrayList.size(); i++) {
            if (employeeArrayList.get(i).getCode() == id) {
                boolean check = true;
                while (check) {
                    System.out.println("Nhân viên " + employeeArrayList.get(i).toString()+" sẽ bị xóa khỏi hệ thống. Bạn có chắc muốn xóa");
                    System.out.println("1.Đồng ý");
                    System.out.println("2.Không");
                    int choice = new CheckChoice().choice();
                    switch (choice){
                        case 1: {
                            employeeArrayList.remove(i);
                            check=false;
                            break;
                        }
                        case 2:{
                            check=false;
                            break;
                        }
                        default:break;
                    }
                }
                break;
            }
        }
        readAndWriteDataMap.clearData(EMPLOYEE_CSV);
        readAndWriteDataMap.writeDataFromFileList(employeeArrayList, EMPLOYEE_CSV);
    }
}
