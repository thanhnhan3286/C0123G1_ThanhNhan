package case_study_furama_resort_module_2.model.person;

public class Customer extends Person {
    private String customerLevel;
    private String address;

    public Customer() {
    }

    public Customer(String id, String fullName, String birthday, String gender, String numberOfIdCard,
                    String numberPhone, String email, String customerLevel, String address) {
        super(id, fullName, birthday, gender, numberOfIdCard, numberPhone, email);
        this.customerLevel = customerLevel;
        this.address = address;
    }


    public String getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + "id='" + getId() + '\'' +
                "fullName='" + getFullName() + '\'' +
                ", birthday='" + getBirthday() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", numberOfIdCard='" + getNumberOfIdCard() + '\'' +
                ", numberPhone='" + getNumberPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", customerLevel='" + customerLevel + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getInfoToCSV() {
        return getId() + "," + getFullName() + "," +
                getBirthday() + "," + getGender() + "," +
                getNumberOfIdCard() + "," + getNumberPhone() + "," +
                getEmail() + "," + customerLevel + "," + address;
    }
}
