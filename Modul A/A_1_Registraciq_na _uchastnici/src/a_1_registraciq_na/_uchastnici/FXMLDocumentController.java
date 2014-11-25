/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_1_registraciq_na._uchastnici;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Krasen
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextField textFieldName;
    @FXML
    private ListView<String> listView;
    ObservableList<String> elements=FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void saveFile(ActionEvent event) {
        String fileName=JOptionPane.showInputDialog("File Name: ");
        FileChooser fileCh=new FileChooser();
        fileCh.setInitialFileName(fileName+".txt");
        File file=fileCh.showSaveDialog(null);
        if (file!=null) {
            save(file.getAbsolutePath());
        }
    }

    @FXML
    private void addName(ActionEvent event) {
        listView.setItems(elements);
        String element=textFieldName.getText();
        if (element.length()>0) {
        elements.add(textFieldName.getText());
        textFieldName.setText("");
        textFieldName.requestFocus();
        }else{
            textFieldName.requestFocus();
        }
        
    }

    @FXML
    private void deleteName(ActionEvent event) {
        int deleteIndex;
        deleteIndex=listView.getSelectionModel().getSelectedIndex();
        elements.remove(deleteIndex);
    }
    private void save(String fileN){
        PrintWriter writer=null;
        try{
            writer=new PrintWriter(fileN);
        }
        catch (IOException exeption){
            System.exit(1);
        }
   
        for (int i = 0; i <elements.size() ; i++) {
            String result=elements.get(i);
            writer.println(result);            
        }
        writer.close();
    }
    
}
