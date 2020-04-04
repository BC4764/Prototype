package sample;

import javafx.event.Event;
import javafx.fxml.FXML;

public class GPEvents {
  @FXML
  void GoHome(Event event) {
    Main.createNewScene(event, "sample.fxml");
  }
}
