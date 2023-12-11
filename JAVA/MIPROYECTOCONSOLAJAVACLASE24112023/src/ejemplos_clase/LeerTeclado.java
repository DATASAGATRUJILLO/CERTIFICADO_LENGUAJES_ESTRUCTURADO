package ejemplos_clase;

import java.util.Scanner;

public class LeerTeclado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        System.out.print("Ingrese su nombre ? ");
        String nombre = sc.next();
        System.out.print("Hola " + nombre + " Como estas");
        */
        System.out.println("Ingrese su nombre y apellido ?");
        String nombreApellido = sc.nextLine();
        System.out.println("Hola " + nombreApellido + " estas bien");
        
    }
    
}
