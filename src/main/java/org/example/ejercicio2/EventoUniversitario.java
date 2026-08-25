package org.example.ejercicio2;

import java.util.ArrayList;
import java.util.List;


public class EventoUniversitario {
    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos;
    private Sala sala;
    public List<Actividad> actividades = new ArrayList<>();


    public EventoUniversitario(String id) {
        this.id = id;
    }

    public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito) {
        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        cantidadEventos++;
    }
    public EventoUniversitario(EventoUniversitario obj){
        this.id = obj.id;
        this.titulo = obj.titulo;
        this.costoBase = obj.costoBase;
        this.gratuito = obj.gratuito;
        cantidadEventos++;
    }
    public double calcularCostoEstimado(){
        if(gratuito) {
            return 0.0;
        }
        return costoBase;
    }
    public void asignarSala(Sala sala){
            System.out.println("El evento " + this.titulo + " tiene asignada la sala " + sala.getNombre());
            this.sala = sala;
    }
    public void mostrarDatos(){
        System.out.println("Titulo:  " + this.titulo);
        System.out.println("Costo Base: " + this.costoBase);
        if (gratuito==true){
            System.out.println("Es gratis.");
        } else {
            System.out.println("No es gratis.");
        }
    }

    public static int getCantidadEventos() {
        return cantidadEventos;
    }

    public void crearActividad(int idAct, String tituloAct, int cupo){
        Actividad actividad = new Actividad(idAct, tituloAct, cupo );
        actividades.add(actividad);
    }
}