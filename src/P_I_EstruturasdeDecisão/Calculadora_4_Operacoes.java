package P_I_EstruturasdeDecisão;
 import java.util.Scanner;
/**
 *
 * @author Cleverson
 */
public class Calculadora_4_Operacoes {
   

public static void main (String[]args){

Scanner leitor = new Scanner (System.in);

double numero1,numero2,opcao;


System.out.println(" --- Calculadora --- ");

System.out.print("1º  número: ");
numero1 = leitor.nextDouble();
System.out.print("2º número: ");
numero2 = leitor.nextDouble();
System.out.print("Digite uma opção:\n soma digite '1'\n subtração digite '2'\n multiplicação digite '3'\n divisão digite '4'  : ");
opcao = leitor.nextDouble();

if (opcao==1){System.out.printf("O resultado da soma é: %.2f %n ",(numero1+numero2));
}
if (opcao==2){System.out.printf("O resultado da subtração é:  %.2f %n ",(numero1-numero2));
}
if (opcao==3){System.out.printf("O resultado da multiplicação é: %.2f %n ",(numero1*numero2));
}
if (opcao==4){System.out.printf("O resultado da divisão  é: %.2f %n ",(numero1/numero2));
}
if (opcao<1||opcao>4) {System.out.println(" opção invalida! ");
}

}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
