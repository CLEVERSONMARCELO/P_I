package PROJETO;

import java.util.Scanner;

public class Quarto_1 {
    public static void main(String[] args) {
   
        Scanner read = new Scanner(System.in);
        // Variavel para caso o usuario digite uma opcao de escolha invalida
        boolean quarto1 = false;

        // Variaveis comodos
        boolean banheiroQ1 = false;
        boolean criadoMudoQ1 = false;

        // Variaveis para as chaves 
        boolean chaveAm = false, chaveAz = false;

        // Variaveis para objetos
        boolean faca = false;

        //Variaveis de texto
        String mensagemBanheira = " SANGUE ";
        
        // Laço de repetição usado para validar a primeira escolha do jogador
        do {
            System.out.println(" ### Quarto 1 ###");
            quarto1 = false;// Sem essa linha o laço sempre irá retornar TRUE
            System.out.println("Ecolha uma das opções");
            System.out.println(" 1- Abrir porta amarela | 2- Ir ao banheiro | 3- Olhar pela janela | "
                    + "4- Verificar criado-mudo");
            int op1 = Integer.parseInt(read.nextLine());
            switch (op1) {
                //PORTA
                case 1:
                    System.out.println("*** Porta Amarela ***");
                    if (chaveAm == true) {//IF usado para verificar se o jogador já pegou a chave AMARELA
                        System.out.println("Porta amarela ABERTA");
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("");
                    } else {//Caso o jogador esteja sem chave - PORTA NÃO ABRE
                        System.err.println("Porta trancada | Chave inválida");
                        quarto1 = true;
                        System.out.println("--------------------------------------------------------------------------");
                        System.out.println("");
                    }
                    break;                                                        
                    
                //Banheiro
                case 2:
                    do {
                        System.out.println("*** Banheiro ***");
                        banheiroQ1 = false;//Deixando o loop falso, para executar corretamente
                        System.out.println("Escola uma das opções\n 1- Investigar armário | "
                                + "2- Olhar banheira | 3- Voltar");
                        System.out.println(" ");
                        int banQ1 = Integer.parseInt(read.nextLine());
                        switch (banQ1) {
                            case 1://Armario
                                if (chaveAz == true) {//IF usado para verificar se o jogador possui a chave
                                    System.err.println("ARMÁRIO VAZIO");
                                    System.out.println(" ");
                                    banheiroQ1 = true;
                                } else {//Caso ele NÃO possua a chave
                                    System.out.println("Você achou uma chave AZUL");
                                    System.out.println(" ");
                                }
                                chaveAz = true;
                                banheiroQ1 = true;
                                System.out.println(" ");
                                break;
                            case 2://Banheira
                                System.out.println(mensagemBanheira);
                                banheiroQ1 = true;
                                System.out.println(" ");
                                break;
                            case 3://Voltar
                                System.out.println("Você escolheu voltar");
                                quarto1 = true;
                                System.out.println(" ");
                                break;
                            default://Validação do número digitado
                                System.err.println("OPÇÃO INCORRETA!");
                                banheiroQ1 = true;
                                System.out.println(" ");
                                break;
                        }
                    } while (banheiroQ1 == true);
                    break;
                                        
                //Janela
                case 3:
                    System.out.println("*** Janela ***");
                    System.out.println(" SANGUE ");
                    System.out.println("");
                    quarto1 = true;
                    break;           
                    
                //Criado Mudo    
                case 4:
                    do {
                        criadoMudoQ1 = false;//Deixando o LOOP falso para executar corretamente
                        System.out.println("*** Criado-mudo ***");
                        System.out.println("Escolha uma das opções\n 1- Inspecionar porta-retrato "
                                + "| 2- Abrir gaveta | 3- Voltar");
                        int criadoMudo = Integer.parseInt(read.nextLine());
                        switch (criadoMudo) {
                            case 1://Gaveta
                                if (chaveAm == true) {//IF usado para verificar se o jogador já possui a chave
                                    System.err.println("PORTA RETRATO VERIFICADO");
                                    System.out.println(" ");
                                    criadoMudoQ1 = true;
                                } else {//Caso ele NÃO tenha a chave
                                    System.out.println("Você achou uma chave AMARELA");
                                    System.out.println(" ");
                                }
                                chaveAm = true;
                                criadoMudoQ1 = true;
                                System.out.println(" ");
                                break;
                            case 2:
                                if (faca == true) {
                                    System.err.println("GAVETA VAZIA");
                                    System.out.println(" ");
                                    criadoMudoQ1 = true;
                                } else {
                                    System.out.println("Você achou uma FACA");
                                    System.out.println("");
                                }
                                faca = true;
                                criadoMudoQ1 = true;
                                System.out.println("");
                                break;
                            case 3:
                                System.out.println("Você escolheu voltar");
                                quarto1 = true;
                                System.out.println(" ");
                                break;
                            default:
                                System.err.println("OPÇÃO INCORRETA!");
                                criadoMudoQ1 = true;
                                System.out.println(" ");
                                break;
                        }
                    } while (criadoMudoQ1 == true);
                    break;
                    
                default:
                    System.err.println("OPÇÃO INCORRETA!");
                    quarto1 = true;
                    break;
            }
        } while (quarto1 == true);
    }
}   
  
