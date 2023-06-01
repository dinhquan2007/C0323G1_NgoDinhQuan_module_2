package case_study.model.person;

public class Customer extends Person {
    private String typeCustomer;
    private String address;

    public Customer(String code, String name, String birth, String gender, String cnnd, String phone, String email, String typeCustomer, String address) {
        super(code, name, birth, gender, cnnd, phone, email);
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +super.toString()+
                "typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
