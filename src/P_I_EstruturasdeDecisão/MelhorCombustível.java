package P_I_EstruturasdeDecisão;
import java.util.Scanner;
/*
Escreva um algoritmo que lê quantos km/l seu carro faz com gasolina e com álcool.
Além disso, o algoritmo também deve ler o preço do litro da gasolina e do álcool.
Ao final, o algoritmo deve mostrar qual a melhor opção de combustível para abastecer.
 */
public class MelhorCombustível {
    public static void main(String[] args) {
        double gas,alco,pgas,palcoo,resulgas,resulalc;

        Scanner leitor = new Scanner(System.in);
        System.out.println("---Melhor opção de combustível---");
        
        System.out.print("Quantos quilometros seu carro faz com um litro de álcool? ");
        alco = leitor.nextDouble();
        System.out.print("Qual o preço do litro do álcool? ");
        palcoo = leitor.nextDouble();
        System.out.print("Quantos quilometros seu carro faz com um litro de gasolina? ");
        gas = leitor.nextDouble();
        System.out.print("Qual o preço do litro da gasolina? ");
        pgas = leitor.nextDouble();
        
        resulgas = palcoo/alco;
        
        resulalc = pgas/gas;
        
        if (resulgas<resulalc)  {System.out.print("MELHOR OPÇÃO GASOLINA");
        }
        else if (resulalc<resulgas)   {System.out.print("MELHOR OPÇÃO ÁLCOOL");
        }
        else {System.out.print("MESMO PREÇO");
        }
    }
}
