package case_study.model.facility;

public class Room extends Facility{
    private String freeService;

    public Room(String codeService, String nameService, String usableArea, String rentalCosts, String quantityPeopleMax, String rentalType, String freeService) {
        super(codeService, nameService, usableArea, rentalCosts, quantityPeopleMax, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

}
