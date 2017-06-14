

package ProjetoIntegrador;

import java.util.Scanner;

public class Primeira_Aula {
    //sempre criar método main no arquivo 
    public static void main (String[] args) {
        
        Scanner leitor = new Scanner(System.in);//declarar leitor inserção de dados pelo usuário
        
        int idade;//declaração da variável idade tipo inteiro
        String nome = "SENAC";//variável utilizada para declarar texto
        boolean b = true;//variável utilizada para declarar verdadeiro
        float dolar = 3.20f;//variável utilizada para declarar valor décimal
        idade = 70;//declarando valor para variável idade
       
        System.out.println("Bem vindos ao " + nome + " ");/* + +
        concatenar nome + variável
        */
        System.out.println("Em 2016 o " + nome + " completou " + idade);
        //concatenar texto + variáveis
        
        System.out.println("Cotação do Dolár " + dolar);//informação antes da digitação do usuário
         //concatenar texto + variáveis (dar espaço dentro das aspas)
        System.out.println("Digite a sua idade: ");//informação antes da digitação do usuário
        
        idade = leitor.nextInt();//comando leia de algoritmos
        System.out.println("Digite a seu nome: ");
        nome = leitor.next();//alterado a variavél nome, o usuário irá alterar 
        System.out.println("Bem vindo " + nome); //informando o usuário a inserir nome 
        System.out.println("Sua idade é: " + idade); //perguntar a idade, sobescrever idade
                    /*Bem vindos ao SENAC 
            Em 2016 o SENAC completou 70
            Cotação do Dolár 3.2
            22
            cleverson
            Bem vindo cleverson
            Sua idade é:22
            CONSTRUÍDO COM SUCESSO (tempo total: 9 segundos)*/
    }
}
