package case_study.model.facility;

import java.util.Objects;

public abstract class Facility {
    private String codeService;
    private String nameService;
    private String usableArea;
    private String rentalCosts;
    private String quantityPeopleMax;
    private String rentalType;

    public Facility(String codeService, String nameService, String usableArea, String rentalCosts, String quantityPeopleMax, String rentalType) {
        this.codeService = codeService;
        this.nameService = nameService;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.quantityPeopleMax = quantityPeopleMax;
        this.rentalType = rentalType;
    }

    public String getCodeService() {
        return codeService;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public String getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(String rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public String getQuantityPeopleMax() {
        return quantityPeopleMax;
    }

    public void setQuantityPeopleMax(String quantityPeopleMax) {
        this.quantityPeopleMax = quantityPeopleMax;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Objects.equals(codeService, facility.codeService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codeService);
    }

    @Override
    public String toString() {
        return "codeService='" + codeService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", usableArea='" + usableArea + '\'' +
                ", rentalCosts='" + rentalCosts + '\'' +
                ", quantityPeopleMax='" + quantityPeopleMax + '\'' +
                ", rentalType='" + rentalType + '\'';
    }
}
