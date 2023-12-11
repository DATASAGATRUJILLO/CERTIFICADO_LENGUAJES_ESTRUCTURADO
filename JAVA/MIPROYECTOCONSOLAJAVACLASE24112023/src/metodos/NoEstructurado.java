package metodos;

public class NoEstructurado {

    public static void main(String[] args) {
        // DEFINIR TIPOS DATOS
        int radio; //Variable de entrada
        double area, perimetro;//Variable de salida
        // ENTRADA
        radio = (int)(Math.random() * 6 + 1);//[1,6]
        // PROCESO
        area = Math.PI * Math.pow(radio,2);
        perimetro = 2 * Math.PI * radio;
        // SALIDA
           //CABECERA
        System.out.printf("%6s %5s %10s\n","RADIO","AREA","PERIMETRO");
        System.out.printf("%6s %5s %10s\n","-----","----","---------");
           //CUERPO
        System.out.printf("%6d %5.2f %10.2f",radio,area,perimetro);
        
    }
    
}
