package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AdminLogController {
    public AnchorPane adminLogInPage;

    public TextField adminName;
    public TextField adminPassword;
    public Label adminLabel;

    public void goToHome(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePage.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) adminLogInPage.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void loginToAdminFunction(ActionEvent actionEvent) throws IOException {
        if(adminPassword.getText().equals("1111") & adminName.getText().equalsIgnoreCase("Admin")){
            URL resource = getClass().getResource("../view/AdminFunction.fxml");
            Parent load = FXMLLoader.load(resource);
            Stage window = (Stage) adminLogInPage.getScene().getWindow();
            window.setScene(new Scene(load));
        }
        else{
            adminLabel.setText("Enter correct username or password");
        }
    }
}
