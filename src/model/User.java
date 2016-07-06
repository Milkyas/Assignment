package model;

import java.io.Serializable;

/**
 * Created by owner on 7/3/2016.
 */
public class User extends Person implements Serializable {
    private String username;
    private String email;
    private String phone;
    private String pw;
    private String photo;

    public User(String username, String pw) {
        this.username = username;
        this.pw = pw;
    }
    public User(String username) {
        this.username = username;
    }

    public User(String username, String email, String phone, String pw, String photo) {
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.pw = pw;
        this.photo = photo;
    }

    public User(String firstname, String lastname, String SSN, String dob, String gender, String username, String email, String phone, String pw, String photo) {
        super(firstname, lastname, SSN, dob, gender);
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.pw = pw;
        this.photo = photo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", pw='" + pw + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }
}
