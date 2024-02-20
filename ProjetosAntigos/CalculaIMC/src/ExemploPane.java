/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author Colorindo Festas
 */
public class ExemploPane extends Application {
    
    @Override
    public void start(Stage telaEmBranco) {
        
        //PAINEL E SEUS NODES
        /*Criar o painel*/
        Pane painel = new BorderPane();
        
        /*Criar o nde círculo*/
        Circle cabeca = new Circle(135,60, 35);
        /*Criar o nodes retangulo */
        Rectangle tronco = new Rectangle(100,100,70,90);
        Rectangle bracoEsquerdo = new Rectangle(70,100,25,75);
        Rectangle bracoDireito = new Rectangle(175,100,25,75);
        Rectangle pernaEsquerda = new Rectangle(100,195,30,80);
        Rectangle pernaDireita = new Rectangle(140,195,30,80);
        
        //Adcionando cor
        cabeca.setFill(Color.RED);
        tronco.setFill(Color.ORANGE);
        bracoEsquerdo.setFill(Color.BLUE);
        bracoDireito.setFill(Color.BLUE);
        pernaDireita.setFill(Color.AQUAMARINE);
        pernaEsquerda.setFill(Color.AQUAMARINE);
        //ADCIONANDO NODES NO PAINEL
        painel.getChildren().add(cabeca);
        painel.getChildren().add(bracoEsquerdo);
        painel.getChildren().add(bracoDireito);
        painel.getChildren().add(tronco);
        painel.getChildren().add(pernaEsquerda);
        painel.getChildren().add(pernaDireita);        
        //SCENE
        Scene cena = new Scene(painel, 280, 330);
        
        //JOGANDO TUDO NA STAGE
        telaEmBranco.setTitle("Exemplo de Pane ");
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
