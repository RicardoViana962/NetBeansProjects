/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Random;


public class Jogo implements InterfaceJogos {
    
    //ATRIBUTOS 
    private int aposta;
    private int resultado;
    //Getters e Setters
    public void setAposta(int aposta){
        if (aposta > 6 || aposta < 1)
            System.out.println("Aposta inválida!");
        this.aposta = aposta;
    }
    
    public void setResultado(int resultado){
        this.resultado = resultado;
    }
    
    //MÉTODOS
    public void executaJogo(){
        Random rnd = new Random();
        this.resultado= rnd.nextInt(6)+1;
    }
   
    public void executaJogo(int aposta){
        this.aposta = aposta;
        this.executaJogo();
    }
    
    public void mostraResultado(){       
              
        System.out.println("Sua aposta: "+aposta+" Resultado "+resultado);
        
        if (this.resultado == this.aposta){
            System.out.println("Parabéns, você acertou!");
        }else{
            System.out.println("Errou. Mas, continue tentando!");
        }
    }

    @Override
    public void setResultados(int resultado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
