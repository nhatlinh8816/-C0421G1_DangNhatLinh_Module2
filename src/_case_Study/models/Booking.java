package _case_Study.models;

public class Booking {
    private String codeBooking;
    private String checkInDate;
    private String checkOutDate;
    private Customer idCustormer;
    private Facility nameFacility;

    public Booking(String codeBooking, String checkInDate, String checkOutDate, Customer idCustormer, Facility nameFacility) {
        this.codeBooking = codeBooking;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.idCustormer = idCustormer;
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

    public Customer getIdCustormer() {
        return idCustormer;
    }

    public void setIdCustormer(Customer idCustormer) {
        this.idCustormer = idCustormer;
    }

    public Facility getNameFacility() {
        return nameFacility;
    }

    public void setNameFacility(Facility nameFacility) {
        this.nameFacility = nameFacility;
    }
}
