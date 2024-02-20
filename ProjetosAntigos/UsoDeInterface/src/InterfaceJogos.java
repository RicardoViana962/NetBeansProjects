/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Colorindo Festas
 */
public interface InterfaceJogos {
    
    //GETTERS E SETTERS
    public void setAposta(int aposta);
    public void setResultados(int resultado);
    
    //MÉTODOS
    public void executaJogo();
    public void executaJogo(int aposta);
    public void mostraResultado();
    
}
