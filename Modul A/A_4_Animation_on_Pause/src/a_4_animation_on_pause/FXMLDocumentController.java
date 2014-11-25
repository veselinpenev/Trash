/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_4_animation_on_pause;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.util.Duration;

/**
 *
 * @author Krasen
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
     RotateTransition rotate=new RotateTransition();
     ScaleTransition scale=new ScaleTransition();
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void startAnimation(ActionEvent event) {
       rotate.setNode(label);
       rotate.setDuration(Duration.seconds(2));
       rotate.setFromAngle(-30);
       rotate.setToAngle(30);
       rotate.setCycleCount(Timeline.INDEFINITE);
       rotate.setAutoReverse(true);
       rotate.play();
       scale.setNode(label);
       scale.setDuration(Duration.seconds(3));
       scale.setToX(3);
       scale.setToY(3);
       scale.setCycleCount(Timeline.INDEFINITE);
       scale.setAutoReverse(true);
       scale.play();
    }

    @FXML
    private void stopAnimation(ActionEvent event) {
        rotate.stop();
        scale.stop();
    }
    
}
