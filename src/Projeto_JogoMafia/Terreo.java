package Projeto_JogoMafia;

import java.util.Scanner;

public class Terreo {

    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);

            System.out.println("Térreo");
            System.out.println("Escolha uma das opções");
            System.out.println("1- Verificar porta PRATA | 2- Cozinha | 3- Sala "
                    + "de estar | 4- Subir de andar");
            int escolha1 = Integer.parseInt(read.nextLine());
            switch(escolha1){
                case 1:
                    Garagem.chaveCarro = 1;
                    Garagem.garagem();
                    break;
                case 2:
                    System.out.println("Cozinha");
                    break;
                case 3:
                    System.out.println("Sala de estar");
                    break;
                case 4:
                    System.out.println("Subindo...");
                    break;
                default:
                    System.err.println("OPÇÃO INCORRETA");
            }
    }
}
