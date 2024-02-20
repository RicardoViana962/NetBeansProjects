/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Random;

/**
 *
 * @author Colorindo Festas
 */
public class Roleta extends Jogo {
    public void executaJogo(){
        Random rnd = new Random();
        this.setResultado (rnd.nextInt(37));
    }
   
    
    
}
