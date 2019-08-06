
package nivel0exercicio1;

import java.util.Scanner;


public class Nivel0Exercicio1 {

   
    public static void main(String[] args) {
       
        Scanner leia = new Scanner(System.in);
        
        System.out.println ("Conversão de Kilômetros para Metros, Centímetros, Milhas:");
     
        System.out.println ("Digite em Kilômetros:");
        double kilometros = leia.nextDouble();
                
        double resultadoM = (kilometros * 1000);
        System.out.println (resultadoM+"m" );
        
        double resultadoCM = (kilometros *100000);
        System.out.println (resultadoCM+"cm" );
        
        double resultadoMI = (kilometros * 1/1.609);
        System.out.println (resultadoMI+"milhas" );

    }
    
}
