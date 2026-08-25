package org.example.ejercicio4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Actividad {
    private int id;
    private String titulo;
    private int cupoMaximo;
    public static final int CUPOMINIMO = 1;
    public List<Inscripcion> inscripciones = new ArrayList<>();

    public Actividad(int id, String titulo, int cupoMaximo) {
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;
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
