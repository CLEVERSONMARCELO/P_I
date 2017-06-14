/*
Escreva uma classe para calcular a média final dos alunos do 5º semestre. 
Os alunos realizarão 4 provas: P1 P2 P3 P4 onde a média é a soma das 4 provas dividido por 4.
 */
package ProjetoIntegrador;
import java.util.Scanner;
/**
 *
 * @author Cleverson
 */
public class Media_aluno {
         public static void main (String[] args){
        // Entrada de dados
        double P1;
        double P2;
        double P3;
        double P4;
        double Media;
        
        Scanner Leitor1 = new Scanner(System.in);
        
        System.out.println("Digite o valor da 1º prova: ");
        P1 = Leitor1.nextDouble();
        System.out.println("Digite o valor da 2º prova: ");
        P2 = Leitor1.nextDouble();
        System.out.println("Digite o valor da 3º prova: ");
        P3 = Leitor1.nextDouble();
        System.out.println("Digite o valor da 4º prova: ");
        P4 = Leitor1.nextDouble();
        
        //Processamento
        Media = (P1+P2+P3+P4) /4;
        
        //Saída
        System.out.println("A sua média é: " + Media);
    }
}
