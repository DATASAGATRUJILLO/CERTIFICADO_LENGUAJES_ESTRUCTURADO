package ejemplos_clase;

import java.util.Scanner;

public class OperacionesAritmeticas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //(1) DEFINIR TIPOS DATOS
        double n1, n2, resultado;
        String operacion, r;
        do {
            //(2) ENTRADA
            System.out.print("Ingrese operación aritmética (+ - / *)? ");
            operacion = sc.next();
            System.out.print("Ingrese número 1? ");
            n1 = sc.nextDouble();
            System.out.print("Ingrese número 2? ");
            n2 = sc.nextDouble();
            //(3) PROCESO
            switch (operacion) {
                case "+":
                    resultado = n1 + n2;
                    System.out.println("Sumar: " + resultado);//(4) SALIDA
                    break;
                case "-":
                    resultado = n1 - n2;
                    System.out.println("Restar: " + resultado);//(4) SALIDA
                    break;
                case "/":
                    resultado = n1 / n2;
                    System.out.println("Dividir: " + resultado);//(4) SALIDA
                    break;
                case "*":
                    resultado = n1 * n2;
                    System.out.println("Multiplicar:   " + resultado);//(4) SALIDA
                    break;
                default:
                    System.out.println("Entrada Incorrecta, debe ingresar + - / *");//(4) SALIDA       
            }
            System.out.print("Desea ejecutar denuevo el programa (S/N)? ");
            r = sc.next(); //s
        } while (r.equalsIgnoreCase("S"));

    }
}
