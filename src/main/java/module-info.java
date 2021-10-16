module com.dad.buscaryreemplazar {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.dad.buscaryreemplazar to javafx.fxml;
    exports dad.buscaryreemplazar;
}