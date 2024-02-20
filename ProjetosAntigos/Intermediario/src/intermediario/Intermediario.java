/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediario;

/**
 *
 * @author Colorindo Festas
 */
public class Intermediario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i1 = 0;
        int i2 = 1;
        int i3 = 2;
        int i4 = 3;
        int i5 = 4;
        /*System.out.println();
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        */
        int[] ar = new int[10];
        
        for (int i=0; i< ar.length; i++){
            ar[i] = i;
        }
        for (int i=0; i < ar.length; i++){
            System.out.println(ar[i]);
        
        }
    }
    
}
