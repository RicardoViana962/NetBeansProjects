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
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Colorindo Festas
 */
public class FlowPane extends Application {
    
    @Override
    public void start(Stage telaEmBranco) {
        //PAINEL E SEUS NODES
        
        /*Criar o painel*/
        FlowPane painel = new FlowPane();
        painel.setOrientation(Orientation.HORIZONTAL);
        painel.setVgap(4);
        painel.setHgap(10);
        
        /*Colocar node dentro do pane*/
        for(int i = 1; i<51; i++){
            Button b = new Button("B" + i);
            b.setPrefWidth(50);
            painel.getChildren().add(b):
            
        }
        //Scene
        Scene cena = new Scene(painel, 300, 300);
        
        //Jogando tudo na stage
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
