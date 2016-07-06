package controller;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.UserDB;
import view.SignupJavaFXView;

import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.UserDB;
import view.SignupJavaFXView;

        import java.io.IOException;




import java.io.IOException;

public class LoginController {
    @FXML
    TextField usname;
    @FXML
    PasswordField pw;

    public void authenticate() {
        for(int i=0; i< UserDB.getUsers().size();i++){
            if(usname.getText().equals(UserDB.getUsers().get(i).getUsername())){

                System.out.println("Welcome " +usname.getText());
            }
            else System.out.println("no user name");
        }

    }

    public void openSignupView() throws IOException{
        System.out.println("open signup view");
        new SignupJavaFXView();
    }
}
