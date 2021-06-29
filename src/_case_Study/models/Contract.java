package _case_Study.models;

public class Contract {
    private String numberOfContract;
    private Booking codeOfBooking;
    private float deposit;
    private float amount;
    private Customer idCustomer;

    public Contract(String numberOfContract, Booking codeOfBooking, float deposit, float amount, Customer idCustomer) {
        this.numberOfContract = numberOfContract;
        this.codeOfBooking = codeOfBooking;
        this.deposit = deposit;
        this.amount = amount;
        this.idCustomer = idCustomer;
    }

    public String getNumberOfContract() {
        return numberOfContract;
    }

    public void setNumberOfContract(String numberOfContract) {
        this.numberOfContract = numberOfContract;
    }

    public Booking getCodeOfBooking() {
        return codeOfBooking;
    }

    public void setCodeOfBooking(Booking codeOfBooking) {
        this.codeOfBooking = codeOfBooking;
    }

    public float getDeposit() {
        return deposit;
    }

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Customer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Customer idCustomer) {
        this.idCustomer = idCustomer;
    }
}
