package lada303.chat;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {
    @FXML
    private TextArea chatText;

    @FXML
    private TextField sendText;

    @FXML
    protected void sendTextToTextArea() {
        if (!sendText.getText().isEmpty() && !sendText.getText().equals(" ")) {
            chatText.appendText(sendText.getText() + "\n");
        }
        sendText.setText("");
        sendText.requestFocus();
    }

    public void clickClose(ActionEvent actionEvent) {
        Platform. runLater(() -> {
            Stage stage = (Stage) chatText.getScene().getWindow();
            stage.close();
        });
    }

    public void clickChangeTheme(ActionEvent actionEvent) {
        MenuItem menuItem = (MenuItem) actionEvent.getSource();
        String cssFile = menuItem.getText().toLowerCase() + ".css";
        Platform. runLater(() -> {
            chatText.getScene().getStylesheets().clear();
            chatText.getScene().getStylesheets().add(cssFile);
            Stage stage = (Stage) chatText.getScene().getWindow();
            stage.setScene(chatText.getScene());
        });


    }
}