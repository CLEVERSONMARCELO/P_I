package P_I_EstruturasdeDecisão;

import java.util.Scanner;

/**
 *
 * @author cleverson.mdias
 */
public class Validação_exerc02_modo2 {
  
    public static void main (String[] args){
    
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu usuário:  ");
        String login = leitor.nextLine();

        System.out.print("Digite sua senha:  ");
        String senha = leitor.nextLine();
        senha = senha.trim();
        login = login.trim();//tirar espaços da esqueda ou direira, se houver espaço no meio não tira!! 
                                  //roda com maiúsculo ou minúsculo
        boolean autorizado =login.equalsIgnoreCase("guilherme")&&senha.equalsIgnoreCase("0f5")||login.equalsIgnoreCase("jair")&&senha.equalsIgnoreCase("0706");
        
        if (autorizado) {System.out.println("usuário autorizado");
        }
        else {System.out.println("usuário ou senha inválido");
        }
    } 
        
}
    