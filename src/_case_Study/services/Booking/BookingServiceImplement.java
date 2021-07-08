package _case_Study.services.Booking;

import _case_Study.Check.CheckDateBooking;
import _case_Study.Check.CheckIdBook;
import _case_Study.Exception.Choice;
import _case_Study.models.Booking;
import _case_Study.services.Facility.HouseServiceImplement;
import _case_Study.services.Facility.RoomServiceImplement;
import _case_Study.services.Facility.VillaServiceImplement;
import _case_Study.utils.ReadAndWriteFile;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BookingServiceImplement implements BookingService {
    public static Scanner input = new Scanner(System.in);
    public static final String BOOKING_FILE_PATH = "src\\_case_Study\\data\\booking.csv";

    public static Set<Booking> bookingSet = new TreeSet<>(new BookingComparatorByDate());

    @Override
    public Set<Booking>readFile() {
        bookingSet = new ReadAndWriteFile<Booking>().readTreeSet(BOOKING_FILE_PATH);
        return bookingSet;
    }

    @Override
    public void display() {
        bookingSet.toString();
    }


    @Override
    public List readData() {
        return null;
    }

    @Override
    public void add() {
        new BookingServiceImplement().readData();
        boolean check = true;
        String codeBooking = null;
        String typeOfRent = null;
        String nameOfFacility = null;
        while (check) {
            System.out.println("1. Booking House. VD:BH-XX, X từ 0 đến 9");
            System.out.println("2. Booking Room VD:BR-XX, X từ 0 đến 9");
            System.out.println("3. Booking Villa VD:BV-XX, X từ 0 đến 9");
            System.out.println("Nhập lựa chọn");
            int choice = new Choice().choiceInteger();
            switch (choice) {
                case 1: {
                    new HouseServiceImplement().display();
                    boolean check1 = true;
                    while (check1) {
                        int count = 0;
                        codeBooking = new CheckIdBook().idBooking();
                        if (new CheckIdBook().idBookingHouse(codeBooking)) {
                            for (Booking booking : bookingSet) {
                                if (!booking.getCodeBooking().equals(codeBooking)) {
                                    count++;
                                }
                            }
                        }
                        if (count == bookingSet.size()) {
                            check1 = false;
                        } else {
                            for (Booking booking : bookingSet) {
                                System.out.print(booking.getCodeBooking()+"; ");
                            }
                            System.out.print(codeBooking + " đã bị trùng hoặc chưa đúng định dạng ");
                        }
                    }
                    System.out.println("Nhập tên dịch vụ House muốn book ");
                    nameOfFacility = new HouseServiceImplement().checkDataBooking();
                    typeOfRent = "House";
                    new HouseServiceImplement().updateData(nameOfFacility);
                    check = false;
                    break;
                }
                case 2: {
                    new RoomServiceImplement().display();
                    boolean check1 = true;
                    while (check1) {
                        int count = 0;
                        codeBooking = new CheckIdBook().idBooking();
                        if (new CheckIdBook().idBookingRoom(codeBooking)) {
                            for (Booking booking : bookingSet) {
                                if (!booking.getCodeBooking().equals(codeBooking)) {
                                    count++;
                                }
                            }
                        }
                        if (count == bookingSet.size()) {
                            check1 = false;
                        } else {
                            for (Booking booking : bookingSet) {
                                System.out.print(booking.getCodeBooking()+"; ");
                            }
                            System.out.print(codeBooking + " đã bị trùng hoặc chưa đúng định dạng ");
                        }
                    }
                    System.out.println("Nhập tên dịch vụ Room muốn book");
                    nameOfFacility = new RoomServiceImplement().checkDataBooking();
                    typeOfRent = "Room";
                    new RoomServiceImplement().updateData(nameOfFacility);
                    check = false;
                    break;
                }
                case 3: {
                    new VillaServiceImplement().display();
                    boolean check1 = true;
                    while (check1) {
                        int count = 0;
                        codeBooking = new CheckIdBook().idBooking();
                        if (new CheckIdBook().idBookingVilla(codeBooking)) {
                            for (Booking booking : bookingSet) {
                                if (!booking.getCodeBooking().equals(codeBooking)) {
                                    count++;
                                }
                            }
                        }
                        if (count == bookingSet.size()) {
                            check1 = false;
                        } else {
                            for (Booking booking : bookingSet) {
                                System.out.print(booking.getCodeBooking()+"; ");
                            }
                            System.out.print(codeBooking + " đã bị trùng hoặc chưa đúng định dạng ");
                        }
                    }
                    System.out.println("Nhập tên dịch vụ Villa muốn book");
                    nameOfFacility = new VillaServiceImplement().checkDataBooking();
                    typeOfRent = "Villa";
                    new VillaServiceImplement().updateData(nameOfFacility);
                    check = false;
                    break;
                }
                default:
                    break;
            }
        }
        String checkInDate = new CheckDateBooking().checkDateBookingStart();
        String checkOutDate = new CheckDateBooking().checkDateBookingEnd(checkInDate);
        int idCustomer = new _case_Study.services.Customer.BookingServiceImplement().CheckIdBook();
        Booking booking = new Booking(codeBooking, checkInDate, checkOutDate, idCustomer, nameOfFacility, typeOfRent);
        bookingSet.add(booking);
        new ReadAndWriteFile<Booking>().writeTreeSet(bookingSet,BOOKING_FILE_PATH);
        }

    @Override
    public void edit() {

    }
}
