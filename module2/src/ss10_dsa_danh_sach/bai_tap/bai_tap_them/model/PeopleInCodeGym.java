package ss10_dsa_danh_sach.bai_tap.bai_tap_them.model;

import java.util.Scanner;

public abstract class PeopleInCodeGym {
    int id;
    String name;
    String birthday;
    String gender;

    public PeopleInCodeGym() {
    }

    public PeopleInCodeGym(int id, String name, String birthday, String gender) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
    }



    @Override
    public String toString() {
        return "PeopleInCodeGym{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
