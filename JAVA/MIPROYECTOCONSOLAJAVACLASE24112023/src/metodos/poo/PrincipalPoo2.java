package metodos.poo;

public class PrincipalPoo2 {

    public static void main(String[] args) {
        int radio;
        System.out.println(Circulo.IVA);
        System.out.println(Math.PI);
        Circulo.cabecera();//METODO DE CLASE
        for(int i=0; i<100; i++) {
            Circulo c = new Circulo();
            radio = (int)(Math.random()*6 + 1);
            c.setRadio(radio);
            c.cuerpo();//METODO DE OBJETO
        }
        
    }
    
}
