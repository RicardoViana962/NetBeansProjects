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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Colorindo Festas
 */
public class InterfaceIMC extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Label lblPeso = new Label("Peso: ");
        Label lblAltura = new Label("Altura: ");
        Label lblMensagem = new Label("Seu IMC é: ");
        
        TextField txtPeso = new TextField();
        TextField txtAltura = new TextField();
        
        Button btnCalcular = new Button("Calcular ");
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
