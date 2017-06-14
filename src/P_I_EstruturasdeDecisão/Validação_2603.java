package P_I_EstruturasdeDecisão;

import java.util.Scanner;

public class Validação_2603 {
    public static void main (String[] args){
        /*
        escreva um programa que lê um número entra 1 e 12 e mostra 
        o seu dorbo(valide a entrada).
        */
        Scanner leitor = new Scanner (System.in);  
        
        System.out.println("n: ");
       int n = Integer.parseInt(leitor.nextLine());
       
       if (n>=1&&n<=12){
       
       int resul = 2*n;
       
       System.out.println(resul);
       }
       else {System.out.println(" Número Inválido ");
       }
    }
}

