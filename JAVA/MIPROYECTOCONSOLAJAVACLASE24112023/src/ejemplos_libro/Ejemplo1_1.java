package ejemplos_libro;

import java.util.Scanner;

public class Ejemplo1_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//input = entrada
        //(1) DEFINIR TIPOS DE DATOS
        double b,h,a;
        //(2) ENTRADA
        System.out.print("Ingrese base triangulo? ");
        b = sc.nextDouble();
        System.out.print("Ingrese altura triangulo? ");
        h = sc.nextDouble();
        //(3) PROCESO
        a = (b * h)/2;
        //(4) SALIDA
        System.out.println("Area Triangulo = " + a);
    }
}
