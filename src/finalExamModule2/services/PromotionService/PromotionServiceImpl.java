package finalExamModule2.services.PromotionService;

import finalExamModule2.DataStream.ReadAndWriteDataMap;
import finalExamModule2.models.bookingAndContract.Booking;
import finalExamModule2.utils.BookingComparatorDate;
import finalExamModule2.utils.CheckChoice;
import finalExamModule2.utils.CheckSpace;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class PromotionServiceImpl implements PromotionService {
    private static final String filepathFinalBookYear = "src\\caseStudy\\data\\BookingYear.csv";
    private static final Set<Booking> promotionBooking = new TreeSet<>(new BookingComparatorDate());
    private static final ReadAndWriteDataMap<Booking> readAndWriterByte = new ReadAndWriteDataMap<>();

    @Override
    public Set<Booking> getAllBooking() {
        List<Booking> list = readAndWriterByte.readDataFromFileList(filepathFinalBookYear);
        promotionBooking.addAll(list);
        return promotionBooking;
    }

    @Override
    public void displayPlayByYear() {
        new PromotionServiceImpl().getAllBooking();
        System.out.println("nhap nam ban muon hien thi");
        String years = new CheckSpace().input().nextLine();
        for (Booking booking : promotionBooking) {
            String[] yearBooking = booking.getStartDay().split("/");
            if (yearBooking[2].equals(years)) {
                System.out.println(booking.toString());

            }
        }
    }

    @Override
    public void voucher() {
        new PromotionServiceImpl().getAllBooking();
        Stack<Booking> voucherBooking = new Stack<>();
        for (Booking booking : promotionBooking) {
            String dateBooking = booking.getStartDay();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate starBook = LocalDate.parse(dateBooking, formatter);
            LocalDate currentDate = LocalDate.now();
            long month = ChronoUnit.MONTHS.between(currentDate, starBook);
            if (month == 0) {
                voucherBooking.push(booking);
                System.out.println(booking.toString());
            }
        }
        boolean check = false;
        int voucher10 = 0;
        int voucher20 = 0;
        int voucher50 = 0;
        while (!check) {
            System.out.println("tong so voucher se phat = " + voucherBooking.size());
            System.out.println("nhap so voucher 10%");
            voucher10 = new CheckChoice().choice();
            System.out.println("nhap so voucher 20%");
            voucher20 = new CheckChoice().choice();
            voucher50 = voucherBooking.size() - voucher10 - voucher20;
            System.out.println(" so voucher 50% kha dung = " + voucher50);
            if ((voucher50 >= 0)) {
                check = true;
            } else {
                System.out.println(" vui long nhap lai ");
            }
        }
        for (int i = 1; i <= voucher10; i++) {
            if (!voucherBooking.empty()) {
                System.out.println(voucherBooking.pop().toString() + " da được tặng voucher 10%");
            }
        }
        for (int i = 1; i <= voucher20; i++) {
            if (!voucherBooking.empty()) {
                System.out.println(voucherBooking.pop().toString() + " da được tặng voucher 20%");
            }
        }
        for (int i = 1; i <= voucher50; i++) {
            if (!voucherBooking.empty()) {
                System.out.println(voucherBooking.pop().toString() + " da được tặng voucher 50%");
            }
        }
    }
}
