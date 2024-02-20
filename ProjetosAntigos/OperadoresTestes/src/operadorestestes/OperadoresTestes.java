/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorestestes;

/**
 *
 * @author Colorindo Festas
 */
public class OperadoresTestes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int valor1 = 5;
        int valor2 = 10;
        
        if(valor1 == valor2) System.out.println("Valor1 é igual a valor2: ");
        
        if(valor1 != valor2) System.out.println("Valor1 não é igual a valor2: ");
        
        if(valor1 > valor2) System.out.println("Valor1 é maior que valor2: ");
        
        if(valor1 < valor2) System.out.println("Valor1 é menor que valor2: ");
        
        if(valor1 >= valor2) System.out.println("Valor1 é maior ou igual que valor2: ");
        
        if(valor1 <= valor2) System.out.println("Valor1 é menor ou igual que valor2");
        */
        /*int idade = 17;
        
        if (idade>=18){
            System.out.println("Você já pode dirigir");
            System.out.println("Inscreva-se em uma autoescola");
        }else{
            System.out.println("Você ainda precisa esperar para dirigir");
            System.out.println("Tenha um pouco de paciência");
        }*/
        double valorDec = 5;
        int valorInt = (int) valorDec;
        
        System.out.println("Divisão do decimal: " + valorDec /2);
        System.out.println("Divisão do inteiro "+ valorInt / 2);
        
        if (valorDec / 2 == valorInt / 2){
            System.out.println("Mesmo resultado. ");
        }else{
            System.out.println("Resultados diferentes.");
        }
    }
    
}
