package P_I_EstruturasdeDecisão;
import java.util.Scanner;

public class Bhaskara {
    public static void main (String[]args){
   
        Scanner leitor =new Scanner (System.in);
        double a, b, c, delta,x1,x2;
        System.out.println("-----> fórmula de bhaskara <----\n ");
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
        if (delta>0){System.out.printf("Existem duas raízes diferentes,delta é: %.2f\nX'= %.2f \nX\"= %.2f\n\n\n",delta,x1,x2);
        }
        else if (delta==0){System.out.printf("Existem duas raízes iguais, delta é: %.2f \nX'=%.2f \nX\"=%.2f\n\n\n",delta,x1,x2);
        }       
        else if (delta<=0){System.out.printf("Não existe raiz real, delta: %.2f é negativo: \n\n\n" , delta);
        }
    }
}
    
    
    
    
 
