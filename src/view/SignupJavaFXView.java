package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;


/**
 * Created by owner on 7/2/2016.
 */
public class SignupJavaFXView {

    public SignupJavaFXView() throws IOException {
            Stage signupStage = new Stage();
            Parent signupView = FXMLLoader.load(getClass().getResource("SignupJavaFX.fxml"));
            signupStage.setTitle("Signup Page");
            signupStage.setScene(new Scene(signupView, 300, 275));
            signupStage.show();
        }

}

