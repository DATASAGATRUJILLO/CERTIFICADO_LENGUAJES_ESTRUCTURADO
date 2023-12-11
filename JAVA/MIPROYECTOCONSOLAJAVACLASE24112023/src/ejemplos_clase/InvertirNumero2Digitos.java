package ejemplos_clase;

import java.util.Scanner;

public class InvertirNumero2Digitos {

    public static void main(String[] args) {
        /*
       int c = 5;
       int d = 2;
       System.out.println("Cociente = " + c/d);//2
       System.out.println("Residuo  = " + c%d);//1
         */
        Scanner sc = new Scanner(System.in);
        //(1) DEFINIR TIPOS DE DATOS
        int n, c, r;
        //(2) ENTRADA
        System.out.print("Ingrese número entero 2 dígitos? ");
        n = sc.nextInt();
        //(3) PROCESO
        c = n / 10;
        r = n % 10;
        //(4) SALIDA
        System.out.println("Número Invertido = " + (r * 10 + c));
    }
}
