module com.example.doodle_jump {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.doodle_jump to javafx.fxml;
    exports com.example.doodle_jump;
}