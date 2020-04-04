package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;

public class GPNotifications {
  @FXML
  void GoHome(Event event) {
    Main.createNewScene(event, "sample.fxml");
  }

}


