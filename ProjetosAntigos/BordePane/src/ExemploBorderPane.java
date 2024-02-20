/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Colorindo Festas
 */
public class ExemploBorderPane extends Application {
    
    @Override
    public void start(Stage telaEmBranco) {
        //FILHOS do BorderPane
        /*HBox para o topo*/
        HBox opcoes = new HBox(4);
        opcoes.getChildren().add(new Button("Opção 1"));
        opcoes.getChildren().add(new Button("Opção 2"));
        
        /*Botões para laterais*/
        Button btnEsquerda = new Button("Esquerda");
        Button btnDireita = new Button("Direita");
        
        /*Caixa de texto para o centro*/
        TextField txtCentro = new TextField();
        
        /*Rótulo para o rodapé*/
        Label lblRodape = new Label("Sistema construído em: 2024");
        
        //Painel principal
        /*Primary node, também chamado de root Node*/
        BorderPane root = new BorderPane();
        root.setTop(opcoes);
        root.setLeft(btnEsquerda);
        root.setRight(btnDireita);
        root.setCenter(txtCentro);
        root.setBottom(lblRodape);
        
        //Alinhando alguns nodes
        BorderPane.setAlignment(btnEsquerda, Pos.CENTER);
        BorderPane.setAlignment(btnDireita, Pos.CENTER);
        BorderPane.setAlignment(txtCentro, Pos.CENTER);
        BorderPane.setAlignment(lblRodape, Pos.CENTER);
        
        //Scene
        Scene cena = new Scene(root, 300, 300);
        
        //Jogando tudo na stage
        
        telaEmBranco.setTitle("Exenplo de BorderPane ");
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
