package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class HomePageController {
    public AnchorPane homePage;

    public void goToReceptionPage(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ReceptionLoging.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) homePage.getScene().getWindow();
        window.setScene(new Scene(load));

    }


    public void goToAdmin(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminLog.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) homePage.getScene().getWindow();
        window.setScene(new Scene(load));

    }
}