package controller;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import model.User;
import model.UserDB;
import model.UserIO;
import view.SignupJavaFXView;

import java.io.File;
import java.io.IOException;

/**
 * Created by owner on 7/3/2016.
 */
public class SignupController {
    @FXML
    public TextField usname;
    @FXML
    public PasswordField pw;
    @FXML
    public PasswordField confirmpw;
    @FXML
    public TextField firstname;
    @FXML
    public TextField lastname;
    @FXML
    public TextField email;
    @FXML
    public TextField phone;
    @FXML
    public TextField ssn;
    @FXML
    public TextField gender;
    @FXML
    public DatePicker dob;
    @FXML
    public String profilepic;


    public void createAccount(){
        if (validatePassword() && pw.getText().equals(confirmpw.getText())) {
            User user= new User(firstname.getText(),lastname.getText(),ssn.getText(),dob.getPromptText(),gender.getText(),usname.getText(),email.getText(),phone.getText(),pw.getText(),profilepic);
           // System.out.print(user);
            UserDB.getUsers().add(user);
            try{
                UserIO.writeUsers(UserDB.getUsers());
            } catch (IOException e){
                System.err.println("Cannot write UserDB to binary file!");
                e.printStackTrace();
            }
        }
        System.out.println(UserDB.getUsers());
    }
    public void createFileChooser() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle ("Browse Picture");
        fileChooser.getExtensionFilters().addAll(
                new ExtensionFilter("Image Files", "*.png","*.jpg","*.gif"));
      //  File selectedFile = fileChooser.showOpenDialog(SignupJavaFXView.getSignupStage());
     //   System.out.println(selectedFile.getPath());

    }

    private boolean validatePassword() {
        String uniquechar = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,64}";
        return pw.getText().matches(uniquechar);
    }
    }

