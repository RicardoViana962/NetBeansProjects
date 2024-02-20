/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distanciacombustivel;

/**
 *
 * @author Colorindo Festas
 */
public class DistanciaCombustivel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        do{
            System.out.println(i);
             if(i==3)
                 break;
             i++;
        } while (i<5);
        
        System.out.println("-");
        
        int distancia = 500;
        double tanqueCombustivel = 50;
        double kmPorLitro = 8.5;
        double consumoPorQuilometro = 1 / kmPorLitro;
        
        for (int decorrido = 1; decorrido <= distancia; decorrido++){
            tanqueCombustivel -= consumoPorQuilometro;
            System.out.println("Quilometros rodados: " + decorrido);
            
            if(tanqueCombustivel <= 0){
                System.out.println("Acabou a gasolina.");
                break;
            }
        }
        // TODO code application logic here
    }
    
}
