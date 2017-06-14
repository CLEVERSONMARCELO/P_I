package P_I_Repetição;
/*
Escreva um programa que mostra a soma dos 10000 primeiros termos da seguinte série:
soma = 1/1 + 1/3 + 1/5 + 1/7 + 1/9 + ...
 */
public class SomaDaSérieII {

    public static void main(String[] args) {

        double soma = 0;
        double n = 1;

        for (int i = 1; i <= 10000; i++) {

            soma = soma + 1 / n;

            n = n + 2;

        }

        System.out.print(soma);
    }
}
//5.69