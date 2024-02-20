/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesBase;

import ClassesBase.Roleta;


import ClassesBase.Dado;
/**
 *
 * @author Colorindo Festas
 */
public class TestaJogo {
    
    public static void main(String[] args) {
        
        Dado dd = new Dado();
        dd.executaJogo(6);
        dd.mostraResultado();
        
        System.out.println("-");
        
        Roleta r1 = new Roleta();
        r1.executaJogo(35);
        r1.mostraResultado();
      
    }

    
    
}
