package P_I_EstruturasSequenciais;
import java.util.Scanner;
public class Triângulo_Retângulo {
    public static void main(String[] args) {
        /*Escreva um programa em Java que lê o tamanho dos dois catetos de 
        um triângulo retângulo e que mostra o tamanho da hipotenusa.*/
        
        System.out.println("Mostrar o tamanho hipotenusa: ");
        Scanner leitor = new Scanner(System.in);

        double b, c, a, resultado;
        //ENTRADA
        System.out.println("Digite o valor da altura: ");
        b = leitor.nextDouble();
        System.out.println("Digite o valor da base: ");
        c = leitor.nextDouble();

        //PROCESSAMENTO
        b = Math.pow(b, 2);
        c = Math.pow(c, 2);
        a = b + c;
        
        resultado = Math.sqrt(a);
        
        
        //SAÍDA
        System.out.print("O tamanho da hipotenusa é:  " +resultado);
       
}}
