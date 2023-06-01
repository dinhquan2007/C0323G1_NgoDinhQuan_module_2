package case_study.model.facility;

public class Vila extends Facility{
    private String roomStandard;
    private String poolArea;
    private String numberFloors;

    public Vila(String codeService, String nameService, String usableArea, String rentalCosts, String quantityPeopleMax, String rentalType, String roomStandard, String poolArea, String numberFloors) {
        super(codeService, nameService, usableArea, rentalCosts, quantityPeopleMax, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(String numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return "Vila{" +super.toString()+
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea='" + poolArea + '\'' +
                ", numberFloors='" + numberFloors + '\'' +
                '}';
    }
}
