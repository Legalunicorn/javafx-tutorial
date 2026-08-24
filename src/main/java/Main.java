import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Label -> node, is text type
        Label helloWorld = new Label("Hello World!");
        // Scene -> stores nodes
        Scene scene = new Scene(helloWorld);
        // stage is higher than scene
        stage.setScene(scene);
        // set the scene then show
        stage.show();
    }
}
