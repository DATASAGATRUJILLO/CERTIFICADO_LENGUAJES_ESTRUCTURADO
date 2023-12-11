
public class Ejemplo4_2 {

    public static void main(String[] args) {
        int s = 0;
        //DECLAR VECTOR DE TAMAÑO 10
        int[] vector = {1, 8, 2, 0, 2, 4, 5, 9, 5, 2};
        //SUMAR LOS NUMEROS GUARDADOS EN EL VECTOR
        for (int i = 0; i < vector.length; i++) {
            s = s + vector[i]; //ACUMULADOR
        }
        //MOSTRAR SALIDA
        System.out.println("Media Aritmética: " + s/(double)vector.length);
    }

}
