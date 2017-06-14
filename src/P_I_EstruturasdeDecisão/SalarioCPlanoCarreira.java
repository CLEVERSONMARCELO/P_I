package P_I_EstruturasdeDecisão;
import java.util.Scanner;

public class SalarioCPlanoCarreira {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String nome;
        int nivel;
        float quanth;

        //entrada

        System.out.print("Nome do funcionário: ");
        nome = leitor.next();
        System.out.println("      Plano de carreira:");
        System.out.println("NÍVEL	           VALOR DA HORA");
        System.out.println("  1----------------R$ 15,00");
        System.out.println("  2----------------R$ 18,00");
        System.out.println("  3----------------R$ 22,00");
        System.out.println("  4----------------R$ 27,00");
        System.out.println("  5----------------R$ 33,00");

        System.out.print("Digite o nível do funcionário:  ");
        nivel = leitor.nextInt();

        System.out.print("Quantidade de horas trabalhadas: ");
        quanth = leitor.nextFloat();

        //saída
        
        if (nivel == 1) {
            System.out.printf("O funcionário %s trabalhou %.0f horas, por cada hora R$ 15,oo - possui nível: %d deve "
                    + "receber "+ (quanth*15), nome, quanth, nivel);
        }
        else if (nivel == 2) {
            System.out.printf("O funcionário %s trabalhou %.0f horas, por cada hora R$ 18,oo - possui nível: %d deve "
                    + "receber "+ (quanth*18), nome, quanth, nivel);
        }
        else if (nivel == 3) {
            System.out.printf("O funcionário %s trabalhou %.0f horas, por cada hora R$ 22,oo - possui nível: %d deve "
                    + "receber "+ (quanth*22), nome, quanth, nivel);
        }
        else if (nivel == 4) {
            System.out.printf("O funcionário %s trabalhou %.0f horas, por cada hora R$ 27,oo - possui nível: %d deve "
                    + "receber "+ (quanth*27), nome, quanth, nivel);
        }
        else if (nivel == 5) {
            System.out.printf("O funcionário %s trabalhou %.0f horas, por cada hora R$ 33,oo - possui nível: %d deve "
                    + "receber "+ (quanth*33), nome, quanth, nivel);
        }
        else {
            System.out.println("Digite o nível do funcionário de acordo com a tabela ");
}
}}