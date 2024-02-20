/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Colorindo Festas
 */
public class Teste01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*List<String> diasSemana = new ArrayList<String>();
        
        diasSemana.add("Domingo");
        diasSemana.add("Segunda-feira");
        diasSemana.add("Terça-Feira");
        diasSemana.add("Quarta-Feira");
        diasSemana.add("Quinta-Feira");
        diasSemana.add("Sexta-Feira");
        diasSemana.add("Sábado");
        
        System.out.println(diasSemana);*/
        List<String> alunos = new ArrayList<String>();
        alunos.add("Clara ");
        alunos.add("Carlos ");
        alunos.add("Sandra ");
        alunos.add("Roberto ");
        
        
        List<Double> notas;
        notas = new ArrayList<Double>();
        
        notas.add(6.5);
        notas.add(8.4);
        notas.add(9.3);
        notas.add(7.9);
        
        for (int a = 0; a < alunos.size();a++){
            System.out.println(alunos.get(a) + "- " + notas.get(a));
        }
        
        // TODO code application logic here
    }
    
}
