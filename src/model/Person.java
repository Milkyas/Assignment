package model;

/**
 * Created by owner on 7/3/2016.
 */
public class Person {
    public String firstname;
    public String lastname;
    public String SSN;
    public String dob;
    public String gender;

    public Person(String firstname, String lastname, String SSN, String dob, String gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.SSN = SSN;
        this.dob = dob;
        this.gender = gender;
    }

    public Person() {
        this.firstname = "Mike";
        this.lastname = "John";
        this.dob = "2/2/1990";
        this.gender = "male";
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", SSN=" + SSN +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                '}';
    }
}
