package ejemplos_clase.alumno;

public class Principal {

    public static void main(String[] args) {
        //FORMULARIO CAJITA
        
        Alumno alumno1 = new Alumno(1,"",0,1.72,'H');
        
        System.out.println("Nombre: " + alumno1.getNombre());
        
        alumno1.setNombre("Miguel");

        
        System.out.println("Nombre: " + alumno1.getNombre());
        
        Alumno alumno2 = new Alumno(2,"Carmen",22,1.62,'M',true);
        
        int    x       = 3;
        Alumno alumno3 = new Alumno(1,"Luis",23,1.72,'H',false);
        
        Alumno alumno4 = new Alumno();
        
        alumno4.setNombre("Arturo");
        alumno4.setEdad(23);
        
        
        
        
    }
    
}
