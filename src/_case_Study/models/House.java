package _case_Study.models;

public class House extends Facility {
    private String standard;
    private int numberOfFlour;

    public House(String name, float area, float cost, int maximumPeople, String rentalType, String standard, int numberOfFlour) {
        super(name, area, cost, maximumPeople, rentalType);
        this.standard = standard;
        this.numberOfFlour = numberOfFlour;
    }

    public House(String standard, int numberOfFlour) {
        this.standard = standard;
        this.numberOfFlour = numberOfFlour;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getNumberOfFlour() {
        return numberOfFlour;
    }

    public void setNumberOfFlour(int numberOfFlour) {
        this.numberOfFlour = numberOfFlour;
    }
}
