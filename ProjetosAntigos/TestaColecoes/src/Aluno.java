/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Colorindo Festas
 */
public class Aluno {
    //Atributos
    private String nome;
    private Double nota;
    
    //Construtor
    public Aluno(){
    }
    public Aluno(String nome, Double nota){
        this.nome = nome;
        this.nota = nota;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNota(Double nota){
       this.nota = nota;
    }
    public Double getNota(){
        return nota;
    }
   
    
}
