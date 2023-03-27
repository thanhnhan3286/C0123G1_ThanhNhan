package case_study_furama_resort_module_2.model.person;

public abstract class Person {
    private String fullName;
    private String birthday;
    private String gender;
    private String numberOfIdCard;
    private String numberPhone;
    private String email;

    public Person() {
    }

    public Person(String fullName, String birthday, String gender, String numberOfIdCard, String numberPhone, String email) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.gender = gender;
        this.numberOfIdCard = numberOfIdCard;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNumberOfIdCard() {
        return numberOfIdCard;
    }

    public void setNumberOfIdCard(String numberOfIdCard) {
        this.numberOfIdCard = numberOfIdCard;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "People{" +
                "fullName='" + fullName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", numberOfIdCard='" + numberOfIdCard + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
