package P_I_TratamentoDeErros;

import java.util.Scanner;

public class TratamentoDeErros {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        
        double temp1 = 0;

        boolean valido = false;

        do {//irá repetir enquanto a temperatura for false

            try {//se o tipo de dado digitado for inválido, a msg criada será exibida
                System.out.print("Temperatura: ");
                temp1 = Double.parseDouble(leitor.nextLine());
                valido = true;//se a linha de cima for válida, será atribuido true na variavel valido

            } catch (NumberFormatException ex) {
                System.out.println("Temperatura Inválida, tente novamente"); //  msg
            }
        } while (!valido);
        
        double temp2 = 0;

        valido = false;

        do {

            try {
                System.out.print("Temperatura: ");
                temp2 = Double.parseDouble(leitor.nextLine());
                valido = true;

            } catch (NumberFormatException ex) {
                System.out.println("Temperatura Inválida, tente novamente");
            }
        } while (!valido);
        
       double temp = soma(temp1, temp2);
        
        System.out.println(temp);

    }
    
    public static double soma (double  t1, double  t2) {
        
        return t1 + t2;
        
    }
}

