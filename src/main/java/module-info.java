module me.korbsti.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens me.korbsti.demo to javafx.fxml;
    exports me.korbsti.demo;
}