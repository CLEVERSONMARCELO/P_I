package P_I_Repetição;

import java.util.Scanner;

/**
 * Escreva um programa que mostra a soma dos 10000 primeiros termos da seguinte
 * série: soma = 1 + 3 + 5 + 7 + 9 + ...
 */
public class SomaDaSérie {

    public static void main(String[] args) {

        System.out.println("Soma 10000 termos  \"1 + 3 + 5 + 7 + 9\"");
        int soma = 0;

        for (int i = 1; i < 20000; i = i + 2) {

            soma = soma + i;
        }
        System.out.print(soma);
    }
}
//100.000.000