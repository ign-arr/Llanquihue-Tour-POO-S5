
package model;

// Hereda de ServicioTuristico
public class ExcursionCultural extends ServicioTuristico {

    private String lugarHistorico;

    public ExcursionCultural(String nombre,
                             int duracionHoras,
                             Guia guia,
                             String lugarHistorico) {

        super(nombre, duracionHoras, guia);
        this.lugarHistorico = lugarHistorico;
    }

    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Lugar histórico: " + lugarHistorico;
    }

}