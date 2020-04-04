package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;


  public class Controller {

    @FXML
    private AnchorPane GPNHome;

    @FXML
    private Button GPEvents;

    @FXML
    private Button GPArticles;

    @FXML
    private Button GPContact;

    @FXML
    private Button GPApplications;

    @FXML
    private Button GPPrograms;

    @FXML
    private Button GPNotifications;

    @FXML
    private ImageView GPN;

    @FXML
    void GPNArticles(Event event) {
      Main.createNewScene(event, "GP_Articles.fxml");
    }

    @FXML
    void GPNContact(Event event) {
      Main.createNewScene(event, "GP_Contact.fxml");
    }

    @FXML
    void GPNNotifications(Event event) {
      Main.createNewScene(event, "GP_Notifications.fxml");
    }

    @FXML
    void GPNPrograms(Event event) {
      Main.createNewScene(event, "GP_Programs.fxml");
    }

    @FXML
    void GPNapplications(Event event) {
      Main.createNewScene(event, "GP_Applications.fxml");
    }

    @FXML
    void GracePlaceEvents(Event event) {
      Main.createNewScene(event, "GP_Events.fxml");
    }

  }
