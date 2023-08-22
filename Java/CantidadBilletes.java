package Tarea;
import java.util.Scanner;

public class CantidadBilletes {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de billetes de 10bs: ");
        int billetes10 = scan.nextInt();
        System.out.print("Ingrese la cantidad de Monedas de 5bs: ");
        int monedas5 = scan.nextInt();
        System.out.print("Ingrese la cantidad de Monedas de 2bs: ");
        int monedas2 = scan.nextInt();
        System.out.print("Ingrese la cantidad de Monedas de 1bs: ");
        int monedas1 = scan.nextInt();

        int cantidad10 = billetes10 * 10;
        int cantidad5 = monedas5 * 5;
        int cantidad2 = monedas2 *2;
        int cantidad1 = monedas1;
        int suma = cantidad10 + cantidad5 +cantidad2 +cantidad1;

        System.out.println("Cantidad de dinero en billetes de 10bs: "+ cantidad10);
        System.out.println("Cantidad de dinero en monedas de 5bs: " + cantidad5);
        System.out.println("Cantidad de dinero en monedas de 2bs: "+ cantidad2);
        System.out.println("Cantidad de dinero en monedas de 1bs: " + cantidad1);
        System.out.println("La cantidad de dinero que usted tiene es de: "+ suma +"bs");

        scan.close();

    }
    
}
