package _case_Study.models;

public class Villa extends Facility {
    String standard;
    float areaOfPool;
    int numberOfFlour;

    public Villa(String name, float area, float cost, int maximumPeople, String rentalType, String standard, float areaOfPool, int numberOfFlour) {
        super(name, area, cost, maximumPeople, rentalType);
        this.standard = standard;
        this.areaOfPool = areaOfPool;
        this.numberOfFlour = numberOfFlour;
    }

    public Villa(String standard, float areaOfPool, int numberOfFlour) {
        this.standard = standard;
        this.areaOfPool = areaOfPool;
        this.numberOfFlour = numberOfFlour;
    }

    public Villa() {
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public float getAreaOfPool() {
        return areaOfPool;
    }

    public void setAreaOfPool(float areaOfPool) {
        this.areaOfPool = areaOfPool;
    }

    public int getNumberOfFlour() {
        return numberOfFlour;
    }

    public void setNumberOfFlour(int numberOfFlour) {
        this.numberOfFlour = numberOfFlour;
    }
}
