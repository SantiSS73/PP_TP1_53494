package org.example.ejercicio1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args){
        EventoUniversitario evento1 = new EventoUniversitario("123","Conferencia", 0.0, true);
        EventoUniversitario evento2 = new EventoUniversitario("234","PartidoFutbol", 67.0, false);
        EventoUniversitario copia1 = new EventoUniversitario(evento1);
        EventoUniversitario copia2 = new EventoUniversitario(evento2);

        evento1.mostrarDatos();
        evento2.mostrarDatos();
        copia1.mostrarDatos();
        copia2.mostrarDatos();
        System.out.println("La cantidad de eventos es " + EventoUniversitario.getCantidadEventos());
    }

}