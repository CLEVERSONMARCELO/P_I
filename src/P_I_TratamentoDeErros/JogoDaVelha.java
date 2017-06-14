package P_I_TratamentoDeErros;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        boolean continua = true;
        Scanner leitor = new Scanner(System.in);
        int posição;
        String jogada, pos1 = " ", pos2 = " ", pos3 = " ", pos4 = " ", pos5 = " ", pos6 = " ", 
                pos7 = " ", pos8 = " ", pos9 = " ";
        
        System.out.println("---------- JOGO DA VELHA ----------\n\n");

        System.out.print("JOGAR COM ?\n");
        System.out.print("ESCOLHA: \"X\" OU \"O\": ");
        jogada = leitor.nextLine();
        jogada = jogada.toUpperCase();
        
        if (jogada.equals("X") || jogada.equals("O")) {

            System.out.print("--- Escolha a posição ---\n\n");

            System.out.println("         |         |         ");
            System.out.println("   1     |    2    |    3    ");
            System.out.println("         |         |         ");
            System.out.println("---------+---------+---------");
            System.out.println("         |         |         ");
            System.out.println("    4    |    5    |    6    ");
            System.out.println("         |         |         ");
            System.out.println("---------+---------+---------");
            System.out.println("         |         |         ");
            System.out.println("    7    |    8    |    9    ");
            System.out.println("         |         |         \n");

        } else {
            System.err.print("JOGADA INVÁLIDA\n");
            continua = false;//não continua o laço for
        }
        

        while (continua == true) {

            for (int cont = 1; cont <= 9; cont++) {
               
                System.out.print("POSIÇÃO:  ");
                posição = Integer.parseInt(leitor.nextLine());
                System.out.print(" \n\n");
                
                if (posição ==1||posição ==2||posição ==3||posição ==4||posição ==5||
                        posição ==6||posição ==7||posição ==8||posição ==9){
                
                switch (posição) {

                    case 1:
                        pos1 = jogada;
                        break;
                    case 2:
                        pos2 = jogada;
                        break;
                    case 3:
                        pos3 = jogada;
                        break;
                    case 4:
                        pos4 = jogada;
                        break;
                    case 5:
                        pos5 = jogada;
                        break;
                    case 6:
                        pos6 = jogada;
                        break;
                    case 7:
                        pos7 = jogada;
                        break;
                    case 8:
                        pos8 = jogada;
                        break;
                    case 9:
                        pos9 = jogada;
                        break;
                }
                }else {
                    System.out.print("POSIÇÃO INVÁLIDA!!\n");
                }
                
                System.out.print("         |         |         \n");
                System.out.print("   " + pos1 + "     |    " + pos2 + "    |    " + pos3 + "    \n");
                System.out.print("         |         |         \n");
                System.out.print("---------+---------+---------\n");
                System.out.print("         |         |         \n");
                System.out.print("    " + pos4 + "    |    " + pos5 + "    |    " + pos6 + "    \n");
                System.out.print("         |         |         \n");
                System.out.print("---------+---------+---------\n");
                System.out.print("         |         |         \n");
                System.out.print("    " + pos7 + "    |    " + pos8 + "    |    " + pos9 + "    \n");
                System.out.print("         |         |         \n");

                if (pos1.equals("x")) {
                System.out.print("CAMPO PREENCHIDO!!!" );
                } 
                
                
                
            }
            continua = false;
        }
    }
}
