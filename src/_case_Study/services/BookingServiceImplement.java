package _case_Study.services;

import _case_Study.models.Booking;
import _case_Study.utils.ReadAndWriteFile;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BookingServiceImplement implements BookingService {
    public static Scanner input = new Scanner(System.in);
    public static final String BOOKING_FILE_PATH = "src\\_case_Study\\data\\booking.csv";

    private static String inputOutput(String message) {
        System.out.println(message);
        String output = input.nextLine();
        return output;
    }
    public static Set<Booking> bookingSet = new TreeSet<>();

    @Override
    public void display() {
        bookingSet.toString();
    }

    @Override
    public void add() {
        System.out.println("Nhập mã booking");
        String idBooking = input.nextLine();
        System.out.println("Nhập ngày bắt đầu");
        String checkInDate = input.nextLine();
        System.out.println("Nhập ngày kết thúc");
        String checkOutDate = input.nextLine();
        System.out.println("----Danh sách khách hàng------");
        new CustomerServiceImplement().display();
        String customer = input.nextLine();
        System.out.println("----Danh sách facility------");
        new FacilityServiceImplement().display();
        String facility = input.nextLine();
        Booking newBooking = new Booking(idBooking,checkInDate,checkOutDate,customer,facility);
        bookingSet.add(newBooking);
        Booking line;
        for (Booking element: bookingSet){
            line = element;
            ReadAndWriteFile.writeFile(BOOKING_FILE_PATH,line);
        }
    }




    @Override
    public void creat() {

    }

    @Override
    public void edit() {

    }
}
