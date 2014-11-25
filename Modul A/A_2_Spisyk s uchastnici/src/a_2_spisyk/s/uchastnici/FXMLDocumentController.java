/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_2_spisyk.s.uchastnici;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;

/**
 *
 * @author Krasen
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private ListView<String> listView;
    ObservableList<String> elements=FXCollections.observableArrayList();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void openFile(ActionEvent event) {
        FileChooser fileChooser=new FileChooser();
        File file=new FileChooser().showOpenDialog(null);
        if (file!=null) {
            load(file.getAbsolutePath());
        }
    }

    @FXML
    private void deleteName(ActionEvent event) {
        int deleteIndex;
        deleteIndex=listView.getSelectionModel().getSelectedIndex();
        elements.remove(deleteIndex);
    }
    private void load(String fileName){
        elements.clear();
        Scanner sc=null;
        try{
            sc=new Scanner(new File(fileName));
        }
        catch(FileNotFoundException ex){
            System.exit(1);
        }
        while(sc.hasNext()){
            listView.setItems(elements);
            elements.add(sc.next());
        }
        
    }
    
}
