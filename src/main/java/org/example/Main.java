package org.example;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Andres", "Del Arco");
        Persona persona2 = new Persona("Bernardo", "Lee");
        Persona persona3 = new Persona("Carlos", "Cruz");
        Persona persona4 = new Persona("Spencer", "Gomez");
        Persona persona5 = new Persona("Zayn", "Rivera");

        List<Persona> listPersonas = new ArrayList<>();
        listPersonas.add(persona1);
        listPersonas.add(persona2);
        listPersonas.add(persona3);
        listPersonas.add(persona4);
        listPersonas.add(persona5);

        listPersonas.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getNombre().compareTo(p2.getNombre());
            }
        });
        mostrarListaPersonas(listPersonas, "nombre");


        listPersonas.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getApellido().compareTo(p2.getApellido());
            }
        });
        mostrarListaPersonas(listPersonas, "apellido");


        Collections.reverse(listPersonas);
        mostrarListaPersonas(listPersonas, "apellido de manera inversa");

    }



    private  static void  mostrarListaPersonas (List<Persona> list, String mensaje){
        int i = 1;
       System.out.println("Lista ordenada por " + mensaje);
        for ( Persona persona : list ){
            System.out.println( i + ". " + persona.getNombre() + " " + persona.getApellido()  );
            i=i+1;
        }
       System.out.println("\n" );
    }


}