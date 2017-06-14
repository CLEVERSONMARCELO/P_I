package P_I_CompararString;
import java.util.Scanner;

public class StringNome {
    public static void main(String[] args) {
        /*
        Escreva um programa que lê o nome de uma pessoa 
        e mostra a seguinte mensagem: "Olá, nome da pessoa!".
        Se a pessoa não entrar com um nome, o programa deve mostrar: "Olá, mundo!".  
         */
        Scanner leitor = new Scanner(System.in);

        System.out.print("nome: ");
        String nome = leitor.nextLine();

        if (nome == "") {
            System.out.println("Óla, mundo! ");
        } else {
            System.out.println("Óla, " + nome + " !");
        }
    }
}
