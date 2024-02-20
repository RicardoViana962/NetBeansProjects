/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Colorindo Festas
 */
public class Testa02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Aluno> alunos = new ArrayList<Aluno>();
        
        
        alunos.add (new Aluno("Clara ", 6.5));     
        alunos.add (new Aluno("Carlos ", 8.4));              
        alunos.add (new Aluno("Sandra ", 9.3));              
        alunos.add (new Aluno("Roberto ", 7.9));
              
                        
        for (Aluno alno : alunos){
            System.out.println(alno.getNome()+ "-"+ alno.getNota());
        }
    }
    
}
