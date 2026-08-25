package org.example.ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Actividad {
    private int id;
    private String titulo;
    private int cupoMaximo;
    public static final int CUPOMINIMO = 1;
    public List<Inscripcion> inscripciones = new ArrayList<>();

    public Actividad(int id, String titulo, int cupoMaximo, List<Inscripcion> inscripciones) {
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;
        this.inscripciones = inscripciones;
    }

    public Actividad(int cupoMaximo, String titulo, int id) {
        this.cupoMaximo = cupoMaximo;
        this.titulo = titulo;
        this.id = id;
    }

    public Inscripcion inscribir(Estudiante estudiante){
        Inscripcion inscripcion = new Inscripcion(LocalDate.now(), "inscripto", estudiante);
        inscripciones.add(inscripcion);
        return inscripcion;
    }
    public void mostrarInscripciones(){
        for(Inscripcion inscripcion:inscripciones){
            System.out.println("Legajo: " + inscripcion.getEstudiante().getLegajo());
            System.out.println("Nombre: " + inscripcion.getEstudiante().getNombre());
        }

    }
    public double calcularCostoMateriales(){
        double costoMateriales = 6.7;
        return costoMateriales;
    }
    public String getTipo(){
        return "hola";
    }
}
