package P_I_switch;
import java.util.Scanner;

public class TransporteDeMateriais_Modo_01 {
   public static void main (String[]args){
       //entrada
       Scanner leitor = new Scanner (System.in);
       String tipo;
       double temperatura;
       
       System.out.print("Digite o tipo: ");
       tipo = leitor.nextLine();  
       
       System.out.print("Digite a temperatura: ");
       temperatura = leitor.nextDouble();  
       
       //processameto
       switch (tipo){
           case "A":
           case "a":    
               if (temperatura>=10&&temperatura<=17){System.out.print("Caminhão pode tranportar tipo de carga A!\n\n\n");}
               else {System.out.print("Temperatura invalida!!");}
               break;
               
           case "B":
           case "b":   
               if (temperatura>=11&&temperatura<=16){System.out.print("Caminhão pode tranportar tipo de carga B!");
               }
               else {System.out.print("Temperatura invalida!!");}
               break;
               
           case "C":
           case "c":   
               if (temperatura>=12&&temperatura<=15){System.out.print("Caminhão pode tranportar tipo de carga C!");
               }
               else {System.out.print("Temperatura invalida!!");}
               break;
               
           case "D":
           case "d":   
               if (temperatura>=13&&temperatura<=14){System.out.print("Caminhão pode tranportar tipo de carga D!");
               }
               else {System.out.print("Temperatura invalida!!");}
               break;
              
           default:
               {System.out.print("Tipo inválido!!");
       }
   }
}}
