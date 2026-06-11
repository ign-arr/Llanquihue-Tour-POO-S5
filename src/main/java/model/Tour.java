
package model;

/** Clase Tour */
public class Tour {

    // Atributos
    private String nombre;
    private String comuna;
    private int precio;

    // Constructor
    public Tour(String nombre, String comuna, int precio) {
        this.nombre = nombre;
        this.comuna = comuna;
        this.precio = precio;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getComuna() {
        return comuna;
    }

    public int getPrecio() {
        return precio;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    // Mostrar datos
    @Override
    public String toString() {
        return "Tour: " + nombre
                + " | Comuna: " + comuna
                + " | Precio: $" + precio;
    }
}