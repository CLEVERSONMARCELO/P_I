package Projeto_JogoMafia;

import java.util.Scanner;

public class Quarto1 {

    public static Scanner read = new Scanner(System.in);
    //Chaves e Objetos
    public static boolean chaveAz = false, chaveAm = false, faca = false;
    //Comodos
    public static boolean quarto1 = false, criadoMudo = false;

    static int centroQuarto1(int x) {
        do {
            System.out.println("*** Quarto ***");
            quarto1 = false;// Sem essa linha o laço sempre ira retornar TRUE
            System.out.println("Ecolha uma das opções");
            System.out.println(" 1- Abrir porta amarela | 2- Ir ao banheiro | 3- Olhar pela janela | "
                    + "4- Verificar criado-mudo");
            int op1 = Integer.parseInt(read.nextLine());
            System.out.println("");
            System.out.println("====================================================================");
            System.out.println("");
            switch (op1) {
                //PORTA
                case 1:
                    sairQuarto(0);
                    break;
                case 2:
                    banheiroQuarto1(0);
                    break;
                case 3:
                    janelaQuarto1(0);
                    break;
                case 4:
                    criadoMudo(0);
                    break;
                default:
                    System.out.println("");
                    System.out.println("");
                    System.err.println("OPÇÃO INCORRETA!");
                    break;
            }
        } while (quarto1 == true);
        return x;
    }

    static int sairQuarto(int x) {
        System.out.println("*** Porta Amarela ***");
        if (chaveAm == true) {//IF usado para verificar se o jogador já pegou a chave
            System.out.println("Porta amarela ABERTA");
            System.out.println("");
            System.out.println("====================================================================");
            System.out.println("");
        } else {//Caso o jogador esteja sem chave - PORTA NÃO ABRE
            System.err.println("Porta trancada | Chave inválida");
            quarto1 = true;
            System.out.println("");
            System.out.println("====================================================================");
            System.out.println("");
        }
        return x;
    }

    static int banheiroQuarto1(int x) {
        boolean banheiroQ1;
        do {
            System.out.println("*** Banheiro ***");
            banheiroQ1 = false;//Deixando o loop falso, para executar corretamente
            System.out.println("Escola uma das opções\n 1- Investigar armário | "
                    + "2- Olhar banheira | 3- Voltar");
            int portaBanheiro = Integer.parseInt(read.nextLine());
            System.out.println("");
            System.out.println("====================================================================");
            System.out.println("");
            switch (portaBanheiro) {
                case 1://Armario
                    if (chaveAz == true) {//IF usado para verificar se o jogador possui a chave
                        System.err.println("ARMÁRIO VAZIO");
                        System.out.println("");
                        banheiroQ1 = true;
                    } else {//Caso ele NÃO possua a chave
                        System.out.println("Você achou uma chave AZUL");
                        System.out.println("");
                        System.out.println("====================================================================");
                        System.out.println("");
                    }
                    chaveAz = true;
                    banheiroQ1 = true;
                    break;
                case 2://Banheira
                    Textos.mensagemBanheiraQuarto1("");
                    banheiroQ1 = true;
                    System.out.println(" ");
                    break;
                case 3://Voltar
                    System.out.println("");
                    System.out.println("====================================================================");
                    System.out.println("");
                    quarto1 = true;
                    break;
                default://Validação do número digitado
                    System.err.println("OPÇÃO INCORRETA!");
                    System.out.println("");
                    banheiroQ1 = true;
                    break;
            }

        } while (banheiroQ1 == true);
        return x;
    }

    static int janelaQuarto1(int x) {
        Textos.mensagemJanelaQuarto1("");
        quarto1 = true;
        return x;
    }

    static int criadoMudo(int x) {
        do {
            criadoMudo = false;//Deixando o LOOP falso para executar corretamente
            System.out.println("*** Criado-mudo ***");
            System.out.println("Escolha uma das opções\n 1- Inspecionar porta-retrato "
                    + "| 2- Abrir gaveta | 3- Voltar");
            int cMudo = Integer.parseInt(read.nextLine());
            System.out.println("");
            System.out.println("====================================================================");
            System.out.println("");
            switch (cMudo) {
                case 1://Gaveta
                    if (chaveAm == true) {//IF usado para verificar se o jogador já possui a chave
                        System.err.println("PORTA RETRATO VERIFICADO");
                        System.out.println("");
                        System.out.println("====================================================================");
                        System.out.println("");
                        criadoMudo = true;
                    } else {//Caso ele NÃO tenha a chave
                        System.out.println("Você achou uma chave AMARELA");
                        System.out.println("");
                        System.out.println("====================================================================");
                        System.out.println("");
                    }
                    chaveAm = true;
                    criadoMudo = true;
                    break;
                case 2:
                    if (faca == true) {
                        System.err.println("GAVETA VAZIA");
                        System.out.println("");
                        System.out.println("====================================================================");
                        System.out.println("");
                        criadoMudo = true;
                    } else {
                        System.out.println("Você achou uma FACA");
                        System.out.println("");
                        System.out.println("====================================================================");
                        System.out.println("");
                    }
                    faca = true;
                    criadoMudo = true;
                    break;
                case 3:
                    System.out.println("Você escolheu voltar");
                    quarto1 = true;
                    System.out.println("");
                    System.out.println("====================================================================");
                    System.out.println("");
                    break;
                default:
                    System.out.println("");
                    System.out.println("");
                    System.err.println("OPÇÃO INCORRETA!");
                    criadoMudo = true;
                    break;
            }
        } while (criadoMudo == true);
        return x;
    }
}
