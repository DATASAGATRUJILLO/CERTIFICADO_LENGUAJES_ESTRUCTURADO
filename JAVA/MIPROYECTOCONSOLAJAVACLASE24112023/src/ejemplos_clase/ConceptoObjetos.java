package ejemplos_clase;


public class ConceptoObjetos {

    public static void main(String[] args) {
        String s, s1;//ESTO SI ES UN OBJETO
        int n; //NO ES UN OBJETO
        char letra;
             //0
        s = "Hola";
        s1 = "hola";
        System.out.println(s.equals(s1));//false
        System.out.println(s.equalsIgnoreCase(s1));//true
        
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        
        String resultado = String.valueOf(s1.charAt(0)).toUpperCase() + 
                           s1.substring(1, s1.length());
        System.out.println(resultado);
        
        
        
        
        
    }
    
}
