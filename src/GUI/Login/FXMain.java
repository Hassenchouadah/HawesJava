package GUI.Login;

import Service.utilisateurService;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

/**
 *
 * @author Hassen
 */
public class FXMain extends Application {

    utilisateurService US;

    @Override
    public void start(Stage primaryStage) {
        US = new utilisateurService();
        if (US.currentUser.getIdUser() == 0) {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));

                Scene scene = new Scene(root, 1366, 768);

                primaryStage.setTitle("Se connecter");
                primaryStage.setScene(scene);
                primaryStage.show();
            } catch (IOException ex) {
                System.out.println("GUI.FXMain.start()");
            }
        } else {

            try {
                Parent root = FXMLLoader.load(getClass().getResource("InterfaceAdmin.fxml"));

                Scene scene = new Scene(root, 1366, 768);

                primaryStage.setTitle("Dashboard");
                primaryStage.setScene(scene);
                primaryStage.show();
            } catch (IOException ex) {
                System.out.println("GUI.FXMain.start()");
            }

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
