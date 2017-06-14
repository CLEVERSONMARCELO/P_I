package P_I_switch;
import java.util.Scanner;

public class TransporteDeMateriais {
   public static void main (String[]args){
       //entrada
       Scanner leitor = new Scanner (System.in);
       
       //entrada
       System.out.print("Tipo: ");
       String tipo = leitor.next();
       tipo = tipo.toUpperCase();
       System.out.print("Temperatura: ");
       double temperatura = leitor.nextDouble();
       
       //processamneto      trasformar tipo de case(A ou a) para maiúsculo toUpperCase()
       boolean tranporte=false;//se usuário digitar o tipo inválido será indicado no final do cód
       switch (tipo.toUpperCase()){
           case "A":
               if (temperatura>=10&&temperatura<=17){
                   tranporte  =true;     
               }else {
                   tranporte  =false;
                }
                break;
                
           case "B":
               if (temperatura>=11&&temperatura<=16){
                   tranporte  =true;     
               }else {
                   tranporte  =false;
                }
                break;

           case "C":
               if (temperatura>=12&&temperatura<=15){
                   tranporte  =true;     
               }else {
                   tranporte  =false;
                }
                break;

           case "D":
               if (temperatura>=13&&temperatura<=14){
                   tranporte  =true;     
               }else {
                   tranporte  =false;
                }
                break;
        }
        //saída 
        
              if (tranporte){ System.out.println("Pode tranrportar"); 
              }
              else { System.out.println("Não pode transportar"); 
              }  
        }
    }      
 

