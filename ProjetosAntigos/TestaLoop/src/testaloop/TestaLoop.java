/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaloop;

/**
 *
 * @author Colorindo Festas
 */
public class TestaLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int n = 0;
        
       // while (n<=5){
         //   System.out.println(n);
          //  n++;
        System.out.println("Teste de while");
        int n = 1;
        while (n<5){
            System.out.println(n);
            
            if(n==3)
                break;
            n++;
        
        }
        System.out.println("-");
        System.out.println("Teste de do/while");
        int i = 0;
        do {
            System.out.println(i);
            
            if(i==3)
                break;
            i++;
        }while (i<5);
        
        System.out.println("Teste de for");
        
        for(int z= 0; z<5; z++){
            System.out.println(z);
            
            if (z==3)
                break;
        }
        
        int distancia = 500;
        double tanqueGasolina = 50;
        double quilometrosPorLitro = 8.5;
        double consumoPorQuilometro = 1/quilometrosPorLitro;
        
        for (int decorrido = 1; decorrido <= distancia; decorrido++){
            tanqueGasolina -= consumoPorQuilometro;
            System.out.println("Quilometros rodados: "+ decorrido);
            
            if(tanqueGasolina <= 0){
                System.out.println("Acabou a gasolina.");
                break;
            }
                
        }
        
        
    }
    
}
