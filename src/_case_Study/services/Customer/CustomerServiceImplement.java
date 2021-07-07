package _case_Study.services.Customer;

import _case_Study.models.Customer;
import _case_Study.models.Employee;
import _case_Study.utils.ReadAndWriteFile;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImplement implements CustomerService {
    private static final String CUSTOMER_FILE_PATH = "src\\_case_Study\\data\\customer.csv";
    List<Customer> customerList = new LinkedList<>();
    static Scanner input = new Scanner(System.in);


    private static String inputOutput(String message) {
        System.out.println(message);
        String output = input.nextLine();
        return output;
    }

    @Override
    public List readData() {
        customerList = new ReadAndWriteFile<Employee>().readFile(CUSTOMER_FILE_PATH);
        return customerList;
    }
    public void display() {
        if (customerList.size() == 0) {
            System.out.println("Không có khách hàng nào");
        } else {
            new CustomerServiceImplement().readData();
            for (Customer element : customerList) {
                System.out.println(element.toString());
            }
        }

    }
    @Override
    public void add() {
        System.out.println("Nhập tên khách hàng");
        String name = input.nextLine();
        System.out.println("Nhập ngày sinh");
        String dateOfBirth = input.nextLine();
        System.out.println("Nhập giới tính");
        String gender = input.nextLine();
        System.out.println("Nhập số CMND");
        String identityNumber = input.nextLine();
        System.out.println("Nhập số điện thoại");
        String phoneNumber = input.nextLine();
        System.out.println("Nhập email");
        String email = input.nextLine();
        System.out.println("Nhập loại khách");
        String typeOfCustomer = input.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = input.nextLine();
        System.out.println("Nhập mã khách hàng");
        int idCustomer = Integer.parseInt(input.nextLine());
        Customer newCustomer = new Customer(name, dateOfBirth, gender, identityNumber, phoneNumber, email,idCustomer, typeOfCustomer, address);
        customerList.add(newCustomer);
        new ReadAndWriteFile<>().clearFile(CUSTOMER_FILE_PATH);
        new ReadAndWriteFile<>().writeFile(CUSTOMER_FILE_PATH,customerList);

    }

    @Override
    public void edit() {
        if (customerList.size() == 0) {
            System.out.println("Không có khách hàng nào");
        } else {
            System.out.println("Nhập id khách hàng cần chỉnh sửa");
            int searchId = Integer.parseInt(input.nextLine());
            boolean check = false;
            for (Customer element : customerList) {
                if (searchId != element.getIdCustomer()) {
                    check = false;
                } else {
                    check = true;
                    String newName = inputOutput("Nhập lại tên khách hàng ");
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
                    String newTypeOfCustomer = inputOutput("Nhập lại loại khách");
                    element.setTypeOfCustomer(newTypeOfCustomer);
                    String newAddress = inputOutput("Nhập lại địa chỉ");
                    element.setAddress(newAddress);
                    new ReadAndWriteFile<>().clearFile(CUSTOMER_FILE_PATH);
                    new ReadAndWriteFile<>().writeFile(CUSTOMER_FILE_PATH,customerList);
                    break;
                }
            }
            if (check == false) {
                System.out.println("No customer found");
            }
        }
    }


}
