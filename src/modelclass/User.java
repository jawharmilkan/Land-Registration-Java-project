package modelclass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public abstract class User {
    protected String username, password, userType;
    private String usertype;

    public boolean authenticateUser(String username, String password, String userType) {
        // Read user information from the text file
        try (BufferedReader br = new BufferedReader(new FileReader("userAccounts.bin"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] userInfo = line.split(",");
                if (username.equals(userInfo[0].trim()) && password.equals(userInfo[1].trim())
                        && userType.equals(userInfo[2].trim())) {
                    return true; // Authentication successful
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false; // Authentication failed
    }

    private void setUserScene(String type, ActionEvent event) throws IOException {
        Parent userSceneParent;
        switch (type) {
            case "Land Owner":
                userSceneParent = FXMLLoader.load(getClass().getResource("landOwnerHomeScene.fxml"));
                break;
            case "Employee":
                userSceneParent = FXMLLoader.load(getClass().getResource("employeeHomeScene.fxml"));
                break;
            case "H.R":
                userSceneParent = FXMLLoader.load(getClass().getResource("hRHomeScene.fxml"));
                break;
            case "Finance Department":
                userSceneParent = FXMLLoader.load(getClass().getResource("financeDepartmentHomeScene.fxml"));
                break;
            case "Legal Advisor":
                userSceneParent = FXMLLoader.load(getClass().getResource("legalAdvisorHomeScene.fxml"));
                break;
            case "Land Buyer":
                userSceneParent = FXMLLoader.load(getClass().getResource("LandBuyerhomescene.fxml"));
                break;
            case "Land registration administrative":
                userSceneParent = FXMLLoader.load(getClass().getResource("LandRegistrationAdministrative.fxml"));
                break;
            default:
                throw new IOException("Invalid user type");
        }
        Scene scene2 = new Scene(userSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene2);
        window.show();

       
        
    }

    public void login(String user, String password, String uType, ActionEvent event) {
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        File f = null;
        BufferedReader br = null;

        try {
            f = new File("userAccounts.bin");
            if (!f.exists()) {
                a.setTitle("Login Issue");
                a.setHeaderText("Issue found");
                a.setContentText("The login information file is not present!");
                a.showAndWait();
            } else {
                br = new BufferedReader(new FileReader(f));
                String line;
                boolean loggedIn = false;

                while ((line = br.readLine()) != null) {
                    String[] userInfo = line.split(",");
                    if (user.equals(userInfo[0].trim()) && password.equals(userInfo[1].trim())
                            && uType.equals(userInfo[2].trim())) {
                        loggedIn = true;
                        setUserScene(uType, event);
                        // Added this line to close the BufferedReader
                        br.close();
                        break;
                    }
                }

                if (!loggedIn) {
                    a.setTitle("Login Issue");
                    a.setHeaderText("Invalid login");
                    a.setContentText("Invalid login credentials, please try again!");
                    a.showAndWait();
                }
            }
        } catch (IOException e) {
        }
    }

    public void register(String name, String password, String usertype) {
        this.username = name;
        this.password = password;
        this.usertype = usertype;
        
       // username, password, usertype

        // Save the user to the database
        
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("userAccounts.bin", true))) {
            bw.write(username + "," + password + "," + usertype + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
