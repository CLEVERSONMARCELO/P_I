package P_I_CompararString;
import java.util.Scanner;

public class SaudaçãoTeste {
    public static void main (String[]args){
        
        Scanner leitor = new Scanner (System.in);
       String nome = "ana";
          System.out.println("digite o nome ana: \n");
            nome = leitor.next(nome);
          
            
             if(nome.equals(nome)){System.out.println("nome VÁLIDO");
      }
             else {System.out.println("nome INVALIDO");
             }
    }}

