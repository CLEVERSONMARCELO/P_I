package P_I_EstruturasdeDecisão;
import java.util.Scanner;
/*
Melhore o exercício anterior de forma que ele também tenha a frequência do aluno como entrada.
O aluno só passa se sua frequência for maior ou igual a 75%
*/
public class Media_frequencia {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double p1, p2, media, frequencia;
        //entrada
        System.out.println("---Calcular média---");
        System.out.println("Prova 1: ");
        p1 = leitor.nextDouble();
        System.out.println("Prova 2: ");
        p2 = leitor.nextDouble();
        System.out.println("Frequência: ");
        frequencia = leitor.nextDouble();

        media = (p1 + p2) / 2;

        //processamento
        if ((media >= 6) && (frequencia >= 75)) {
            System.out.println("Aprovado");
        } else if ((media >= 6) && (frequencia < 75)) {
            System.out.println("Reprovado");
        } else if ((media < 6) && (frequencia < 75)) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Prova 3:");

            double p3 = leitor.nextDouble();

            if (p1 < p2) {
                p1 = p3;
            } else {
                p2 = p3;
            }
            media = (p1 + p2) / 2;

            //saída
            if (media >= 6) {

                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
    }
}
