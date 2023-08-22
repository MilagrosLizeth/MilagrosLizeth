package Tarea;
import java.util.Scanner;

public class SumaPromedio {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el tres numeros:  ");
        int n1 =  scan.nextInt();
        int n2 =  scan.nextInt();
        int n3 =  scan.nextInt();

        int suma= n1+n2+n3;
        int promedio = suma / 3; 

        System.out.println("La suma de los numeros es : "+ suma);
        System.out.println("El promdeio de los numeros es : "+ promedio);

        scan.close();







    }
}
