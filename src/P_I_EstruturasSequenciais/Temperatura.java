/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P_I_EstruturasSequenciais;
import java.util.Scanner;
/**
 *
 * @author cleverson.mdias
 */
public class Temperatura {
    
    public static void main (String[] args){
        
        //usuário digita o valor em fahrenheit e programa converte para celsius
        
        
        //entrada
        double f;
        
        System.out.println("Digite temperatura em  fahrenheit: ");
        
        Scanner leitor = new Scanner(System.in);
        f = leitor.nextInt();
        
        
        //processamento
        double c =(5.0/9.0)*(f -32);
        //colocar o ponto no 5.0 para utilizar números reais
        //número real sempre utilizar ponto
        

       
        //saída
        System.out.println(f + "  fahrenheit = "  + c +  " Cº ");
        
        
         
}
}