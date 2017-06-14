
package P_I_EstruturasdeDecisão;
import java.util.Scanner;
import java.util.Random;

/*
Escreva um algoritmo que sorteia um número entre 1 e 10 (inclusos) 
e depois pede para o usuário tentar adivinhá-lo. 
Caso o número lido seja igual ao sorteado, mostre a mensagem “Você acertou!”.
Caso contrário, mostre a mensagem “Você errou!”.
 */
public class Adivinha {
    public static void main(String[] args) {
        
        int sort, numero;
        Scanner leitor = new Scanner (System.in);
        Random sorteio = new Random();
        
        sort = sorteio.nextInt(10)+1;
        
        System.out.println("---Adivinha---");
        System.out.println("Adivinhe o número que será sorteado: ");
        numero = leitor.nextInt();
        
        if (numero==sort)   {System.out.printf("“Você acertou!”\nNúmero sorteado: %d”",sort);
        }
        else {System.out.printf("“Você errou!”\nNúmero sorteado: %d”",sort);
        }
    }
}
