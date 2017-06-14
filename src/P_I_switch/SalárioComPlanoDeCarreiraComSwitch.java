package P_I_switch;

import java.util.Scanner;

public class SalárioComPlanoDeCarreiraComSwitch {
   public static void main (String[]args){
       
       Scanner leitor = new Scanner (System.in); 
       
       String nome;
        int nivel;
        double quanth,n1=15,n2=18,n3=22,n4=27,n5=33;

        //entrada
        System.out.print("Digite o nome do funcionário:  ");
        nome = leitor.nextLine();
        nome = nome.toUpperCase();
        
        System.out.print("Digite o nível do funcionário:  ");
        nivel = leitor.nextInt();

        System.out.print("Quantidade de horas trabalhadas: ");
        quanth = leitor.nextDouble();
        
        double salario1 = quanth*n1;
        double salario2 = quanth*n2;
        double salario3 = quanth*n3;
        double salario4 = quanth*n4;
        double salario5 = quanth*n5;
        
        switch (nivel){
            case 1:
               System.out.println("O funcionário "+nome+", trabalhou "+quanth+" horas por R$ "+n1+", tem nével"+nivel+" e deve receber R$"+salario1+" "); 
            break;
            
            case 2:
               System.out.println("O funcionário "+nome+", trabalhou "+quanth+" horas por R$ "+n2+", tem nével"+nivel+" e deve receber R$"+salario2+" "); 
            break;
            
            case 3:
               System.out.println("O funcionário "+nome+", trabalhou "+quanth+" horas por R$ "+n3+", tem nével"+nivel+" e deve receber R$"+salario3+" "); 
            break;
            
            case 4:
               System.out.println("O funcionário "+nome+", trabalhou "+quanth+" horas por R$ "+n4+", tem nével"+nivel+" e deve receber R$"+salario4+" "); 
            break;
            
            case 5:
               System.out.println("O funcionário "+nome+", trabalhou "+quanth+" horas por R$ "+n5+", tem nével"+nivel+" e deve receber R$"+salario5+" "); 
            break;
            
            default:
                System.out.println("Nível inválido");
        }
    }
}