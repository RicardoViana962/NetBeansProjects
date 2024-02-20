/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciojavanapratica;

import java.util.Scanner;

/**
 *
 * @author Colorindo Festas
 */
public class ExercicioJavaNaPratica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        Scanner num = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número: ");
        int x = num.nextInt();
        
        System.out.println("Informe o segundo número: ");
        int y = num.nextInt();
        
        System.out.println("Informe o terceiro número: ");
        int z = num.nextInt();
        
        double media = (x+y+z)/3;
        System.out.println("Média = " +media);
        
        x = Math.max(x,y);
        y = Math.max(y,z);
        System.out.println("Maior = "+Math.max(x,y));
        
        // TODO code application logic here
    }
    
}
