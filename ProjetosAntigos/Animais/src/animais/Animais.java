/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

import static javafx.application.Application.launch;


public class Animais {
    protected int ID;
    protected String nome;
    public Animais(int ID, String nome){
        this.ID = ID;
        this.nome = nome;
    } 
    public int getID(){return ID;}
    public String getNome(){return nome;}
    

public static void main(String[] args){}

public class Terrestre extend Animais{
    public Animais(int ID, String nome){
        super(ID,nome)
    }
}
}

