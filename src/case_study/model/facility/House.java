package case_study.model.facility;

public class House extends Facility{
    private String roomStandard;
    private String numberFloors;

    public House(String codeService, String nameService, String usableArea, String rentalCosts, String quantityPeopleMax, String rentalType, String roomStandard, String numberFloors) {
        super(codeService, nameService, usableArea, rentalCosts, quantityPeopleMax, rentalType);
        this.roomStandard = roomStandard;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(String numberFloors) {
        this.numberFloors = numberFloors;
    }
}
