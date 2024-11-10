package simulation;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import modelclass.User;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import javafx.scene.Node;


/**
 * FXML Controller class
 *
 * @author Unknown
 */
public class LandBuyergivevotesceneController implements Initializable {

    @FXML
    private ComboBox<String> givevotecombobox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        givevotecombobox.getItems().addAll("YES", "NO");
        givevotecombobox.setValue("No");
    }

    @FXML
    private void Givevotesubmit(MouseEvent event) {
        // Get the selected vote from the combobox.
        String vote = givevotecombobox.getValue();

        // Get the current user's name.
       
       // String username = "Land Buyer";

        // Save the vote to a binary file.
        try {
            File file = new File("Land buyer vote.bin");
            if (!file.exists()) {
                file.createNewFile();
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                writer.write( vote);
            }
        } catch (IOException e) {
            System.err.println("Failed to save vote to file.");
            e.printStackTrace();
        }

        // Show a confirmation message.
        System.out.println("Vote submitted successfully.");
    }

    @FXML
    private void landbuyerbackbtn(MouseEvent event) throws IOException {
        {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("LandBuyerhomescene.fxml"));
         Scene scene2 = new Scene(scene2Parent);
         Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
         window.setScene(scene2);
         window.show();
    }
    }
     
    
    
}