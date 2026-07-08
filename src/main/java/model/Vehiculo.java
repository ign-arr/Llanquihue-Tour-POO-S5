
package model;

// Representa un vehículo
public class Vehiculo implements Registrable {

    private String patente;
    private String tipo;

    public Vehiculo(String patente, String tipo) {
        this.patente = patente;
        this.tipo = tipo;
    }

    public String getPatente() {
        return patente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return tipo + " - " + patente;
    }

    // Mostrar resumen
    @Override
    public void mostrarResumen() {
        System.out.println("Vehículo: " + tipo + " | Patente: " + patente);
    }

}