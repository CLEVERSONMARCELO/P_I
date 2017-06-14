package P_I_switch;

import java.util.Scanner;
/*
Escreva um algoritmo que lê dois números e qual a operação matemática desejada: 
soma, subtração, multiplicação ou divisão. Após isso, ele deve calcular e mostrar o resultado dessa operação.
*/
public class Exercício_de_Programação_Calculadora {
    public static void main (String[]args){
       
       //entrada
       Scanner leitor = new Scanner (System.in);
       
       double n1,n2;
       String operação;
        
        System.out.println("Qual operação deseja realizar. \nex: soma, subtração, multiplicação ou divisão. ");
        operação = leitor.nextLine();
        operação = operação.toLowerCase();

        System.out.print("Digite o 1º número: ");
        n1 = leitor.nextDouble();

        System.out.print("Digite o 2º número: ");
        n2 = leitor.nextDouble();

        //processamnto
        switch (operação) {

            case "soma":
                System.out.print("O resultado da sua soma é : " + (n1 + n2));
                break;

            case "subtração":
                System.out.print("O resultado da sua subtração é : " + (n1 - n2));
                break;

            case "multiplicação":
                System.out.print("O resultado da sua multiplicação é : " + (n1 * n2));
                break;

            case "divisão":
                System.out.print("O resultado da sua divisão é : " + (n1 / n2));
                break;
         }
    }
}