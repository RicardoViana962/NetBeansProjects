/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarepeticoes;

/**
 *
 * @author Colorindo Festas
 */
public class TestaRepeticoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*System.out.println("Testando o while");
       int n = 0;
         while (n<5){
            System.out.println(n);
            n++;
        }
        System.out.println("___________________");
        System.out.println("Teste do/while");
        int i = 0;
        do {
            System.out.println(i);
            i++;
            
        }while (i<5);
        
        System.out.println("__________________");
        
        System.out.println("Teste de for");
        for (int z = 0; z<5; z++){
            System.out.println(z);
        }*/
        //Definindo os Arrays
        String[] a;
        String b[];
        
        //Criando os Arrays
        a = new String[5];
        b = new String[5];
        
        //Carregando dados no Array a
        a[0] = "Ricardo";
        a[1] = "Mônica";
        a[2] = "Brenda";
        a[3] = "Cauã";
        a[4] = "Suzy";
        
        // Carregando dados no Array b
        b[0] = "Edson";
        b[1] = "Tânia";
        b[2] = "Cèlia";
        b[3] = "César";
        b[4] = "Raíssa";
        
        // Exibindo dados do Array a
        for (int n = 0; n<a.length; n++){
            System.out.println(a[n]);
        }
        System.out.println("_________________________");
        
        // Exibindo dados do Array b
        for (int i = 0; i<b.length; i++){
            System.out.println(b[i]);
        }
        System.out.println("________________________");
        
        // Exibindo dados do Array a e b
        for (int z = 0; z<a.length; z++){
            System.out.println(a[z]+"------- "+b[z]);
        }
    }
    
}
