package case_study_furama_resort_module_2.model.person;

public class Employee extends Person {
    private String employeeId;
    private String employeeLevel;
    private String position;
    private double wage;

    public Employee() {
    }

    public Employee(String fullName, String birthday, String gender, String numberOfIdCard, String numberPhone, String email, String employeeId, String level, String position, double wage) {
        super(fullName, birthday, gender, numberOfIdCard, numberPhone, email);
        this.employeeId = employeeId;
        this.employeeLevel = level;
        this.position = position;
        this.wage = wage;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getLevel() {
        return employeeLevel;
    }

    public void setLevel(String level) {
        this.employeeLevel = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", level='" + employeeLevel + '\'' +
                ", position='" + position + '\'' +
                ", wage=" + wage +
                '}';
    }
}
