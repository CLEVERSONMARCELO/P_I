package P_I_Repetição;

/**
 * Escreva um programa que mostra a soma dos 10000 primeiros termos da seguinte
 * série: soma = 1 + 3 + 5 + 7 + 9 + ...
 */
public class SomaDaSérieModo_2 {

    public static void main(String[] args) {

        int soma = 0;
        int n = 1;

        for (int i = 1; i <= 10000; i++) {

            soma = soma + n;
            
            n = n + 2;
        }
        System.out.print(soma);
    }
}
