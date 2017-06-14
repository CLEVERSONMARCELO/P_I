package P_I_EstruturasdeDecisão;
import  java.util.Scanner;
/*
Escreva um programa que pergunta de quem é a vez de jogar (O ou X) e em qual posição será feita a jogada.
Após isso, ele deve imprimir um tabuleiro de jogo-da-velha preenchido com a jogada informada.
*/
public class Jogo_da_Velha {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("---Jogo da velha---\n");
        
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
        System.out.println("         |         |         \n\n");
        
        System.out.print("Jogador \"X\" ou \"O\": ");
        String escolha = leitor.nextLine();
        
        System.out.print("Escolha a posição: ");
        int posição = leitor.nextInt();
        
        
        if (escolha.equalsIgnoreCase("X") &&(posição==1)){
                
        System.out.println("         |         |         ");
        System.out.println("   X     |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------"); 
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        }
        
        else if (escolha.equalsIgnoreCase("X") &&(posição==2)){
                
        System.out.println("         |         |         ");
        System.out.println("         |    X    |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------"); 
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        }
        
        else if (escolha.equalsIgnoreCase("X") &&(posição==3)){
                
        System.out.println("         |         |         ");
        System.out.println("         |         |    X    ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------"); 
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        }
        
        else if (escolha.equalsIgnoreCase("X") &&(posição==4)){
                
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------");
        System.out.println("         |         |         ");
        System.out.println("    X    |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------"); 
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        }
        
        else if (escolha.equalsIgnoreCase("X") &&(posição==5)){
                
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------");
        System.out.println("         |         |         ");
        System.out.println("         |    X    |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------"); 
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        }
        
        else if (escolha.equalsIgnoreCase("X") &&(posição==6)){
                
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------");
        System.out.println("         |         |         ");
        System.out.println("         |         |    X    ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------"); 
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        }
        
        else if (escolha.equalsIgnoreCase("X") &&(posição==7)){
                
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------"); 
        System.out.println("         |         |         ");
        System.out.println("    X    |         |         ");
        System.out.println("         |         |         ");
        }
        
        else if (escolha.equalsIgnoreCase("X") &&(posição==8)){
                
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------"); 
        System.out.println("         |         |         ");
        System.out.println("         |    X    |         ");
        System.out.println("         |         |         ");
        }
        
        else if (escolha.equalsIgnoreCase("X") &&(posição==9)){
                
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------"); 
        System.out.println("         |         |         ");
        System.out.println("         |         |    X    ");
        System.out.println("         |         |         ");
        }
        
       //OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
       
       
       
       
        if (escolha.equalsIgnoreCase("O") &&(posição==1)){
                
        System.out.println("         |         |         ");
        System.out.println("   O     |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------"); 
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        }
        
        else if (escolha.equalsIgnoreCase("O") &&(posição==2)){
                
        System.out.println("         |         |         ");
        System.out.println("         |    O    |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------"); 
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        }
        
        else if (escolha.equalsIgnoreCase("O") &&(posição==3)){
                
        System.out.println("         |         |         ");
        System.out.println("         |         |    O    ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------"); 
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        }
        
        else if (escolha.equalsIgnoreCase("O") &&(posição==4)){
                
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------");
        System.out.println("         |         |         ");
        System.out.println("    O    |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------"); 
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        }
        
        else if (escolha.equalsIgnoreCase("O") &&(posição==5)){
                
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------");
        System.out.println("         |         |         ");
        System.out.println("         |    O    |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------"); 
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        }
        
        else if (escolha.equalsIgnoreCase("O") &&(posição==6)){
                
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------");
        System.out.println("         |         |         ");
        System.out.println("         |         |    O    ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------"); 
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        }
        
        else if (escolha.equalsIgnoreCase("O") &&(posição==7)){
                
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------"); 
        System.out.println("         |         |         ");
        System.out.println("    O    |         |         ");
        System.out.println("         |         |         ");
        }
        
        else if (escolha.equalsIgnoreCase("O") &&(posição==8)){
                
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------"); 
        System.out.println("         |         |         ");
        System.out.println("         |    O    |         ");
        System.out.println("         |         |         ");
        }
        
        else if (escolha.equalsIgnoreCase("O") &&(posição==9)){
                
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("         |         |         ");
        System.out.println("---------+---------+---------"); 
        System.out.println("         |         |         ");
        System.out.println("         |         |    O    ");
        System.out.println("         |         |         ");
        }
        
        System.out.print("Escolha a posição: ");
        posição = leitor.nextInt();
        
        
        
        
    }
}