/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer;

import java.net.URL;
import java.time.Clock;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;

/**
 *
 * @author Krasen
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button start;
    @FXML
    private Button stop;
    int hours =0;
    int min = 0;
    int sec = 0;
    Timeline t = new Timeline(new KeyFrame(Duration.seconds(1), new UpdateTimer()));
        
    private class UpdateTimer implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent event) {
            sec++;
            if(sec == 60){
                min++;
                sec = 0;
                if(min == 60){
                    hours++;
                    min = 0;
                }
            }
            String print = String.format("%02d : %02d : %02d" , hours, min, sec);
            label.setText(print);
        }
    }
    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        t.setCycleCount(Timeline.INDEFINITE);
        t.play();
            
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void stopTimer(ActionEvent event) {
        t.stop();
    }
    
}
