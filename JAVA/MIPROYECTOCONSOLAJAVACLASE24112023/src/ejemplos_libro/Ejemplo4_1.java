package ejemplos_libro;

import java.util.Scanner;

public class Ejemplo4_1 {

    public static void main(String[] args) {
        int s = 0;
        String x;
        //DECLAR VECTOR DE TAMAÑO 10
        String valores = "5,2,1,1,2,3,8,0,4,5";
        String[] vector = valores.split(",");
        //SUMAR LOS NUMEROS GUARDADOS EN EL VECTOR
        for (int i = 0; i < vector.length; i++) {
            x = vector[i];//"5"
            s = s + Integer.parseInt(x); //ACUMULADOR
        }
        //MOSTRAR SALIDA
        System.out.println("Suma: " + s);

        /*
                int s = 0;
        //DECLAR VECTOR DE TAMAÑO 10
        int[] vector = {1,8,2,0,2,4,5,9,5,2};
        //SUMAR LOS NUMEROS GUARDADOS EN EL VECTOR
        for (int i = 0; i < vector.length; i++) {
            s = s + vector[i]; //ACUMULADOR
        }
        //MOSTRAR SALIDA
        System.out.println("Suma: " + s);
         */
 /*
        int s = 0;
        //DECLAR VECTOR DE TAMAÑO 10
        int[] vector = new int[10];
        //LLENAR VECTOR
        vector[0] = 5;
        vector[1] = 1;
        vector[2] = 5;
        vector[3] = 5;
        vector[4] = 2;
        vector[5] = 5;
        vector[6] = 5;
        vector[7] = 8;
        vector[8] = 5;
        vector[9] = 0;

        //SUMAR LOS NUMEROS GUARDADOS EN EL VECTOR
        for (int i = 0; i < vector.length; i++) {
            s = s + vector[i]; //ACUMULADOR
        }
        //MOSTRAR SALIDA
        System.out.println("Suma: " + s);
         */
 /*
        Scanner sc = new Scanner(System.in);
        int s = 0;
        //DECLAR VECTOR DE TAMAÑO 10
        int[] vector = new int[10];
        //LLENAR VECTOR
        for(int i=0; i<vector.length; i++) {
            System.out.print("Ingrese número posición " + i + "? ");
            vector[i] = sc.nextInt();
        }
        //SUMAR LOS NUMEROS GUARDADOS EN EL VECTOR
        for(int i=0; i<vector.length; i++) {
            s = s + vector[i]; //ACUMULADOR
        }
        //MOSTRAR SALIDA
        System.out.println("Suma: " + s);
         */
    }

}
