package _case_Study.services.Booking;

import _case_Study.models.Booking;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;

public class BookingComparatorByDate implements Comparator<Booking>, Serializable {

    @Override
    public int compare(Booking o1, Booking o2) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate o1Start = LocalDate.parse(o1.getCheckInDate(), formatter);
        LocalDate o2Start = LocalDate.parse(o2.getCheckInDate(), formatter);
        LocalDate o1End = LocalDate.parse(o1.getCheckOutDate(), formatter);
        LocalDate o2End = LocalDate.parse(o2.getCheckOutDate(), formatter);

        long startYear = ChronoUnit.YEARS.between(o1Start, o2Start);
        long startMonth = ChronoUnit.MONTHS.between(o1Start, o2Start);
        long startDay = ChronoUnit.DAYS.between(o1Start, o2Start);

        long endyear = ChronoUnit.YEARS.between(o1End, o2End);
        long endMonth = ChronoUnit.MONTHS.between(o1End, o2End);
        long endDay = ChronoUnit.DAYS.between(o1End, o2End);

        if (startYear == 0) {
            if (startMonth == 0) {
                if (startDay == 0) {
                    if (endyear == 0) {
                        if (endMonth == 0) {
                            if (endDay == 0) {
                                return 0;
                            } else if (endDay < 0) {
                                return 1;
                            } else {
                                return -1;
                            }
                        } else if (endMonth < 0) {
                            return 1;
                        } else {
                            return -1;
                        }
                    } else if (endyear < 0) {
                        return 1;
                    } else {
                        return -1;
                    }
                } else if (startDay < 0) {
                    return 1;
                } else {
                    return -1;
                }
            } else if (startMonth < 0) {
                return 1;
            } else {
                return -1;
            }
        } else if (startYear < 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
