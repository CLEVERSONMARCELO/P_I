package P_I_EstruturasdeDecisão;
import java.util.Scanner;

public class Triângulo {
    public static void main (String[]args){
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("---Digite três medidas---");
        double medida1,medida2,medida3;
        //entrada
        System.out.print("Medida 1: ");
        medida1 = leitor.nextDouble();
        
        System.out.print("Medida 2: ");
        medida2 = leitor.nextDouble();
        
        System.out.print("Medida 3: ");
        medida3 = leitor.nextDouble();
        //processamento
        if (medida2-medida3<medida1&&medida1<medida2+medida3){System.out.println("Medidas formam um triângulo \n");
             }
        else if (medida1-medida3<medida2&&medida2<medida1+medida3){System.out.println("Medidas formam um triângulo \n");
            }
        else if (medida1-medida2<medida3&&medida3<medida1+medida2){System.out.println("Medidas formam um triângulo \n");
            }
        else {System.out.println("Medidas não forma triângulo! \n");
            }
        
        if (medida1==medida2&&medida1==medida3){System.out.printf("As medidas %.2f, %.2f e %.2f formam um triangulo Equilátero ", medida1,medida2,medida3);
            }
        else if (medida1==medida2||medida2==medida3||medida1==medida3){System.out.printf("As medidas %.2f, %.2f e %.2f formam um triangulo Isósceles ", medida1,medida2,medida3);
            }  
        else if (medida1!=medida2||medida1!=medida3){System.out.printf("As medidas %.2f, %.2f e %.2f formam um triangulo Escaleno \n\n\n\n\n", medida1,medida2,medida3);
            }

}}
