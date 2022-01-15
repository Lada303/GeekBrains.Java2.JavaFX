module lada303.gbjava2lesson4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens lada303.chat to javafx.fxml;
    exports lada303.chat;
}