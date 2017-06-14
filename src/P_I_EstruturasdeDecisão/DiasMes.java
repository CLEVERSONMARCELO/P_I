package P_I_EstruturasdeDecisão;
import java.util.Scanner;
/**
crie um algoritmo que lê o número correspondente ao mês 
* ex. 1 = janeiro
 */
public class DiasMes {
    public static void main (String [] args) {
        
                int mes, dias;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número do mês, exemplo: 1 = janeiro ");
        mes = leitor.nextInt();

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7
                || mes == 8 || mes == 10 || mes == 12) 
            {dias = 31;} 
                 else
                     if (mes == 2) 
                        {dias = 28;}          
                             else 
                                  { dias = 30;}

        System.out.print("O mês digitado tem: " + dias + " dias ");

    }
        }

