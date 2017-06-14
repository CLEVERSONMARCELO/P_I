package P_I_EstruturasdeDecisão;

import java.util.Random;
import java.util.Scanner;

public class Par_Impar {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Random pc = new Random();

        
        String jogada;
        int numero, resultado,sorteio;

        sorteio = pc.nextInt(10);

        // Entradas
        System.out.println("--- Par --- Impar ---");

        System.out.print(" par ou impar: ");
        jogada = leitor.nextLine();

        System.out.print("Digite um número: ");
        numero = leitor.nextInt();

        resultado = sorteio + numero;
        
        if (jogada.equalsIgnoreCase ("par") &&(resultado%2)==0)   {System.out.printf("Você Venceu!!!\n"
                + "Jogada: %s\nNúmero escolhido: %d\nPC: %d\nResultado: %d ",jogada,numero,sorteio,resultado);
        }
        else if (jogada.equalsIgnoreCase("impar")&&(resultado%2)!=0)    {System.out.printf("Você Venceu!!!\n"
                + "Jogada: %s\nNúmero escolhido: %d\nPC: %d\nResultado: %d ",jogada,numero,sorteio,resultado);
        }
        else {System.err.printf("Você Perdeu!!!\n"
                + "Jogada: %s\nNúmero escolhido: %d\nPC: %d\nResultado: %d ",jogada,numero,sorteio,resultado);
        }
    }
}

    
       
 
