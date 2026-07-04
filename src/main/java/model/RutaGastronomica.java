
package model;

// Hereda de ServicioTuristico
public class RutaGastronomica extends ServicioTuristico {

    private int numeroDeParadas;

    public RutaGastronomica(String nombre,
                            int duracionHoras,
                            Guia guia,
                            int numeroDeParadas) {

        super(nombre, duracionHoras, guia);
        this.numeroDeParadas = numeroDeParadas;
    }

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Paradas: " + numeroDeParadas;
    }

    // Mostrar información
    @Override
    public void mostrarInformacion() {
        System.out.println("Ruta Gastronómica -> " + this);
    }

}