package P_I_EstruturasdeDecisão;
import java.util.Scanner;

/**
Escreva um programa em Java que lê um número entre 1 e 12, 
* representando os meses do ano (1 para janeiro, 2 para fevereiro, etc.) 
* e mostra quantos dias há no mês que o usuário escolheu (ignore anos bissextos).
 */
public class DiasdoMês {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número entre 1 e 12, que represente um mês do ano: \n"
                + " exemplo: 1 para janeiro , 2 para fevereiro: ");
        int mes = leitor.nextInt();

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {System.out.printf("O mês %d tem 31 dias ", mes);}
            
            else if (mes == 2) {System.out.printf("O mês %d tem 28 dias ", mes);} 
               
                else {System.out.printf("O mês %d tem 30 dias ", mes);
        }
    }
}