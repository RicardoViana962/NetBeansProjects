/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaarray;

/**
 *
 * @author Colorindo Festas
 */
public class TestaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*   // Definindo os Arrays
        String[] predio1;
        String predio2[];
        // Criando os Arrays
        predio1 = new String [5];
        predio2 = new String [5];
        // Carregando dados no Array predio1
        predio1[0] = "tijolo";
        predio1[1] = "cimento";
        predio1[2] = "areia";
        predio1[3] = "brita";
        predio1[4] = "ferro";
        // Carregando dados no Array predio2
        predio2[0] = "Cabo";
        predio2[1] = "Pia";
        predio2[2] = "porta";
        predio2[3] = "Lâmpadas";
        predio2[4] = "Chuveiro";
        //Exibindo dados do Array Predios 1 e 2.
        System.out.println(predio1[0]+" - "+predio2[0]);
        System.out.println(predio1[1]+" - "+predio2[1]);
        System.out.println(predio1[2]+" - "+predio2[2]);
        System.out.println(predio1[3]+" - "+predio2[3]);
        System.out.println(predio1[4]+" - "+predio2[4]);
        System.out.println("-");*/
        
        //Definindo Arrays
        String competicoes [][];
        // criando Arrays
        competicoes = new String[3][4];
        // Carregando dados no Array a
        competicoes [0][0] = "Corrida 100m rasos";
        competicoes [0][1] = "Usain";
        competicoes [0][2] = "Florence";
        competicoes [0][3] = "Tyson";
        
        competicoes [1][0] = "Salto triplo";
        competicoes [1][1] = "Inessa";
        competicoes [1][2] = "Jonathan";
        competicoes [1][3] = "Françoise";
        
        competicoes [2][0] = "Natação 50m";
        competicoes [2][1] = "César";
        competicoes [2][2] = "Ranoni";
        competicoes [2][3] = "Michael";
        
        // Exibindo dados do Array a, b, c
        System.out.println("Competição: "+competicoes [0][0]);
        System.out.println("Ouro:       "+competicoes [0][1]);
        System.out.println("Prata:      "+competicoes [0][2]);
        System.out.println("Bronze:     "+competicoes [0][3]);
        System.out.println(" ");
        System.out.println("Competição: "+competicoes [1][0]);
        System.out.println("Ouro:       "+competicoes [1][1]);
        System.out.println("Prata:      "+competicoes [1][2]);
        System.out.println("Bronze:     "+competicoes [1][3]);
        System.out.println("  ");
        System.out.println("Competição: "+ competicoes [2][0]);
        System.out.println("Ouro:       "+competicoes [2][1]);
        System.out.println("Prata:      "+competicoes [2][2]);
        System.out.println("Bronze:     "+competicoes [2][3]);
        
        
        
                        
    }
    
}
