package case_study.model.person;

import java.util.Objects;

public abstract class Person {
    private String code;
    private String name;
    private String birth;
    private String gender;
    private String cnnd;
    private String phone;
    private String email;

    public Person(String code, String name, String birth, String gender, String cnnd, String phone, String email) {
        this.code = code;
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.cnnd = cnnd;
        this.phone = phone;
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCnnd() {
        return cnnd;
    }

    public void setCnnd(String cnnd) {
        this.cnnd = cnnd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(code, person.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                ", gender='" + gender + '\'' +
                ", cnnd='" + cnnd + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'';
    }
}
