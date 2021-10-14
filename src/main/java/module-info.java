module dad.buscaryreemplazar {
    requires javafx.controls;
    requires javafx.fxml;


    opens dad.buscaryreemplazar to javafx.fxml;
    exports dad.buscaryreemplazar;
}