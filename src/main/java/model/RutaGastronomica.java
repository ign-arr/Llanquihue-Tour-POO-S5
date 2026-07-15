
package model;

// Ruta gastronómica
public class RutaGastronomica extends ServicioTuristico {

    private int numeroParadas;

    public RutaGastronomica(String nombre, int duracionHoras, Guia guia, int numeroParadas) {
        super(nombre, duracionHoras, guia);
        this.numeroParadas = numeroParadas;
    }

    public int getNumeroParadas() {
        return numeroParadas;
    }

    public void setNumeroParadas(int numeroParadas) {
        this.numeroParadas = numeroParadas;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Paradas: " + numeroParadas;
    }

}