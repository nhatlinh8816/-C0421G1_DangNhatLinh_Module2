package _case_Study.models;

public class Booking {
    private String codeBooking;
    private String checkInDate;
    private String checkOutDate;
    private Customer customer;
    private Facility nameFacility;

    public Booking(String codeBooking, String checkInDate, String checkOutDate, Customer customer, Facility nameFacility) {
        this.codeBooking = codeBooking;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.customer = customer;
        this.nameFacility = nameFacility;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getNameFacility() {
        return nameFacility;
    }

    public void setNameFacility(Facility nameFacility) {
        this.nameFacility = nameFacility;
    }
}
