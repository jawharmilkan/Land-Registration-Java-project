
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.User;


/**
 * FXML Controller class
 *
 * @author jawhar
 */
public class HomeSceneController implements Initializable {

    @FXML
    private PasswordField passwordTextField;
    @FXML
    private ComboBox userTypeComboBox;
    @FXML
    private TextField userNameTextField;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        userTypeComboBox.getItems().addAll("Land Owner", "Employee", "H.R", "Finance Department", "Legal Advisor");

        userTypeComboBox.setValue("Land Owner");
    }

    @FXML
    private void loginButtonOnAction(ActionEvent event) 
    {
        String username = userNameTextField.getText();
        String password = passwordTextField.getText();
        String usertype = userTypeComboBox.getValue().toString();
        
        User u = new User() {};
        u.login(username, password, usertype, event);
    }

    @FXML
   
    private void registerbtn(MouseEvent event) {
      // Get the scene's stage.
      Stage stage = (Stage) userNameTextField.getScene().getWindow();

      // Load the Registrationscene.fxml file.
      try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Registerationscene.fxml"));
        Parent root = loader.load();

        // Set the scene to Registrationscene.fxml.
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
      } catch (IOException e) {
        System.err.println("Failed to load Registrationscene.fxml file.");
        e.printStackTrace();
      }
    }


}
