package finalExamModule2.services.booking;

import finalExamModule2.DataStream.ReadAndWriteDataMap;
import finalExamModule2.models.bookingAndContract.Booking;
import finalExamModule2.utils.BookingComparatorDate;
import finalExamModule2.models.bookingAndContract.Contract;
import finalExamModule2.services.CustomerService.CustomerServiceImpl;
import finalExamModule2.utils.CheckIdBook;
import finalExamModule2.utils.CheckChoice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class ContactServiceImpl implements ContactService {
    private static final String filepath = "src\\caseStudy\\data\\Contact.csv";
    //    private static final ReadWriteTreeSet readwriteTreeSet = new ReadWriteTreeSet();
    public static final ReadAndWriteDataMap<Contract> READ_AND_WRITE_DATA_MAP = new ReadAndWriteDataMap<Contract>();
    private static final Queue<Booking> bookingtoQueue = new PriorityQueue<>(new BookingComparatorDate());
    private static List<Contract> contractList = new ArrayList<>();

    @Override
    public List<Contract> readDataFromFile() {
        contractList = READ_AND_WRITE_DATA_MAP.readDataFromFileList(filepath);
        return contractList;
    }

    @Override
    public Queue<Booking> getAllBookByQueue() {
        Set<Booking> bookingSet = new BookingServiceImpl().getAllBooking();
        for (Booking booking : bookingSet) {
//            if (new CheckIdBook().idBookingHouse(booking.getBookingId()) || new CheckIdBook().idBookingVilla(booking.getBookingId())) {
            bookingtoQueue.offer(booking);
//            }
        }
        return bookingtoQueue;
    }

    @Override
    public void add() {
        new ContactServiceImpl().readDataFromFile();
        new ContactServiceImpl().getAllBookByQueue();
        boolean check = false;
        System.out.println("danh sach booking con lai : ");
        new BookingServiceImpl().disPlay();
        while (!check) {
            if (!bookingtoQueue.isEmpty()) {
                Booking bookingContract = bookingtoQueue.poll();
                String idBooking = bookingContract.getBookingId();
                new BookingServiceImpl().getAllBooking();
                if (new CheckIdBook().idBookingHouse(idBooking) || new CheckIdBook().idBookingVilla(idBooking)) {
                    int idContract = 0;
                    if (contractList.isEmpty()) {
                        idContract = 1;
                    } else {
                        idContract = contractList.get(contractList.size() - 1).getContractNumber() + 1;
                    }
                    System.out.println("ban se lam hop dong voi booking nay: ");
                    System.out.println(bookingContract.toString());
                    System.out.println("nhap so tien coc USD");
                    int moneyF = new CheckChoice().choice();
                    String startB = bookingContract.getStartDay();
                    String endB = bookingContract.getEndDay();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate starBook = LocalDate.parse(startB, formatter);
                    LocalDate endbook = LocalDate.parse(endB, formatter);
                    int day = (int) ChronoUnit.DAYS.between(starBook, endbook);
                    int paydayMoney = 0;
                    if (new CheckIdBook().idBookingHouse(idBooking)) {
                        paydayMoney = day * 700 - moneyF;
                        new BookingServiceImpl().saveBooking(idBooking);
                        new BookingServiceImpl().removeBooking(idBooking);
                    } else if (new CheckIdBook().idBookingVilla(idBooking)) {
                        paydayMoney = day * 1000 - moneyF;
                        new BookingServiceImpl().saveBooking(idBooking);
                        new BookingServiceImpl().removeBooking(idBooking);
                    }
                    int idCustomer = bookingContract.getCustomerId();
                    Contract contract1 = new Contract(idContract, idBooking, moneyF, paydayMoney, idCustomer);
                    contractList.add(contract1);
                    READ_AND_WRITE_DATA_MAP.writeDataFromFileList(contractList, filepath);
                    System.out.println("ban da lam hop dong thanh cong ");
                } else {
                    new BookingServiceImpl().saveBooking(idBooking);
                    new BookingServiceImpl().removeBooking(idBooking);
                }

            } else {
                System.out.println("khong con booking nao de lam hop dong");
                check = true;
            }
        }
    }


    @Override
    public void edit() {
        new ContactServiceImpl().readDataFromFile();
        new ContactServiceImpl().disPlay();
        System.out.println("nhap id contract ban muon sua ");
        int idcontract = new CheckChoice().choice();
        for (int i = 0; i < contractList.size(); i++) {
            if (contractList.get(i).getContractNumber() == idcontract) {
                boolean check = true;
                while (check) {
                    System.out.println("1. nhap so tien coc ");
                    System.out.println("2. nhap tong so tien phai thanh toan ");
                    System.out.println("3. nhap id customer can thay doi ");
                    System.out.println("4. thoat chinh sua");
                    System.out.println("nhap lua chon");
                    int choice = new CheckChoice().choice();
                    switch (choice) {
                        case 1: {
                            System.out.println(" so tien dat coc ban muon sua ");
                            int moneyF = new CheckChoice().choice();
                            contractList.get(i).setDeposit(moneyF);
                            break;
                        }
                        case 2: {
                            System.out.println("nhap tong so tien con lai ");
                            int paydayMoney = new CheckChoice().choice();
                            contractList.get(i).setTotalPayment(paydayMoney);
                            break;
                        }
                        case 3: {
                            int idCustomer = new CustomerServiceImpl().CheckidBook();
                            contractList.get(i).setCustomerId(idCustomer);
                            break;
                        }
                        case 4: {
                            check = false;
                        }
                        default:
                            break;
                    }
                }
            }
        }
        READ_AND_WRITE_DATA_MAP.clearData(filepath);
        READ_AND_WRITE_DATA_MAP.writeDataFromFileList(contractList, filepath);
    }

    @Override
    public void disPlay() {
        new ContactServiceImpl().readDataFromFile();
        for (Contract contract : contractList) {
            System.out.println(contract.toString());
        }
    }
}
