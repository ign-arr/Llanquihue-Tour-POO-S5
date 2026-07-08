
package model;

// Representa un guía turístico
public class Guia implements Registrable {

    private String nombre;
    private String telefono;

    public Guia(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return nombre + " - " + telefono;
    }

    // Mostrar resumen
    @Override
    public void mostrarResumen() {
        System.out.println("Guía: " + nombre + " | Teléfono: " + telefono);
    }

}