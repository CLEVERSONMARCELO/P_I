/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIntegrador;
//primeira aula java (pacote netbeans)
    import java.util.Scanner;

        public class Somar_2_Numeros {
            //classe/algoritmo
                public static void main(String[] args) {
        // função principal
        //comando de imprime na tela/escreva
            System.out.println("olá Mundo");
            //Escrever meu nome/ctrl + espaço para acessar atalho
            System.out.println("Cleverson");
         
        int n;
        int n1;
        int re;
        
        
        System.out.println("Digite o 1º número");
        
        Scanner leitor = new Scanner(System.in);
        n = leitor.nextInt();
        
        System.out.println("Digite o 2º número");
        Scanner leitor1 = new Scanner(System.in);
        n1 = leitor1.nextInt(); 
        
         re = (n + n1);
         
            System.out.println("resultado da soma é= "+ re +" ");
            //salvar nova modificação antes de executar (crtl S)
    }
    
}
