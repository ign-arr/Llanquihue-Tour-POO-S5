
package model;

// Superclase
public class ServicioTuristico {

    private String nombre;
    private int duracionHoras;
    private Guia guia;

    public ServicioTuristico(String nombre, int duracionHoras, Guia guia) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
        this.guia = guia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public Guia getGuia() {
        return guia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                " | Duración: " + duracionHoras + " horas" +
                " | Guía: " + guia;
    }

}