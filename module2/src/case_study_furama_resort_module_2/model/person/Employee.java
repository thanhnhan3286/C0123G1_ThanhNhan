package case_study_furama_resort_module_2.model.person;

public class Employee extends Person {
    private String employeeLevel;
    private String position;
    private String wage;

    public Employee() {
    }

    public Employee(String id, String fullName, String birthday, String gender, String numberOfIdCard, String numberPhone,
                    String email, String level, String position, String wage) {
        super(id, fullName, birthday, gender, numberOfIdCard, numberPhone, email);
        this.employeeLevel = level;
        this.position = position;
        this.wage = wage;
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

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" + "employeeId='" + getId() + '\'' +
                ", fullName='" + getFullName() + '\'' +
                ", birthday='" + getBirthday() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", numberOfIdCard='" + getNumberOfIdCard() + '\'' +
                ", numberPhone='" + getNumberPhone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", employeeLevel='" + employeeLevel + '\'' +
                ", position='" + position + '\'' +
                ", wage='" + wage + '\'' +
                '}';
    }

    public String getInfoToCSV() {
        return getId() +","+ getFullName()+","+
                getBirthday()+","+getGender()+","+
                getNumberOfIdCard()+","+getNumberPhone()+","+
                getEmail()+","+employeeLevel+","+position+","+wage;
    }
}
