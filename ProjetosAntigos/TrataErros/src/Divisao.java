/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**'
 *
 * @author Colorindo Festas
 */
public class Divisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        int v1 = 3;
        int v2 = 4;
        try{
        
        System.out.println("Resultado: "+v1+ " e "+ "-> "+dividir(v1,v2));
        // TODO code application logic here
        }
        catch (Exception x){
            System.out.println("Sinto muito, ocorreu o seguinte erro: "+ x.getMessage());
        }
    }
    public static int dividir(int a, int b)throws Exception{
        if (a < b){
            throw new Exception("Primeiro valor deve ser maior que o segundo.");
        }
        int r = 1;
        try{
           
            r = a/b;
        }
    catch(ArithmeticException e){
            System.out.println(" Erro aritmético: "+e.getMessage());
            
        }
        catch (Exception e){
            System.out.println("Erro genérico: " + e.getMessage());
            
        }
        return r;
       
    }
    
}
