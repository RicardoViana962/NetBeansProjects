/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Colorindo Festas
 */
public class ClassesJavaFx extends Application {
    
    @Override
    public void start(Stage telaEmBranco) {
        //NODES ISOLADOS
        Label labelA = new Label("Eu sou um label isolado");
        
        
        //BRANCH NODE A
        Label labelB = new Label("Eu sou o primeiro label do grupo A");
        labelB.setLayoutX(0);
        labelB.setLayoutY(0);
        
        
        Label labelC = new Label("Eu sou o segundo label do grupo A");
        labelC.setLayoutX(0);
        labelC.setLayoutY(20);
        
        Group grupoA = new Group();
        grupoA.getChildren().add(labelB);
        grupoA.getChildren().add(labelC);
        
        //BRANCH NODE B
        Label labelD = new Label("Eu sou o primeiro label do grupo B");
        labelD.setLayoutX(0);
        labelD.setLayoutY(0);
        
        Label labelE = new Label("Eu sou o segundo label do grupo B");
        labelE.setLayoutX(0);
        labelE.setLayoutY(20);
        
        Group grupoB = new Group();
        grupoB.getChildren().add(labelD);
        grupoB.getChildren().add(labelE);
        
        //PRIMARY NODE
        FlowPane primaryNode = new FlowPane(Orientation.VERTICAL);
        primaryNode.getChildren().add(labelA);
        primaryNode.getChildren().add(grupoA);
        primaryNode.getChildren().add(grupoB);
        
        //SCENE
        Scene cena = new Scene(primaryNode, 300, 400);
        
        //JOGANDO TUDO NA STAGE
        telaEmBranco.setTitle("Inter-relação entre classes JavaFX ");
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
