/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Colorindo Festas
 */
public class FlowPane extends Application {
    
    @Override
    public void start(Stage telaEmBranco) {
      HBox painel = new HBox();
      painel.setSpacing(4);
      
      for (int i = 1; i<9; i++){
        Button b = new Button ("X"+ i);
        b.setPrefWidth(50);
        painel.getChildren().add(b);
      }
      Scene cena = new Scene(painel, 300, 200);
      
      telaEmBranco.setTitle("Exemplo de FlowPane");
      telaEmBranco.setScene(cena);
      telaEmBranco.sizeToScene();
      telaEmBranco.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
