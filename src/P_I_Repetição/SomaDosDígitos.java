package P_I_Repetição;
import java.util.Scanner;
/*
 * Escreve um programa que lê um número e mostra a soma dos seus dígitos ex:
 * 2017 = 10 450 = 9
 */
public class SomaDosDígitos {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        // Entrada
        System.out.print("Número: ");
        String n = leitor.nextLine();

        // Processamento   
        int soma = 0;

        for (int i = 0; i < n.length(); i++) { // verificar qtos dígitos há na String: 'n.length();

            String dig = n.substring(i, i + 1); //Encontra a posição do número digitado.

            int ConvertP_int = Integer.parseInt(dig); //Converter o díg (String) para inteiro (int).

            soma = soma + ConvertP_int;  //Soma o valor de cada dígito da string n.
        }
        System.out.printf("soma = %d\n\n\n", soma);
        
    }
}
