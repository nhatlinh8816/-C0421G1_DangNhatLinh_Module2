package _case_Study.models;

public class Room extends Facility {
    private String freeService;

    public Room(String name, float area, float cost, int maximumPeople, String rentalType, String freeService) {
        super(name, area, cost, maximumPeople, rentalType);
        this.freeService = freeService;
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +super.toString()+
                "freeService='" + freeService + '\'' +
                '}';
    }
}
