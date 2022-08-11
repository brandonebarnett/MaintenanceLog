module com.brandon.maintenancelog {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.brandon.maintenancelog to javafx.fxml;
    exports com.brandon.maintenancelog;
}