
package P_I_CompararString;

import java.util.Scanner;

/**
comparar número
 */
public class Saudacao_Nome {
    public static void main(String[] args) {
        /*
        Escreva um programa que lê o nome de uma pessoa 
        e mostra a seguinte 
        mensagem: "Olá, nome da pessoa!".
        Se a pessoa não entrar com um nome, 
        o programa deve mostrar: "Olá, mundo!".  
         */
        Scanner leitor = new Scanner(System.in);

        System.out.print("nome: ");
        String nome = leitor.nextLine();

        if (nome.equals(" ")){
            System.out.println("Óla, mundo! ");
        } else {
            System.out.println("Óla " + nome + "!");
        }
    }
}

