package P_I_switch;

import java.util.Scanner;
/*
Escreva um programa que lê uma letra e mostra se ela é uma vogal ou consoante.
Atenção: use o comando switch
*/
public class Letras {
   public static void main (String[]args){
       
       Scanner leitor = new Scanner (System.in); 
       
       String letra; 
       
       System.out.print("Digite uma letra maiúscula ou minúcula:  ");
       letra = leitor.nextLine();
       letra = letra.toLowerCase();
       
        switch (letra){
            case "a":
            case "e":   
            case "l":
            case "o":
            case "u":
                System.out.println("Letra digitada é uma VOGAL!!");
            break;
            
            case "b":
            case "c":
            case "d":
            case "f":
            case "g":
            case "h":
            case "i":
            case "j":
            case "k":
            case "m":
            case "n":
            case "p":
            case "q":
            case "r":
            case "s":
            case "t":
            case "v":
            case "x":
            case "y":
            case "z":
                   
            System.out.println("Letra digitada é uma CONSOANTE!!");
            break;
            
            default: 
                System.out.println("Digite uma LETRA!!!");
        }
    }
}
