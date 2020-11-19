
package di_controltableview2;

import di_controltableview2.DI_ControlTableView2.Person;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author crist
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private TableView<Person> tableView;
    @FXML private TextField firstNameField;
    @FXML private TextField lastNameField;
    @FXML private TextField emailField;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) 
    {
        ObservableList<Person> data = tableView.getItems();
        data.add(new Person(firstNameField.getText(), lastNameField.getText(), emailField.getText()));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
