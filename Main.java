package org.example;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome \n");
        int nomVec1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        Persona nomVec2[] = {new Persona("Juan", "", 'M'),
                new Persona("Pablito", "",'M')};
        System.out.println("Registro de asistencia");
        Scanner leer = new Scanner(System.in);
        for (Persona elemento:nomVec2){
            System.out.println("Esta presente " +elemento.nombre+":");
            elemento.fechaReg=new Date();
            elemento.setEstadosasis(leer.nextLine());
            System.out.println(elemento.nombre+"-"+ elemento.estadosasis+"-"+ elemento.genero+e"-"+ elemento.fechaReg);
        }
        System.out.println("MOSTRAR REGISTRO DE ASISTENIA");
        for (Persona elemento: nomVec2){
            //System.out.println(elemento.nombre+"-"+elemento.estadosasis);//
            System.out.println(elemento.getNombre()+"-"+elemento.getEstadosasis());
        }


    }
}
