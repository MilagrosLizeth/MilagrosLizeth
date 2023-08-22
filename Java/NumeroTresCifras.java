package Tarea;
import java.util.Scanner;

public class NumeroTresCifras {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese un numero de tres cifras: ");
        int numero = scan.nextInt();

        int digitoUnidad= numero%10 ;
        int digitoDecena = (numero/10)%10;
        int digitoCentena = (numero/100);

        int numeroInvertido = digitoUnidad*100 + digitoDecena*10 + digitoCentena;
        
        
        System.out.print("Ingrese un numero invertido es: "+ numeroInvertido);

        scan.close();
        

    }
}
