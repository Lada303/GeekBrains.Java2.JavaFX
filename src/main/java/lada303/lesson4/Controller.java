package lada303.lesson4;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextArea chatText;
    @FXML
    private TextField sendText;
    @FXML
    protected void sendTextToTextArea() {
        if (sendText.getText() != "") {
            chatText.appendText(sendText.getText() + "\n");
            sendText.setText("");
        }
    }

}