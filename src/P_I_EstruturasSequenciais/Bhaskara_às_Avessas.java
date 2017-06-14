package P_I_EstruturasSequenciais;

import java.util.Scanner;

public class Bhaskara_às_Avessas {
    public static void main (String[] args){
        
        Scanner leitor = new Scanner (System.in);
               
        //teste
        //ENTRADA 
        System.out.println("Digite um valor para x1");
        double x1 = Double.parseDouble(leitor.nextLine ());
        
        System.out.println("Digite um valor para x2");
        double x2 = Double.parseDouble(leitor.nextLine ());
        
        System.out.println("Digite um valor para c");
        double c = Double.parseDouble(leitor.nextLine ());
        
        //PROCESSAMENTO
        double p = x1*x2;
        double a = c/p;
        double s = x1 + x2;
        double b = -(a*s);
        
        //SAÍDA     
        System.out.println(a+"X²+"+ b +"X+"+ c +" = 0 ");
        
     
    }
}



