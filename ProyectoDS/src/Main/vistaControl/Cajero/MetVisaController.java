/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.vistaControl.Cajero;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 *
 * @author Jorge Pinargote
 */
public class MetVisaController implements Initializable{
    @FXML 
    private TextField txtnombre;
    @FXML 
    private TextField txtcardnumber;
    @FXML 
    private TextField txtcvv;
    @FXML 
    private DatePicker dpdateexpire;
    @FXML
    private Button btncontinuar;
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
