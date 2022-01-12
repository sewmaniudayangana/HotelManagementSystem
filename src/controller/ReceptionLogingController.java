package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ReceptionLogingController {
    public AnchorPane reception;
    public TextField txtName;
    public TextField txtPassword;
    public Label receptionLabel;

    public void gotohome(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePage.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) reception.getScene().getWindow();
        window.setScene(new Scene(load));

    }

    public void logInToReceptionistFunction(ActionEvent actionEvent) throws IOException {
        if (txtPassword.getText().equals("2222") & txtName.getText().equalsIgnoreCase("Receptionist")) {
            URL resource = getClass().getResource("../view/ReceptionFunction.fxml");
            Parent load = FXMLLoader.load(resource);
            Stage window = (Stage) reception.getScene().getWindow();
            window.setScene(new Scene(load));
        } else {
            receptionLabel.setText("Enter correct username or password");
        }
    }
}
