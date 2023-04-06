package case_study_furama_resort_module_2.model;

public class Contract {
    private String contractNumber;
    private String bookingId;
    private String deposit;
    private String totalPayment;
    private String customerId;

    public Contract() {
    }

    public Contract(String contractNumber, String bookingId, String deposit, String totalPayment, String customerId) {
        this.contractNumber = contractNumber;
        this.bookingId = bookingId;
        this.deposit = deposit;
        this.totalPayment = totalPayment;
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber='" + contractNumber + '\'' +
                ", bookingId='" + bookingId + '\'' +
                ", deposit='" + deposit + '\'' +
                ", totalPayment='" + totalPayment + '\'' +
                ", customerId='" + customerId + '\'' +
                '}';
    }

    public String getInforToCSV() {
        return contractNumber + "," + bookingId + "," +
                deposit + "," + totalPayment + "," + customerId;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(String totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
