package ejemplos_clase;

public class FormasBucle {

    public static void main(String[] args) {
        System.out.println("MIENTRAS");
        {//INICIO BLOQUE
            //(1) BUCLE MIENTRAS (TEST INICIO)
            int i = 1, n = 5;
            while (i <= 5) { //true = blucle infinito
                System.out.println(i);
                i++;  //i = i + 1;
            }
        }//FIN BLOQUE

        System.out.println("HASTA");
        {
            //(2) BUCLE HASTA (TEST FINAL)
            int i = 1, n = 5;
            do {
                System.out.println(i);
                i++;
            } while (i <= n);
        }
        //(3) BUCLE PARA
        System.out.println("PARA");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

    }//FIN MAIN
}//FIN CLASS
