package kodilla.window;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import kodilla.MainApplication;

public class WinnerWindow {

    public static void showWinner(String name, String title, boolean propertyShow){
        Stage window = new Stage();
        window.setTitle("Winner");
        window.setMinHeight(200);
        window.setMinWidth(500);
        window.initModality(Modality.APPLICATION_MODAL);

        Label label = new Label(title);
        Label label1 = new Label(name);
        Button button = new Button("Ok");
        button.setOnAction(event -> {
            window.close();
            MainApplication.clearBoard();
            MainApplication.borderPane.setCenter(MainApplication.setText());
        });
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, label1, button);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);

        if (propertyShow){
            window.show();
        }else {
            window.showAndWait();
        }
    }
}
