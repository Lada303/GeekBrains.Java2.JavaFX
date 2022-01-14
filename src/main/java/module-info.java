module lada303.gbjava2lesson4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens lada303.lesson4 to javafx.fxml;
    exports lada303.lesson4;
}