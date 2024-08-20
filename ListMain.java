package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ListMain {
    public static void main(String[] args) {
        Scanner goku = new Scanner(System.in);


        int cantidad;
        System.out.println("INGRESE EL NUMERO DE ESTUDIANTES QUE HAY");
        cantidad=goku.nextInt();


        String [] nombres = new String[cantidad];
        String [] asistencia =new String[cantidad];
       for (int i=0;i<cantidad;i++) {
           System.out.println("INGRESE EL NUEMERO DE  ESTUDIANTE "+ (i+1)+":");
           nombres[i]=goku.next();
           System.out.println("ASISTIO EL ESTUIANTE "+nombres[i]+"(si o no");
           asistencia[i]=goku.nextLine();
           goku.nextLine();

       }
        System.out.println("lista de estudiantes");
        for (int i = 0; i < cantidad; i++) {
            String estadoAsistencia = asistencia[i].equals("sí") ? "Asistió" : "No asistió";
            System.out.println(nombres[i] + "----- " + estadoAsistencia);
        }


        List <Persona> per=new ArrayList<>();
        per.add(new Persona("Pablito","P", 'F'));
        per.add(new Persona("Pablito","P",'F'));
        per.add(new Persona("Pedro","P",'F'));
        System.out.println(per.get(2).getNombre());

        ArrayList<Persona>p =new ArrayList<>();
        p.add(new Persona("Pablito","P",'F'));
        System.out.println(p.get(0).getNombre());

        Persona[] pp=new Persona[10];
        pp[0]=new Persona("Pablito","P",'F');
        System.out.println(pp[0].getNombre());
    }
}
