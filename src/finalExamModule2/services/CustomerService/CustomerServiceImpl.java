package finalExamModule2.services.CustomerService;

import finalExamModule2.DataStream.ReadAndWriteDataMap;
import finalExamModule2.utils.CheckSpace;
import finalExamModule2.utils.CheckChoice;
import finalExamModule2.models.Customer.Customer;
import finalExamModule2.models.Customer.TypeCustomer;
import finalExamModule2.models.employee.Gender;
import finalExamModule2.utils.CheckDateOfBirth;

import java.util.LinkedList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private static final String CUSTOMER_CSV = "finalExamModule2\\data\\Customer.csv";
    public static List<Customer> customers = new LinkedList<>();
    public static ReadAndWriteDataMap<Customer> readAndWriteDataMap = new ReadAndWriteDataMap<Customer>();

    @Override
    public List<Customer> readDataFromFile() {
        customers = readAndWriteDataMap.readDataFromFileList(CUSTOMER_CSV);
        return customers;
    }

    @Override
    public void add() {
        new CustomerServiceImpl().readDataFromFile();
        int id = 0;
        if (customers.isEmpty()) {
            id = 1;
        } else {
            id = customers.get(customers.size() - 1).getCode() + 1;
        }
        System.out.println(" nhap ten  ");
        String name = new CheckSpace().inputString();
        System.out.println(" nhap ngay sinh  ");
        String dateBirth = new CheckDateOfBirth().CheckDateOfBirth();
        System.out.println(" chon gioi tinh  ");
        String gender = new Gender().gender();
        System.out.println(" nhap so CMND  ");
        String cmnd = new CheckSpace().inputString();
        System.out.println(" nhap so dien thoai  ");
        String numPhone = new CheckSpace().inputString();
        System.out.println(" nhap email  ");
        String email = new CheckSpace().inputString();
        System.out.println(" chon loai customer ");
        String typeCustomer = new TypeCustomer().choiCustomer();
        System.out.println(" nhap dia chi   ");
        String address = new CheckSpace().inputString();

        Customer customer = new Customer(id, name, dateBirth, gender, cmnd, numPhone, email, typeCustomer, address);
        customers.add(customer);
        readAndWriteDataMap.writeDataFromFileList(customers, CUSTOMER_CSV);
    }

    @Override
    public void edit() {
        new CustomerServiceImpl().readDataFromFile();
        new CustomerServiceImpl().disPlay();
        System.out.println("nhap id ban muon sua");
        int id = new CheckChoice().choice();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCode() == id) {
                boolean check = true;
                while (check) {
                    System.out.println("Bạn muốn sửa thông tin nào cho " + customers.get(i).toString());
                    System.out.println("1. Tên");
                    System.out.println("2. Ngày sinh");
                    System.out.println("3. Giới tính");
                    System.out.println("4. Số Chứng minh nhân dân");
                    System.out.println("5. Số điện thoại");
                    System.out.println("6. Địa chỉ email");
                    System.out.println("7. loai khách hàng");
                    System.out.println("8. Địa chỉ ");
                    System.out.println("9. thoat edit");
                    int choice = new CheckChoice().choice();
                    switch (choice) {
                        case 1:
                            System.out.println("Nhập tên muốn sửa");
                            String name = new CheckSpace().inputString();
                            customers.get(i).setFullName(name);
                            break;
                        case 2:
                            System.out.println("Nhập dateOfBirth");
                            String day = new CheckDateOfBirth().CheckDateOfBirth();
                            customers.get(i).setDateOfBirth(day);
                            break;
                        case 3:
                            System.out.println("chon giới tính");
                            String gender = new Gender().gender();
                            customers.get(i).setGender(gender);
                            break;
                        case 4:
                            System.out.println("Nhập CMND");
                            String idPerson = new CheckSpace().inputString();
                            customers.get(i).setIdNumber(idPerson);
                            break;
                        case 5:
                            System.out.println("Nhập số điện thoại");
                            String number = new CheckSpace().inputString();
                            customers.get(i).setPhoneNumber(number);
                            break;
                        case 6:
                            System.out.println("Nhập emailAddress");
                            String email = new CheckSpace().inputString();
                            customers.get(i).setEmail(email);
                            break;
                        case 7:
                            System.out.println("loai customer ");
                            String typeCustomer = new TypeCustomer().choiCustomer();
                            customers.get(i).setCustomerType(typeCustomer);
                            break;
                        case 8:
                            System.out.println("Nhập dia chi ");
                            String address = new CheckSpace().inputString();
                            customers.get(i).setAddress(address);
                            break;
                        case 9:
                            check = false;
                            break;
                        default:
                            break;
                    }
                }
                break;
            }
        }
        readAndWriteDataMap.clearData(CUSTOMER_CSV);
        readAndWriteDataMap.writeDataFromFileList(customers, CUSTOMER_CSV);
    }

    @Override
    public void disPlay() {
        new CustomerServiceImpl().readDataFromFile();
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void remove() {
        new CustomerServiceImpl().readDataFromFile();
        System.out.println("nhap id ban muon xoa");
        int id = new CheckChoice().choice();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getCode() == id) {
                boolean check = true;
                while (check) {
                    System.out.println("Bạn muốn xoa employee nay  " + customers.get(i).toString());
                    System.out.println("1. dong y xoa");
                    System.out.println("2. khong xoa");
                    System.out.println(" hay dua ra quyet dinh ");
                    int choice = new CheckChoice().choice();
                    switch (choice) {
                        case 1: {
                            customers.remove(i);
                            check = false;
                            break;
                        }
                        case 2: {
                            check = false;
                            break;
                        }
                        default:
                            break;
                    }
                }
                break;
            }
        }
        readAndWriteDataMap.clearData(CUSTOMER_CSV);
        readAndWriteDataMap.writeDataFromFileList(customers, CUSTOMER_CSV);
    }

    public Integer CheckidBook() {
        new CustomerServiceImpl().readDataFromFile();
        new CustomerServiceImpl().disPlay();
        boolean check = false;
        int id = 0;
        while (!check) {
            System.out.println(" nhap id cua Customer ");
            id = new CheckChoice().choice();
            for (int i = 0; i < customers.size(); i++) {
                if (customers.get(i).getCode() == id) {
                    check = true;
                    break;
                }
            }
            if(!check){
                System.out.println("id khong dung, moi nhap lai theo danh sanh da hien ");
            }
        }
        return id;
    }
}
