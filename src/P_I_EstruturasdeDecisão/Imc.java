package P_I_EstruturasdeDecisão;
import java.util.Scanner;

public class Imc {
    public static void main(String[] args){
        
        Scanner leitor = new Scanner (System.in);
   
       System.out.println("---cálculo do IMC---");
       
       System.out.print("Digite o seu nome: ");
       String n = leitor.nextLine();
       System.out.print("Digite o seu peso: ");
       double p = leitor.nextDouble();
       System.out.print("Digite sua altura: ");
       double a = leitor.nextDouble();
        
       double imc = p/Math.pow(a, 2);
        
       if (imc<18.5){System.out.printf("%s está com  Índice de massa corporal %.2f - Abaixo do Peso", n, imc);
       }
       else if (imc<=18.5||imc<25){System.out.printf("%s está com  Índice de massa corporal %.2f - Peso Normal ", n, imc);
       }
       else if (imc<=25||imc<30){System.out.printf("%s está com  Índice de massa corporal %.2f - Acima do Peso ", n, imc);
       }
       else if (imc>=30){System.out.printf("%s está com  Índice de massa corporal %.2f - Obesidade\n\n\n\n", n, imc);
       }
         
        
        
        
        
    }
}
