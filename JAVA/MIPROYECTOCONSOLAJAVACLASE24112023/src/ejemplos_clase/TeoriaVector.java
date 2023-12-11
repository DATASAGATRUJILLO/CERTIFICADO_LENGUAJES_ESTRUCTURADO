package ejemplos_clase;

import java.util.Scanner;

public class TeoriaVector {

    public static void main(String[] args) {
        //VECTOR ESTATICO NOMBRES
        String[] nombre = {"Luis","Miguel","Carlos","Delly","Silvia",
                           "Luis","Miguel","Carlos","Delly","Silvia",
                           "Luis","Miguel","Carlos","Delly","Silvia"};
        int tamanio = nombre.length;
        System.out.println("Tamaño Vector: " + tamanio);
        //RECORRER UN VECTOR 
        for(int i=0; i<tamanio; i++) { //0 1 2 3 ... 14
            System.out.println(i + " -> " + nombre[i]);
        }
        //VECTOR ESTATICO NOMBRE MESES
        String[] mes = {"Enero","Febrero","Marzo","Abril",
                        "Mayor","Junio","Julio","Agosto",
                        "Septiembre","Octubre","Noviembre",
                        "Diciembre"};
        tamanio = mes.length;
        System.out.println("Tamaño Vector Mes: " + tamanio);
        
        System.out.println("Aleatorio: " + Math.random());
        
        int mesAleatorio = (int)(Math.random()*12);
        System.out.println("Mes Aleatorio: " + mesAleatorio + "  " +
                            mes[mesAleatorio]);
        for(int i=5; i<mes.length; i++) {
            System.out.println(i + " -> " + mes[i]);
        }
        
        System.out.println(mes[11]);
        
        
        /*
           Números Aleatorios Dado
           1 2 3 4 5 6        n=6
                              inicio=1
           int aleatorio = (int)(Math.random()*n + inicio)
           0.1 * 6 = 0.6 + 1 = 1.6   1
           0.3 * 6 = 1.8 + 1 = 2.8   2
           0.4 * 6 = 2.4 + 1 = 3.4   3
        
           [0, 11]
           n=12
           inicio=0
          int aleatorio = (int)(Math.random()*n + inicio)
        
        */
        //VECTOR ESTATICO DE ENTEROS
        int[] edad = {21,30,24,28,29};
        //VECTOR ESTATICO DE CARACTER
        char[] caracter = {'1','·','#'};
        //VECTOR ESTATICO DE REALES
        double[] estatura = {1.72, 1.68, 1.45};
        float[] estatura1 = {1.72f, 1.68f, 1.45f};
        //VECTOR ESTATICO DE LOGICO
        boolean[] esCasado = {false,true,false,true};
        
        //VECTOR DINAMICO
        //HAY QUE INGRESAR LOS DATOS DESDE EL TECLADO
        //INGRESAR ASIGNATURAS
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantas asignaturas ingresaras? ");
        int n = sc.nextInt(); //Tamaño del vector
        String[] asignatura = new String[n]; //Vector dinámico
        //LLNEAR EL VECTOR DINAMICAMENTE
        for(int i=0; i<n; i++) {
            System.out.print("Ingrese nombre asignatura? ");
            asignatura[i] = sc.next();
        }
        //RECORRER EL VECTOR
        for(int i = 0; i<n; i++) {
            System.out.println(i + " -> " + asignatura[i]);
        }
        //MODIFICAR EL VECTOR
        asignatura[0] = "NADA";
        //RECORRER EL VECTOR
        for(int i = 0; i<n; i++) {
            System.out.println(i + " -> " + asignatura[i]);
        }  
        //COPIAR EL VECTOR
        System.out.println("COPIA DE UN VECTOR");
        String[] x = mes;
        for(int i=0; i<x.length; i++) {
            System.out.println(x[i]);
        }
        
        System.out.println(mes[13]);
    }
    
}
