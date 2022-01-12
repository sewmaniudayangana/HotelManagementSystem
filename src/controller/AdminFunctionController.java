package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AdminFunctionController {
    public AnchorPane adminContext;

    public void moveToRoomDetails(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminRoom.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) adminContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void goToMeal(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminFMealpackage.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) adminContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void goToIncome(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminFIncome.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) adminContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void backToHome(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePage.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) adminContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
