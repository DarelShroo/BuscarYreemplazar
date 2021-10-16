package dad.buscaryreemplazar;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BuscarYreemplazar extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
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
        GridPane gridPane = new GridPane();
        CheckBox checkBoxMayusMinus = new CheckBox("Mayúsculas y minúsculas");
        CheckBox checkBoxExpr = new CheckBox("Expresión regular");
        CheckBox checkBoxBuscarAtras = new CheckBox("Buscar hacia atrás");
        CheckBox checkBoxResResult = new CheckBox("Resaltar resultados");

        gridPane.setHgap(6);
        gridPane.setVgap(6);
        gridPane.setPadding(new Insets(6));

        //Primera Fila
        gridPane.add(buscarLabel, 0, 0);
        // node, columnIndex, rowIndex, columnSpan, rowSpan:
        gridPane.add(buscarTextField, 1, 0, 2, 1);
        gridPane.add(buttonBuscar, 3, 0);

        //Segunda Fila
        gridPane.add(reemplazarLabel, 0, 1);
        gridPane.add(reemplazarTextField, 1, 1, 2, 1);
        gridPane.add(buttonReemplazar, 3, 1);

        //Tercera Fila
        gridPane.add(checkBoxMayusMinus, 1, 2);
        gridPane.add(checkBoxBuscarAtras, 2, 2);
        gridPane.add(buttonReemplazarTodo, 3, 2);

        //Cuarta Fila
        gridPane.add(checkBoxExpr, 1, 3);
        gridPane.add(checkBoxResResult, 2, 3);

        //Quinta fila
        gridPane.add(buttonCerrar, 3, 3);

        //Sexta Fila
        gridPane.add(buttonAyuda, 3, 4);

        //TexField min-width
        reemplazarTextField.setMinWidth(280);
        buscarTextField.setMinWidth(280);

        //Buttons min-width
        buttonBuscar.setMinWidth(110);
        buttonReemplazar.setMinWidth(110);
        buttonReemplazarTodo.setMinWidth(110);
        buttonCerrar.setMinWidth(110);
        buttonCerrar.setMinWidth(110);
        buttonAyuda.setMinWidth(110);

        Scene myScene = new Scene(gridPane, 500, 160);
        primaryStage.setScene(myScene);
        primaryStage.setTitle("Buscar y Reemplazar");
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
}
