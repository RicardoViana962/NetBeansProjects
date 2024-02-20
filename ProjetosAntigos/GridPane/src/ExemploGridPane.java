/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Colorindo Festas
 */
public class ExemploGridPane extends Application {
    
    @Override
    public void start(Stage telaEmBranco) {
     GridPane root = new GridPane();
     root.setVgap(10);
     
     root.add(new Rectangle(50, 50, Color.BLUE),0, 0);
     root.add(new Circle(25, Color.RED), 0, 0);
     root.add(new Rectangle(30, 10, Color.YELLOW), 0, 0);
     
     root.add(new Label("CADASTRO DE CLIENTES"), 1, 0);
     
     root.add(new Label("Nome:"), 1, 2);
     root.add(new Label("Endereço:"), 1, 3);
     root.add(new Label("Telefone fixo:"), 1, 4);
     root.add(new Label("Telefone celular:"), 1, 5);
     root.add(new Label("Possui Watsapp:"), 1, 6);
     
     root.add(new TextField(), 2, 2);
     root.add(new TextField(), 2, 3);
     root.add(new TextField(), 2, 4);
     root.add(new TextField(), 2, 5);
     root.add(new TextField(), 2, 6);
     
     root.add(new Button("Cancelar"), 1, 8);
     root.add(new Button("Salvar"), 2, 8);
     
     Scene cena = new Scene(root, 400, 320);
     
     telaEmBranco.setTitle("Exemplo de GridPane");
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
