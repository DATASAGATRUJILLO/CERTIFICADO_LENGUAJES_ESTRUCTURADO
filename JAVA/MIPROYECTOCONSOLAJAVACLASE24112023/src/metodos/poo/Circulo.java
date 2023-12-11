package metodos.poo;

public class Circulo {
 
    public static double IVA = 0.16;
    
    //(1) ATRIBUTOS O VARIABLES DE INSTANCIA O VARIABLES DE OBJETO
    //ENTRADA
    private int radio;
    //SALIDA (CALCULABLES)
    private double area;
    private double perimetro;
    //(2) CONSTRUCTORES

    public Circulo(int radio) {
        this.radio = radio;
    }

    public Circulo() {
    }
    //(3) METODOS SET Y GET

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    //(4) METODOS CALCULO
    public double area() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    public double perimetro() {
        return 2 * Math.PI * this.radio;
    }
    //METODO DE CLASE
    public static void cabecera() {
        System.out.printf("%6s %10s %10s\n", "RADIO", "AREA", "PERIMETRO");
        System.out.printf("%6s %10s %10s\n", "-----", "----", "---------");
    }
    //METODO DE OBJETO O INSTANCIA
    public void cuerpo() {
        System.out.printf("%6d %10.2f %10.2f\n", this.radio, area(), perimetro());
    }
}
