package P_I_Repetição;

/**
 * Leibniz, em 1682, desenvolveu uma série para o cálculo do \pi: frac{\pi}{4} =
 * 1 - \frac{1}{3} + \frac{1}{5} - \frac{1}{7} + \frac{1}{9} - \cdots Escreva um
 * algoritmo que calcula um valor aproximado para \pi usando a série
 * desenvolvida por Leibniz (dica: você irá precisar calcular a série com pelo
 * menos 10000 termos).
 */
public class CálculoDoPi {

    public static void main(String[] args) {

        double soma = 0;
        double n = 1;
        int sinal = 1;
        
        for (int i = 1; i <= 10000; i++) {
            
            soma = soma +  sinal * 1/n;

            n = n + 2;
            sinal = - sinal;
        }

        System.out.print(4*soma);
    }
}
//3.141592