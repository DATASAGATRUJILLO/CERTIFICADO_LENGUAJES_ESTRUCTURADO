package ejemplos_clase;

import java.util.Scanner;

public class EjemploVector {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i;
        
        System.out.print("Ingrese tamaño del vector? ");
        n = sc.nextInt();
        int[] x = new int[n];//Crear vector dinámicamente
        //Llenar el vector
        for(i=0; i<n; i++) {
            x[i] = (int)(Math.random()*64 + 45);    //[45,108]
        }
        
        //Recorrer el vector
        for(i=0; i<n; i++) {
            System.out.println(i + " -> " + x[i]);
        }
        //Reccorrer el vector con un filtro
        for(i=0; i<n; i++) {
            if(x[i] % 2 != 0) {
                System.out.println(x[i]);
            }
        }
        //Recorrer el vector de manera inversa
        System.out.println("INVERSO");
        for(i=(n-1); i>=0; i--) { 
            System.out.println(i + " -> " + x[i]);
        }

        {//abrir bloque 1
            int k;
            
        }//cierro bloque 1
        
        {//abrir bloque 2
            int k;
            
        }//cierro bloque 2
       
        String m;
        
        
    }
    
}
