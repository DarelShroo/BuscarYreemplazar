package dad.buscaryreemplazar;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class BuscarYreemplazar extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        GridPane gridpane = new GridPane();
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(20);
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth(30);
        ColumnConstraints column3 = new ColumnConstraints();
        column3.setPercentWidth(30);
        ColumnConstraints column4 = new ColumnConstraints();
        column4.setPercentWidth(20);


        gridpane.getColumnConstraints().addAll(column1, column2, column3, column4);
        gridpane.setHgap(10);
        gridpane.setVgap(5);
        gridpane.setPadding(new Insets(0, 10, 0, 10));
        column4.setHalignment(HPos.RIGHT);
        Label buscarLabel = new Label("Buscar:");
        Label reemplazarLabel = new Label("Reemplazar con:");
        TextField buscarTextField = new TextField();
        buscarTextField.setPromptText("buscar");
        TextField reemplazarTextField = new PasswordField();
        reemplazarTextField.setPromptText("reemplazar");
        Button buttonBuscar = new Button("Buscar");
        Button buttonReemplazar = new Button("Reemplazar");
        Button buttonReemplazarTodo = new Button("Reemplazar todo");
        Button buttonCerrar = new Button("Cerrar");
        Button buttonAyuda = new Button("Ayuda");
        CheckBox checkBoxMayusMinus = new CheckBox("Mayúsculas y minúsculas");
        CheckBox checkBoxExpr = new CheckBox("Expresión regular");
        CheckBox checkBoxBuscarAtras = new CheckBox("Buscar hacia atrás");
        CheckBox checkBoxResResult = new CheckBox("Resaltar resultados");

        //Primera Fila
        gridpane.add(buscarLabel, 0, 0);
        // node, columnIndex, rowIndex, columnSpan, rowSpan:
        gridpane.add(buscarTextField, 1, 0, 2, 1);
        gridpane.add(buttonBuscar, 3, 0, 1, 1);

        //Segunda Fila
        gridpane.add(reemplazarLabel, 0, 1);
        gridpane.add(reemplazarTextField, 1, 1, 2, 1);
        gridpane.add(buttonReemplazar, 3, 1);

        //Tercera Fila
        gridpane.add(checkBoxMayusMinus, 1, 2);
        gridpane.add(checkBoxBuscarAtras, 2, 2);
        gridpane.add(buttonReemplazarTodo, 3, 2);

        ///Cuarta Fila
        gridpane.add(checkBoxExpr, 1, 3);
        gridpane.add(checkBoxResResult, 2, 3);

        //Quinta fila
        gridpane.add(buttonCerrar, 3, 3);

        //Sexta Fila
        gridpane.add(buttonAyuda, 3, 4);

        //Buttons width
        buttonBuscar.setPrefWidth(110);
        buttonReemplazar.setPrefWidth(110);
        buttonReemplazarTodo.setPrefWidth(110);
        buttonCerrar.setPrefWidth(110);
        buttonCerrar.setPrefWidth(110);
        buttonAyuda.setPrefWidth(110);

        Scene scene = new Scene(gridpane, 600, 150);
        stage.setTitle("Buscar y reemplazar");
        stage.setScene(scene);
        stage.show();
    }
}
