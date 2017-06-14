package P_I_EstruturasdeDecisão;

import java.util.Scanner;

public class Validação_exerc02 {
    public static void main (String[] args){
    
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite seu usuário:  ");
        String usuario = leitor.nextLine();

        System.out.print("Digite sua senha:  ");
        String senha = leitor.nextLine();

        if (usuario.equalsIgnoreCase("guilherme") || (usuario.equalsIgnoreCase("jair"))) {
            System.out.println("Usuario : " + usuario +"Está autorizado");
        } else {
            System.out.println("Usuário inválido");
        }

        if (senha.equalsIgnoreCase("0f5") || (senha.equalsIgnoreCase("0706"))) {
            System.out.println("senha correta!");
        } else {
            System.out.println("senha inválida");
        }
    } 
}
