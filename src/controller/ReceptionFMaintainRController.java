package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ReceptionFMaintainRController {
    public AnchorPane maintainContext;

    public void backToReception(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionFunction.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) maintainContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
