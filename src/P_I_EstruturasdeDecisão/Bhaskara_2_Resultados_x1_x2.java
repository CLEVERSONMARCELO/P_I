package P_I_EstruturasdeDecisão;
import java.util.Scanner;
public class Bhaskara_2_Resultados_x1_x2 {

    public static void main (String[]args){
   
        Scanner leitor =new Scanner (System.in);
        double a, b, c, delta,x1,x2;
        System.out.println("Digite 3 números, para calcular a fórmula de bhaskara: ");
        //entrada
        System.out.print("Digite o coeficiente “A” : ");
        a = leitor.nextDouble();
        System.out.print("Digite o coeficiente “B” : ");
        b = leitor.nextDouble();
        System.out.print("Digite o coeficiente “C” : ");
        c = leitor.nextDouble();
        //processamento
        //calcular o delta
        delta = Math.pow (b, 2)-(4*a*c);
        //fórmula
        x1 = ((-b)+Math.sqrt(delta))/(2*a);
        x2 = ((-b)-Math.sqrt(delta))/(2*a);
        //saída
        if (delta<=0){
        System.out.println("Impossivel calcular​, delta é negativo: ("+delta+")");
        }
        else  {System.out.println("X' = " + x1 + "  X'' = " + x2);
        }
    }
}
    
