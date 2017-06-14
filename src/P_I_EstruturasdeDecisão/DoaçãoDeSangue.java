package P_I_EstruturasdeDecisão;
import java.util.Scanner;
/*
Escreva um algoritmo que lê o seu tipo sanguíneo e mostra:
Para quais tipos você pode fazer uma doação de sangue
De quais tipos você pode receber uma doação de sangue
Exemplo:
Qual seu tipo sanguíneo: A-
Você pode doar para: A+, A-, AB-, AB+
Você pode receber de: A-, O-
 */
public class DoaçãoDeSangue {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String tipo;

        System.out.print("Digite seu tipo: ");
        tipo = leitor.nextLine();

        if (tipo.equalsIgnoreCase("a+")) {
            System.out.printf("%s\nRecebe de A+, A-, O+ e O-.Doa para A+ e AB+.", tipo);
        } else if (tipo.equalsIgnoreCase("a-")) {
            System.out.printf("%s\nRecebe de A+, A-, O+ e O-.\nDoa para A+ e AB+.", tipo);
        } else if (tipo.equalsIgnoreCase("b+")) {
            System.out.printf("%s\nRecebe de B+, B-, O+ e O-\nDoa para B+ e AB+", tipo);
        } else if (tipo.equalsIgnoreCase("b-")) {
            System.out.printf("%s\nRecebe de B- e 0-\nDoa para B+, B-, AB+ e AB-", tipo);
        } else if (tipo.equalsIgnoreCase("ab+")) {
            System.out.printf("%s\nRecebe de A+, A-, B+, B-, AB+, AB-, O+ e O-\nDoa para AB+", tipo);
        } else if (tipo.equalsIgnoreCase("ab-")) {
            System.out.printf("%s\nRecebe de A-, B-, AB- e O-\nDoa para AB+ e AB-", tipo);
        } else if (tipo.equalsIgnoreCase("o+")) {
            System.out.printf("%s\nRecebe de O+ e O-\nDoa para A+, B+, AB+ e O+", tipo);
        } else if (tipo.equalsIgnoreCase("o-")) {
            System.out.printf("%s\nRecebe de O-\nDoa para A+, A-, B+, B-, AB+, AB-, O+ e O-", tipo);
        } else {
            System.out.printf("Tipo de sangue %s INVÁLIDO", tipo);
        }
    }
}
