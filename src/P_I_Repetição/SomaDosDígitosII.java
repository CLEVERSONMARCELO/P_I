package P_I_Repetição;
import java.util.Scanner;
/*
Escreva um programa que lê um número e mostra a soma dos seus dígitos, cada um múltiplicado por um peso, da seguinte forma:
Se o número tem 4 dígitos,  o primeiro dígito deve ser multiplicado por 4, o segundo por 3, o terceiro por 2 e assim por diante.
Se o número tem 10 dígitos, o primeiro dígito deve ser multiplicado por 10, o segundo por 9, o terceiro por 8 e assim por diante.
Exemplo: Número: 123 ---------- Resultado: 10
Explicação: 1x3 + 2x2 + 3x1 = 10
Número: 2017
Resultado: 17
Explicação: 2x4 + 0x3 + 1x2 + 7x1= 17
 */
public class SomaDosDígitosII {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        //entrada

        int soma = 0;
        System.out.print("Número: ");
        String n = leitor.nextLine();
        //processamneto

        for (int i = 0; i < n.length(); i++) {

            String posição = n.substring(i, i + 1);

            int conversão = Integer.parseInt(n);
            
            soma = soma * 2;
        }
        System.out.println(soma);
    }
}
