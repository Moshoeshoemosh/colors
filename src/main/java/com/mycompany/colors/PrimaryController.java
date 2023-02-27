package com.mycompany.colors;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PrimaryController {

    @FXML
    private Rectangle rectangle3;
    @FXML
    private Rectangle rectangle2;
    @FXML
    private Rectangle rectangle1;
    @FXML
    private Button russiabtn;
    @FXML
    private Button botswanabtn;
    @FXML
    private Button germanybtn;
    @FXML
    private Button spainbtn;
    @FXML
    private Button clearbtn;
    @FXML
    private Button lesothobtn;
    
    private Map<String,Rectangle> rectangles= new HashMap<>();
    
    
    public void start(Stage primaryStage) throws Exception{
        rectangle3.setFill(Color.WHITE);
        rectangle2.setFill(Color.WHITE);
        rectangle1.setFill(Color.WHITE);
        
        for (String key:rectangles.keySet()){
            Rectangle rectangle=rectangles.get(key);
            if(rectangle !=null){
                rectangle.setFill(Color.WHITE);
            }else{
                button.setDisable(true);
            }
                
        }
           
    }

    @FXML
    private void changerussia(ActionEvent event) {
        rectangle3.setFill(Color.RED);
        rectangle2.setFill(Color.BLUE);
        rectangle1.setFill(Color.WHITE);
    }

    @FXML
    private void changebotswana(ActionEvent event) {
        rectangle3.setFill(Color.BLUE);
        rectangle2.setFill(Color.BLACK);
        rectangle1.setFill(Color.BLUE);
    }

    @FXML
    private void changelesotho(ActionEvent event) {
        rectangle3.setFill(Color.GREEN);
        rectangle2.setFill(Color.WHITE);
        rectangle1.setFill(Color.BLUE);
    }

    @FXML
    private void changegermany(ActionEvent event) {
        rectangle3.setFill(Color.YELLOW);
        rectangle2.setFill(Color.RED);
        rectangle1.setFill(Color.BLACK);
    }

    @FXML
    private void changespain(ActionEvent event) {
        rectangle3.setFill(Color.RED);
        rectangle2.setFill(Color.YELLOW);
        rectangle1.setFill(Color.RED);
    }

    @FXML
    private void clear(ActionEvent event) {
        rectangle3.setFill(Color.WHITE);
        rectangle2.setFill(Color.WHITE);
        rectangle1.setFill(Color.WHITE);
    } 
}
