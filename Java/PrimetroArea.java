package Tarea;

import java.util.Scanner;

public class PrimetroArea {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese la base del rectángulo: ");
        int base = scan.nextInt();

        System.out.print("Ingrese la altura del rectángulo: ");
        int altura = scan.nextInt();

        int area = altura * base ;
        int perimetro = (2*altura) + (2*base);

        System.out.println("La área del rectángulo es: " + area +"u^2");
        System.out.println("El perímertro del rectángulo es: " + perimetro +"u");

        scan.close();





    }
}
