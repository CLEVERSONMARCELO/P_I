package P_I_EstruturasSequenciais;
 import java.util.Scanner;

public class ContaTelfonica {
    public static void main (String[] args){

    Scanner leitor = new Scanner (System.in);
double assinatura = 23.32;
double locais=0.09,interurbanas = 0.26,internacionais = 0.86,valorconta;
double minutos, quantinterurbanas,quantinternacionais;
System.out.println("-----------Conta telefônica-----------");
//entrada
System.out.print("Quantos minutos em ligações Locais: ");
minutos = leitor.nextDouble();
System.out.print("Quantos minutos em ligações interurbanas: ");
quantinterurbanas = leitor.nextDouble();
System.out.print("Quantos minutos em ligações internacionais: ");
quantinternacionais = leitor.nextDouble();
//Saída
valorconta = assinatura+(minutos*locais)+(quantinterurbanas*interurbanas)+(quantinternacionais*internacionais);

System.out.println("Assinatura: "+assinatura );
System.out.printf("ligações locais: %.2f %n",(minutos*locais));
System.out.printf("ligações interurbanas: %.2f %n",(quantinterurbanas*interurbanas));
System.out.printf("ligações internacionais: %.2f %n",(quantinternacionais*internacionais));
System.out.printf("O valor total da sua conta é: %.2f %n",(valorconta));
}
}
