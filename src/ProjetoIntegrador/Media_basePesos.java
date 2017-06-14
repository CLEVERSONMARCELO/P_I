package ProjetoIntegrador;

import java.util.Locale;
import java.util.Scanner;

//calcular a média de 2 notas com base no peso de cada nota
public class Media_basePesos {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        float n1, n2, media;
        float p1, p2;
        p1 = 0.4f;
        p2 = 0.6f;
        //ENTRADA
        System.out.println("Digite o valor da 1º nota");
        n1 = leitor.nextFloat();

        //PROCESSAMENTO
        System.out.println("Digite o valor da 2º nota");
        n2 = leitor.nextFloat();

        media = (n1 * p1) + (n2 * p2);

        //SAÍDA
        System.out.printf("Nota 1: %.2f \n Nota 2: %.2f \n Média: %.2f \n", n1, n2, media);

    }

}
