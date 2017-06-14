
// Somando 2 números
package ProjetoIntegrador;
import java.util.Scanner;
public class Somar2Numeros {
    public static void main(String[] args) {
     
        int n1, n2, resultado;

        System.out.println("Classe para somar 2 números");
        //entrada
        System.out.println("Digite o 1º número");
        Scanner leitor = new Scanner(System.in);
        n1 = leitor.nextInt();

        System.out.println("Digite o 2º número");
        n2 = leitor.nextInt();

        //processamento
        resultado = n1 + n2;

        //saída
        System.out.println("Oresultado da sua soma é: " + resultado);
    }
    
}
