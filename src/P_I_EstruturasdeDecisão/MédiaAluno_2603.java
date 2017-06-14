package P_I_EstruturasdeDecisão;

import java.util.Scanner;

/**
Escreva um programa em Java que lê as notas de duas provas de um aluno e calcula sua média.

Se o aluno tiver média maior ou igual a 6,0, ele passa. Caso contrário, ele fará mais uma prova.

Nesse caso, o programa deve ler essa terceira nota e recalcular a média, substituindo a menor nota entre P1 e P2 pela nota da P3.

Indique a nova média do aluno e se ela conseguiu passar ou não.

Atenção: se o aluno fizer a P3, sua média máxima é 6,0.
 */
public class MédiaAluno_2603 {
     public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
            //entrada
        System.out.print("Digite a 1º nota:  ");
        double p1 = leitor.nextDouble();

        System.out.print("Digite a 2º nota:  ");
        double p2 = leitor.nextDouble();
    
        double media = (p1+p2)/2;
        
        if (media>=6){System.out.println("Aluno aprovado com "+media+"!");
        }//entrada
        else {System.out.print("P3: ");
        
        double p3 = leitor.nextDouble();
        
        //procesamento
        if (p1<p2){
            p1=p3;
        }
        else {p2=p3;
        }
        media = (p1+p2)/2;
        
        //saída
        if (media>=6){
            
            System.out.println("Aluno aprovado com "+media+"!");
        }
        else {System.out.println("Aluno reprovado");
       }
       
     }
}}