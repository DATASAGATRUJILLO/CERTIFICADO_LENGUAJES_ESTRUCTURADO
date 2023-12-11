package ejemplos_clase;

import java.util.Scanner;

public class ConvertirDolarToSol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //(1) DEFINIR TIPOS DATOS
        double d, s;
        //(2) ENTRADA
        System.out.print("Ingrese cantidad dolares? ");
        d = sc.nextDouble();
        //(3) PROCESO
        s = d * 3.73;
        //(4) SALIDA
        System.out.println("Soles: " + s);
    }
}
