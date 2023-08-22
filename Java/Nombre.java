package Tarea;
import java.util.Scanner;

public class Nombre {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese su Nombre:");
        String nombre = scan.nextLine(); // 

        System.out.println("Hola, un gusto conocerte, " + nombre); 

        scan.close(); 
    }
}