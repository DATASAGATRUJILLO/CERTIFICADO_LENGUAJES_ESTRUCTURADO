package coleccion_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Principal2 {
    public static void main(String[] args) {
       //CREAR COLECCION ARRAYLIST OBJETOS ALUMNO
       List<Alumno> alumnos_al = new ArrayList<>();
       //AÑADIR OBJETOS
       alumnos_al.add(new Alumno(1,"Luis"));
       alumnos_al.add(new Alumno(2,"Miguel"));
       alumnos_al.add(new Alumno(3,"Carmen"));
       alumnos_al.add(new Alumno(4,"Carlos"));
       alumnos_al.add(new Alumno(5,"María"));
       //MOSTRAR
       System.out.println(alumnos_al);
       //ELIMINAR
       alumnos_al.remove(2);
       System.out.println(alumnos_al);
       //AÑADIR OTRO OBJETO
       alumnos_al.add(new Alumno(6,"Herson"));
       System.out.println(alumnos_al);
    }
}

class Alumno {
   
    private int idAlumno;
    private String nombre;

    public Alumno() {
    }

    public Alumno(int idAlumno, String nombre) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //MOSTRAR TODOS LOS ATRIBUTOS DEL OBJETO
    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + '}';
    }
    
    
    
    
    
    
    
}


