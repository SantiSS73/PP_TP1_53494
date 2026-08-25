package org.example.ejercicio4;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {

    public static void main(String[] args){

        List<EventoUniversitario> eventos = new ArrayList<>();

        Sala SUM1 = new Sala(67, "SUM1");

        List<Estudiante> estudiantes = new ArrayList<>();

        EventoUniversitario evento1 = new EventoUniversitario("123","Pancheada UTN", 0.0, true);

        eventos.add(evento1);

        evento1.mostrarDatos();

        evento1.asignarSala(SUM1);

        Estudiante juan = new Estudiante("Juan", "1234");
        Estudiante pepe = new Estudiante("Pepe", "4321");
        Estudiante lucas = new Estudiante("Lucas", "0001");

        estudiantes.add(juan);
        estudiantes.add(pepe);
        estudiantes.add(lucas);

        evento1.crearActividad("Taller",6, "Robotica",50, false, "Pepito");
        evento1.crearActividad("Charla",6, "IA",60, true, "Juancito");

        evento1.charlas.get(0).inscribir(juan);
        evento1.talleres.get(0).inscribir(juan);
        evento1.charlas.get(0).inscribir(pepe);
        evento1.talleres.get(0).inscribir(lucas);

        System.out.println("La cantidad de eventos es " + EventoUniversitario.getCantidadEventos());
    }

}