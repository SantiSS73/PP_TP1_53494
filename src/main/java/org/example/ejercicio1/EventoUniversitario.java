package org.example.ejercicio1;

public class EventoUniversitario {
    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos;

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

    }
    public void mostrarDatos(){
        System.out.println(this.titulo);
        System.out.println(this.costoBase);
        if (gratuito==true){
            System.out.println("Es gratis.");
        } else {
            System.out.println("No es gratis.");
        }
    }

    public static int getCantidadEventos() {
        return cantidadEventos;
    }

    public void crearActividad(String idAct, String tituloAct, int cupo){
        System.out.println("Actividad del evento");
    }

}

