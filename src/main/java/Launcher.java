import javafx.application.Application;

// launcher class to work around class path issues
public class Launcher {
    public static void main(String[] args) {
        // Just take this as face value
        // unlikely to modify the launcher
        Application.launch(Main.class, args);
    }
}
