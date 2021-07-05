package _case_Study.models;

public class Customer extends Person {
    private int idCustomer;
    private String typeOfCustomer;
    private String address;

    public Customer(String name, String dateOfBirth, String gender, String identityNumber, String phoneNumber, String email, int idCustomer, String typeOfCustomer, String address) {
        super(name, dateOfBirth, gender, identityNumber, phoneNumber, email);
        this.idCustomer = idCustomer;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public Customer() {
    }



    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() +
                "idCustomer=" + idCustomer +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
