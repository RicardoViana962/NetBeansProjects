
package exerciciojavanapratica;
import java.util.Scanner;


public class TresDeDez {
    
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número: ");
        int x = num.nextInt();
        
        System.out.println("Informe o segundo número: ");
        int y = num.nextInt();
        
        System.out.println("Informe o terceiro número: ");
        int z = num.nextInt();
        
        double media = (x+y+z)/3;
        System.out.println("Média = " +media);
        
        x = Math.max(x,y);
        y = Math.max(y,z);
        System.out.println("Maior = "+Math.max(x,y));
        
    }
    
}
