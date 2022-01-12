package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ReceptionFunctionController {

    public AnchorPane ReceptionFunction;

    public void goToAvailable(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionFAvailableR.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) ReceptionFunction.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void goToMaintain(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionFMaintainR.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) ReceptionFunction.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void goToHome(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePage.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) ReceptionFunction.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
