/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparaçãostring;

/**
 *
 * @author Colorindo Festas
 */
public class ComparaçãoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Ricardo";
        String nome2 = "Ricardo";
        String nome3 = new String("Ricardo");
        String res;
        /**res = (nome1==nome3)?"igual":"diferente";*/
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
    }
    
}
