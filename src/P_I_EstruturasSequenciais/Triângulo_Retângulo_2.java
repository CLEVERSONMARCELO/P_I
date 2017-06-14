package P_I_EstruturasSequenciais;
import java.util.Scanner;

public class Triângulo_Retângulo_2 {
    public static void main (String[] args){
        /*
        Escreva um programa em Java que lê o tamanho dos dois catetos de um triângulo 
        retângulo e que mostra o perímetro do triângulo.
         */
        System.out.println("Mostrar o perimetro do triângulo: ");
        Scanner leitor = new Scanner(System.in);

        double b, c, a, cat1, cat2, per;

        //ENTRADA
        System.out.println("Digite a altura(cateto1) do triângulo: ");
        b = leitor.nextDouble();
        System.out.println("Digite a base(cateto2) do triângulo: ");
        c = leitor.nextDouble();

        //PROCESSAMENTO
        cat1 = b;
        cat2 = c;

        c = Math.pow(c, 2);
        b = Math.pow(b, 2);
        a = b + c;

        a = Math.sqrt(a);

        per = cat1+ cat2 + a;

        //SAÍDA
        System.out.print("O perimetro do triângulo é:  " + per);
    }
}
