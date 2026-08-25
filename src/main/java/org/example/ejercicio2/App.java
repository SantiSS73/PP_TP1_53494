package org.example.ejercicio2;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {

    public static void main(String[] args){


        List<EventoUniversitario> eventos = new ArrayList<>();



        Sala SUM1 = new Sala(67, "SUM1");
        Sala SUM2 = new Sala(76, "SUM2");



        List<Estudiante> estudiantes = new ArrayList<>();

        EventoUniversitario evento1 = new EventoUniversitario("123","Conferencia sobre IA", 0.0, true);
        EventoUniversitario evento2 = new EventoUniversitario("234","Taller de Relojeria", 67.0, false);
        EventoUniversitario copia1 = new EventoUniversitario(evento1);
        EventoUniversitario copia2 = new EventoUniversitario(evento2);

        eventos.add(evento1);
        eventos.add(evento2);
        eventos.add(copia1);
        eventos.add(copia2);

        evento1.mostrarDatos();
        evento2.mostrarDatos();
        copia1.mostrarDatos();
        copia2.mostrarDatos();

        evento1.asignarSala(SUM1);
        evento2.asignarSala(SUM2);

        Estudiante juan = new Estudiante("Juan", "1234");
        Estudiante pepe = new Estudiante("Pepe", "4321");

        estudiantes.add(juan);
        estudiantes.add(pepe);

        evento1.crearActividad(6, "Entrega mochilas",50);
        evento1.crearActividad(7, "Entrega remeras",50);
        evento2.crearActividad(8, "Entrega pantalones",50);
        evento2.crearActividad(9, "Entrega guantes",50);

        for (Estudiante estudiante:estudiantes){
            for(EventoUniversitario eventoUniversitario:eventos){
                for(Actividad actividad:eventoUniversitario.actividades){
                    actividad.inscribir(estudiante);

                }
            }
        }
        for(EventoUniversitario eventoUniversitario:eventos){
            for(Actividad actividad:eventoUniversitario.actividades){
                actividad.mostrarInscripciones();
            }
        }
        System.out.println("La cantidad de eventos es " + EventoUniversitario.getCantidadEventos());
    }

}