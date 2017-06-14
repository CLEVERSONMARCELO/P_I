package P_I_TratamentoDeErros;

import java.util.Scanner;

public class Função {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
    //entrada 
    
    System.out.println("---- Conecta 4 ----\n");
    
    System.out.println("     |     |     |     |     |     |    ");
    System.out.println("     |     |     |     |     |     |    ");
    System.out.println("-----|-----|-----|-----|-----|-----|-----");
    System.out.println("     |     |     |     |     |     |    ");
    System.out.println("     |     |     |     |     |     |    ");
    System.out.println("-----|-----|-----|-----|-----|-----|-----");
    System.out.println("     |     |     |     |     |     |    ");
    System.out.println("     |     |     |     |     |     |    ");
    System.out.println("-----|-----|-----|-----|-----|-----|-----");
    System.out.println("     |     |     |     |     |     |    ");
    System.out.println("     |     |     |     |     |     |    ");
    System.out.println("-----|-----|-----|-----|-----|-----|-----");
    System.out.println("     |     |     |     |     |     |    ");
    System.out.println("     |     |     |     |     |     |    ");
    System.out.println("-----|-----|-----|-----|-----|-----|-----");
    System.out.println("     |     |     |     |     |     |    ");
    System.out.println("     |     |     |     |     |     |    ");


    
    String [] [] tabconecta4 = new String [6] [7] ;    
    //processamento 
    for (int l = 0 ; l  < tabconecta4.length ; l++){
        
         for (int c = 0 ; c  < tabconecta4[l].length ; l++){
           
           tabconecta4 [l] [c] =  " " ; 
        }
    }
    //saída
        System.out.println();
    }
}
