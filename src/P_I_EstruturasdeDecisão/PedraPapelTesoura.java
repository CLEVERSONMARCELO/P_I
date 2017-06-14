package P_I_EstruturasdeDecisão;
import java.util.Random;
import java.util.Scanner;
/*
Escreva um programa que jogue o jogo "Papel, Pedra, Tesoura" com você.
 */
public class PedraPapelTesoura {
    public static void main(String[] args) {
        //entrada
        Scanner leitor = new Scanner(System.in);

        System.out.println("---Pedra, papel e tesoura---\n\n");
        System.out.println("Escolha: ");
        String jogada = leitor.nextLine();
        
        //processamento
       
        String[] opcoes = { "pedra", "papel", "tesoura" };
        String selecionada = opcoes[new Random().nextInt(opcoes.length)];
        
        //saída
        if (jogada.equalsIgnoreCase(selecionada)) {System.out.printf("Escolha: %s\nEsolha Pc: %s\nEMPATE!!!",jogada,selecionada);
        }
        else if (jogada.equalsIgnoreCase("papel") && selecionada.equalsIgnoreCase("pedra"))  {
            System.out.printf("Escolha: %s\nEsolha Pc: %s\nVocê VENCEU!!!",jogada,selecionada);
        }   
        else if (jogada.equalsIgnoreCase("tesoura") && selecionada.equalsIgnoreCase("pepel"))  {
            System.out.printf("Escolha: %s\nEsolha Pc: %s\nVocê VENCEU!!!",jogada,selecionada);
        }         
        else if (jogada.equalsIgnoreCase("pedra") && selecionada.equalsIgnoreCase("tesoura"))  {
            System.out.printf("Escolha: %s\nEsolha Pc: %s\nVocê VENCEU!!!",jogada,selecionada);
        } 
        else {System.out.printf("Escolha: %s\nSorteio PC: %s\nDERROTA!!!",jogada,selecionada);
        } 
    }
}

