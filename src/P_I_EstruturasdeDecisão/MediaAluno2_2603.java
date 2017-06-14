package P_I_EstruturasdeDecisão;
import java.util.Scanner;
/**
Escreva um programa em Java que lê as notas de duas provas de um aluno e calcula sua média.
Se o aluno tiver média maior ou igual a 6,0, ele passa. Caso contrário, ele fará mais uma prova.
Nesse caso, o programa deve ler essa terceira nota e recalcular a média, 
* substituindo a menor nota entre P1 e P2 pela nota da P3.
Indique a nova média do aluno e se ela conseguiu passar ou não.
Atenção: se o aluno fizer a P3, sua média máxima é 6,0.
 */
public class MediaAluno2_2603 {
    public static void main (String[]args){
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.print("Digite a nota p1: ");
        double p1 = leitor.nextDouble();
        
        System.out.print("Digite a nota p2: ");
        double p2 = leitor.nextDouble();
        
        
        double media = (p1+p2)/2;
        
        if (media>=6.0){System.out.printf("Aluno aprovado com média %.2f ", media);
        }
        else {System.out.printf("Aluno não aprovado, digite a nota p3: ");
        
        double p3 = leitor.nextDouble();
        
        if (p1<p2){
            p1 = p3;
        }
        else {p2= p3;
        }
       
        media = (p1+p2)/2;
        
        if (media>=6){
            System.out.printf("Aluno aprovado com média %.2f ", media);
        }
        else {System.out.println("Aluno reprovado");
       }
    }
}}
