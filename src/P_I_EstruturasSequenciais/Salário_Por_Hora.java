package P_I_EstruturasSequenciais;
import java.util.Scanner;

public class Salário_Por_Hora {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String nome;
        double valorh, quanth, salario;

        //entrada
        System.out.print("Digite o nome do funcionário: ");
        nome = leitor.next();

        System.out.print("Digite o valor de cada hora trabalhada: ");
        valorh = leitor.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        quanth = leitor.nextDouble();

        //processamento
        salario = valorh * quanth;

        //sáida
        System.out.printf("O funcionário %s trabalhou %.2f horas por R$ %.1f e deve receber R$ %.2f \n\n\n"
                , nome, quanth, valorh, salario);
}
}