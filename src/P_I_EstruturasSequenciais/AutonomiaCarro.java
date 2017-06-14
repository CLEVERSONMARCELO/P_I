package P_I_EstruturasSequenciais;
import java.util.Scanner;

//Escreva um programa em Java que calcula quantos km/l seu carro está fazendo.

public class AutonomiaCarro{
    public static void main(String[] args) {
    
        Scanner leitor = new Scanner(System.in);

        double kma, kmp, qlit, res;

        System.out.println("Calcular quantos km/l seu carro está fazendo: ");
        //entrada
        System.out.println("Quantos km seu carro já rodou ? ");
        kma = leitor.nextDouble();

        System.out.println("Digite quantos quilometros foram percorridos: ");
        kmp = leitor.nextDouble();

        System.out.println("Digite a quantidade de litros abastecidos: ");
        qlit = leitor.nextDouble();

        //processamento
        res = ((kma - kmp) / qlit);
        //saída
        System.out.println("Seu carrro faz  " + res + " km/l ");
    }
}
