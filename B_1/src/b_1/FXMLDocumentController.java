/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b_1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;

/**
 *
 * @author Krasen
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Button button;
    @FXML
    private Canvas canvas;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void start(ActionEvent event) {
        GraphicsContext grCont=canvas.getGraphicsContext2D();
        
                //zadacha 1
//        grCont.strokeLine(400, 0, 400, 1000);
//        grCont.strokeLine(0, 200, 1000, 200);
//        for (double i = -150; i < 100; i++) {
//            double y=2*i+10;
//            grCont.fillOval(400+i, 200-y, 2, 2);
//        }
        
        
        // Zadacha 2
//        grCont.strokeLine(200, 0, 200, 1000);
//        grCont.strokeLine(0, 400, 1000, 400);
//        for (double x  = -90; x < 180; x++) {
//            double y=20+50*Math.sin(x/57.3);
//            grCont.fillOval(200+x, 400-y, 1, 1);
//                   
        
        
        
        // zadacha 3
//        grCont.strokeLine(300, 0, 300, 1000);
//        grCont.strokeLine(0, 100, 1000, 100);
//        double x1 = 300;
//        double y1 = 75;
//        grCont.strokeLine(x1-50, y1, x1+50, y1);
//        grCont.strokeLine(x1-50, y1+50, x1+50, y1+50);
//        grCont.strokeLine(x1-50, y1+50,  x1+50, y1);
//        grCont.strokeLine(x1-50, y1+50,  x1-50, y1);
//        grCont.strokeLine(x1+50, y1+50, x1+50, y1);
//        grCont.strokeLine(x1-50, y1, x1+50, y1+50);
        
       
        // zadacha 4
        grCont.strokeLine(100, 0, 100, 1000);
        grCont.strokeLine(0, 300, 1000, 300);
        grCont.strokeOval(25, 225, 150, 150);
        
    }
    
}
