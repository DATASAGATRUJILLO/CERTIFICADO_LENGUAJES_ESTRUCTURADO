package ejemplos_libro;

import java.util.Scanner;

public class Ejemplo1_16 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //(1) DEFINIR TIPO DATOS
        int n,c, r1, d, u;
        //(2) ENTRADA
        System.out.print("Ingrese número entero de 3 dígitos? ");
        n = sc.nextInt();
        //(3) PROCESAR
        c = n / 100;    //1
        r1 = n % 100;   //23
        d = r1 / 10;    //2
        u = r1 % 10;    //3
        //(4) SALIDA
        System.out.println(u + "" + d + "" + c);
    }
    
}
