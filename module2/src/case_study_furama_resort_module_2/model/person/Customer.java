package case_study_furama_resort_module_2.model.person;

public class Customer extends Person {
private String customerId;
private String customerLevel;
private String address;

    public Customer() {
    }

    public Customer(String fullName, String birthday, String gender, String numberOfIdCard, String numberPhone, String email, String customerId, String customerLevel, String address) {
        super(fullName, birthday, gender, numberOfIdCard, numberPhone, email);
        this.customerId = customerId;
        this.customerLevel = customerLevel;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", customerLevel='" + customerLevel + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
