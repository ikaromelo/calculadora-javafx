/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cauculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 03570732231
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField txtn1, txtn2,txtresult;
    @FXML 
    private Button btnsomar;
    @FXML
private void somar(ActionEvent event) {
        Double n1 = Double.parseDouble(txtn1.getText());
        Double result;
        //n2
        //result = n1+n2
        txtresult.setText(n1.toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
