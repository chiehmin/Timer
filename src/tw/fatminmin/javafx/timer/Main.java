package tw.fatminmin.javafx.timer;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application {

    private Label text;


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 100));
        primaryStage.setAlwaysOnTop(true);
        primaryStage.show();

        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                CountDownTimer.getTimer().stop();
            }
        });

        text = (Label) root.lookup("#text");
        text.setText("30:00");
        CountDownTimer.getTimer().setLabel(text);
    }




    public static void main(String[] args) {
        launch(args);
    }
}
