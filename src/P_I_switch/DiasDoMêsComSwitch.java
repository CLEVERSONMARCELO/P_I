package P_I_switch;
import java.util.Scanner;
public class DiasDoMêsComSwitch {
 /*
 Escreva um programa em Java que lê um número entre 1 e 12, 
representando os meses do ano (1 para janeiro, 2 para fevereiro, etc.) 
e mostra quantos dias há no mês que o usuário escolheu (ignore anos bissextos).
Atenção: use o comando switch
Exemplo:
Mês: 3
O mês 3 tem 31 dias.   
  */
    
    public static void main (String[]args){
       
       Scanner leitor = new Scanner (System.in);
     int mes; 
     System.out.print("Digite um mês, ex: 1 para janeiro - 12 para dezembro:  ");
     mes = leitor.nextInt();

     switch (mes){
         case 1:
         case 3:  
         case 5: 
         case 7:     
         case 8:     
         case 10: 
         case 12:          
             System.out.print("O mês "+mes+" tem 31 dias");
         break;
         
         case 2:          
             System.out.print(mes+" tem 28 dias");
         break;
         
         case 4:
         case 6:  
         case 9: 
         case 11:     
             System.out.print("O mês "+mes+" tem 30 dias");
         break;
         
         default:
             System.out.print("Mês digitado inválido!");
             
        }
    }   
}
