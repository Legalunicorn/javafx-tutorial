import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private ScrollPane scrollPane; // layout
    private VBox dialogContainer;
    private TextField userInput;
    private Button sendButton;
    private Scene scene;

    private Image userImage = new Image(this.getClass().getResourceAsStream("/images/DaUser.png"));
    private Image dukeImage = new Image(this.getClass().getResourceAsStream("/images/DaDuke.png"));


    @Override
    public void start(Stage stage) throws Exception {
        // we have to init layout
        scrollPane = new ScrollPane();
        dialogContainer = new VBox();
        // set the VBox inside the scroll pane
        scrollPane.setContent(dialogContainer);

        userInput = new TextField();
        sendButton = new Button("Send");

        // Two profiles
        DialogBox dialogBox = new DialogBox("Hello!", userImage);
        dialogContainer.getChildren().addAll(dialogBox);

        // anchor pane is like the higher level node
        // its a layout also that sticks stuff to edge
        AnchorPane mainLayout = new AnchorPane();
        mainLayout.getChildren().addAll(
                scrollPane,
                userInput,
                sendButton
        );
        scene = new Scene(mainLayout);
        stage.setScene(scene);
        stage.show();

        // add more later..
    }
}
