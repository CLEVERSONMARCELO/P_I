package PROJETO;

import java.util.Scanner;

public class Quarto_2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        boolean menuInicial = false, menuInicialQ2 = false, capanga = false, faca = true, chavedourada = false, menuInpecionar = false;
        
        do {
          
            System.out.println("\nESCOLHA UMA OPÇÃO: \n");
            System.out.println("\n1 - ENTRAR NO QUARTO  2 - CONTINUAR NO CORREDOR   3 - VOLTAR PARA O QUARTO \"1\" ");

            int opção = leitor.nextInt();

            switch (opção) {

                case 1:

                    do {
                        menuInicialQ2 = false;
                        
                        System.out.println("\n1 - MATAR CAPANGA (POSSUI FACA Q1??  2 - INVESTIGAR QUARTO SEM ACORDAR CAPANGA  "
                                + "  3 - VOLTAR ");

                        int opquarto = leitor.nextInt();

                        switch (opquarto) {

                            case 1:
                                if (capanga == true) {
                                    System.out.println("CAPANGA ESTÁ MORTO!! ");
                                    menuInicial = true;

                                } else if (faca == true) {
                                    System.out.println("VOCÊ MATOU O CAPANGA");
                                    System.out.println("INCUIR OPÇÃO");

                                    capanga = true;
                                    menuInicialQ2 = true;
                                    System.out.println("ENCONTROU UMA CHAVE DOURADA");
                                    chavedourada = true;
                                    capanga = true;

                                } else {
                                    System.err.println("O CAPANGA TE MATOU");
                                    System.err.println("GAME OVER");
                                    break;
                                }
                                break;

                            case 2:

                                do {
                                    menuInpecionar = false;
                                    
                                    System.out.println("\n1 - OLHAR JANELA  2 - INSPECIONAR MESA 3 - VOLTAR");
                                    int opdentroQ2 = leitor.nextInt();

                                    switch (opdentroQ2) {

                                        case 1:
                                            System.out.println("PAISAGEM/RUA\n");
                                            menuInpecionar = true;
                                            break;

                                        case 2:
                                            System.out.println("VÁRIOS PORTA RETRATOS");
                                            System.out.println("Porta retrato dom Dom, mafioso que pode ser o responsavél pelo meu sequestro");
                                            menuInpecionar = true;
                                            break;

                                        case 3:
                                            menuInicialQ2 = true;
                                            break;
                                    }

                                } while (menuInpecionar == true);

                            //opções menu  menuInicialQ2
                            case 3:
                                menuInicial = true;
                                break;

                            default:

                        }

                    } while (menuInicialQ2 == true);

                // opções menu  menuInicial 
                case 2:
                    //ADICIONAR  
                    System.err.println("ADICIONAR OPÇÃO 222");
                    break;

                case 3:
                    //ADICIONAR     
                    System.err.println("ADICIONAR OPÇÃO  333");
                    break;

                default:
            }

        } while (menuInicial == true);
    }

}
