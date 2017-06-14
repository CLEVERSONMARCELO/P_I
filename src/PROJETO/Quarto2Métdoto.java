package PROJETO;

import java.util.Scanner;

public class Quarto2Métdoto {
    public static void main(String[] args) {
     
    MenuInicial();
      
        
    }
    
    static int leitor() {
        Scanner leitor = new Scanner(System.in);

        boolean valido = false;
        int numero = 0;
        
        do {
            try {
                numero = Integer.parseInt(leitor.nextLine());
                valido = false;
            } catch (NumberFormatException ex) {
                valido = true;
                System.err.println(ex+ "\n\nCaracteres não são válidos \n---tente novamente---" );
            }
        } while (valido == true);

        return numero;
    }
                                                               //faca Q1
    public static boolean menuIncial = false, capanga = false, faca = false, chaveDourada = false, menuInspecionar = false;
    
    static void MenuInicial() {
       
        
        do {
            System.out.println("                                 ---ESCOLHA UMA OPÇÃO---");
            System.out.println("\n 1 - MATAR CAPANGA  2 - INVESTIGAR QUARTO SEM ACORDAR CAPANGA   "
                    + "3 - VOLTAR PARA CORREDOR \"1\" ");
            
            switch (leitor()) {

                case 1:
                    //matar capanga
                    matarCapanga();
                     
                    break;
                   
                case 2:
                    invertigarQuartoSemMatar();
                    break;

                case 3:
                    //voltar para corredor
                    menuIncial = false;//rodar menuInicial
                    break;
                
               default:
                   System.err.println("  Opção inválida!!!         ---tente novamente---");
                   System.out.println(" ");
                   menuIncial = true;
                   break;
            }

        } while (menuIncial == true);

    }
    
    static void matarCapanga() {

        if (capanga == true) {
            System.out.println("CAPANGA ESTÁ MORTO!! ");
            menuIncial = true;//rodar menuInicial

        } else if (faca == true) {
            System.out.println("VOCÊ MATOU O CAPANGA");
            capanga = true;
            System.out.println("ENCONTROU UMA CHAVE DOURADA");
            chaveDourada = true;
            menuIncial = true;

        } else {
            System.err.println("O CAPANGA TE MATOU");
            System.err.println("GAME OVER");
            menuIncial = false;
        }
    }
    
    static void invertigarQuartoSemMatar() {

        do {
            System.out.println("\n1 - OLHAR JANELA  2 - INSPECIONAR MESA 3 - VOLTAR");
            switch (leitor()) {

                case 1:
                    System.out.println("PAISAGEM/RUA\n");
                    menuInspecionar = true;
                    break;
                case 2:
                    System.out.println("VÁRIOS PORTA RETRATOS");
                    System.out.println("Inserir textooooooo--------");
                    menuInspecionar = true;
                    break;
                case 3:
                    System.err.println("VOCÊ ESCOLHEU VOLTAR");
                    menuIncial = true;//rodar menu Inicial
                    
                    menuInspecionar = false;
                    break;
                
                default:
                   System.err.println("  Opção inválida!!!         ---tente novamente---");
                   System.out.println(" ");
                   menuInspecionar = true;
                   break;    
                    
            }
        } while (menuInspecionar == true);
    }
    
 
    
    
    
    
    
    
    
}

    