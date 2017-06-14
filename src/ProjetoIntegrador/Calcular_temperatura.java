/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoIntegrador;
 import java.util.Scanner;
/**
 *
 * @author cleverson.mdias
 */
public class Calcular_temperatura {
    public static void main (String[] args){
        
        //entrada
        double f = 212;
        

        //processamento
        double c =(5.0/9.0)*(f -32);
        //colocar o ponto no 5.0 para utilizar números reais
        //número real sempre utilizar ponto
        

        //saída
        System.out.println(f + "  fahrenheit = "  + c +  " Cº ");
        
        
        
        
    }
    //utlizar double para cálculos fracionados 
    
}
