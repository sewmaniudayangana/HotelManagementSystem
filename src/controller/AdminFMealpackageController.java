package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AdminFMealpackageController {
    public AnchorPane mealsContext;

    public void backToAdmin(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AdminFunction.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) mealsContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
