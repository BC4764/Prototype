package sample;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void createNewScene(ActionEvent event, String s) {
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent rootMain = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene sceneMain = new Scene(rootMain);
        primaryStage.setScene(sceneMain);
        primaryStage.show();
    }
    public static void createNewScene(Event event, String newFileFXML){
        Parent newRoot = null;
        try {
            newRoot = FXMLLoader.load(Main.class.getResource(newFileFXML));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene newScene = new Scene(newRoot);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(newScene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
