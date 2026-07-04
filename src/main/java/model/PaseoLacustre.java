
package model;

// Hereda de ServicioTuristico
public class PaseoLacustre extends ServicioTuristico {

    private String tipoEmbarcacion;

    public PaseoLacustre(String nombre,
                         int duracionHoras,
                         Guia guia,
                         String tipoEmbarcacion) {

        super(nombre, duracionHoras, guia);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Embarcación: " + tipoEmbarcacion;
    }

    // Mostrar información
    @Override
    public void mostrarInformacion() {
        System.out.println("Paseo Lacustre -> " + this);
    }

}
