package coleccion_arraylist;

import java.util.ArrayList;
import java.util.List;

public class Principal1 {

    public static void main(String[] args) {
       //CREAR UNA COLECCION ARRAYLIST STRING
       List<String> nombres_al = new ArrayList<>(); 
       //AGREGAR ELEMENTOS
       nombres_al.add("Luis");
       nombres_al.add("Miguel");
       nombres_al.add("Carmen");
       nombres_al.add("Carlos");
       nombres_al.add("María");
       //MOSTRAR ARRAYLIST
       System.out.println(nombres_al);
       nombres_al.add("Arturo");
       System.out.println(nombres_al);
       //LIMPIAR ARRAYLIST
       nombres_al.clear();
       System.out.println(nombres_al);
       nombres_al.add("Silvia");
       nombres_al.add("Ismael");
       System.out.println(nombres_al);
       //MODIFICAR UN ARRAYLIST
       nombres_al.set(0,"Vanessa");
       System.out.println(nombres_al);
       //ELIMINAR UN ELEMENTO
       nombres_al.remove(0);
       System.out.println(nombres_al);
       
    } // FIN MAIN

} // FIN CLASE
