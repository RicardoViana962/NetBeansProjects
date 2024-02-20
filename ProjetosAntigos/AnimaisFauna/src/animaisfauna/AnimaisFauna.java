/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animaisfauna;

/**
 *
 * @author Colorindo Festas
 */
public class AnimaisFauna {
    protected int ID;
    protected String nome;
    public AnimaisFauna(int ID, String nome){
        this.ID = ID;
        this.nome = nome;
    }
    public int getID(){return ID;}
    public String getNome(){return nome;}

    public class Terrestre extends AnimaisFauna{
        private int getID;

        public Terrestre(int ID, String nome) {
            super(ID, nome);
        }
        public void teste(){
            String nome = getNome();
            int id = getID;
            System.out.println("ID:"+id+"Nome:"+nome);
            
        }
    
    }
    
    

   
    public static void main(String[] args) {
        
        
        // TODO code application logic here
    }
    
    
}
