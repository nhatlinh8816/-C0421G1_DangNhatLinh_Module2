package _case_Study.models;

public class Facility {
    private String name;
    private float area;
    private float cost;
    private int maximumPeople;
    private String rentalType;

    public Facility(String name, float area, float cost, int maximumPeople, String rentalType) {
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.maximumPeople = maximumPeople;
        this.rentalType = rentalType;
    }

    public Facility() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }
}
