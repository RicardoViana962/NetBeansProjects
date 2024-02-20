/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturasderepeticao;

/**
 *
 * @author Colorindo Festas
 */
public class EstruturasDeRepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cc = 0;
        while(cc<10){
            cc++;
            if (cc == 2 || cc == 3 || cc == 4){
                continue;
            }
            if (cc == 7){
                break;
            }
            System.out.println("Cambalhota " + cc);
            
            
        }
        // TODO code application logic here
    }
    
}
