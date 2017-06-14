package P_I_EstruturasdeDecisão;


import javax.swing.JOptionPane;

public class ValidaçãoModo2_2603 {
 
    public static void main (String[] args){
        /*
        escreva um programa que lê um número entra 1 e 12 e mostra 
        o seu dorbo(valide a entrada).
        */
        System.out.println("n: ");
       int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
               
       
       if (n>=1&&n<=12){
       
       int resul = 2*n;
       
       JOptionPane.showMessageDialog(null, " O número foi multiplicado por 2 -- resultado "+ resul);
       }
       else 
        JOptionPane.showMessageDialog(null, "Número inválido");   
       }
    }
