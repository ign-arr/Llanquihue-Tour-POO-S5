
package data;

import model.ExcursionCultural;
import model.Guia;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

import java.util.ArrayList;

// Gestiona servicios
public class GestorServicios {

    private ArrayList<ServicioTuristico> servicios;

    public GestorServicios() {

        servicios = new ArrayList<>();

    }

    // Agrega servicios
    public void cargarServicios(Guia guia) {

        servicios.add(new RutaGastronomica(
                "Ruta Gastronómica de Llanquihue",
                5,
                guia,
                4
        ));

        servicios.add(new PaseoLacustre(
                "Paseo por el Lago Llanquihue",
                3,
                guia,
                "Catamarán"
        ));

        servicios.add(new ExcursionCultural(
                "Ruta Patrimonial de Llanquihue",
                4,
                guia,
                "Museo Colonial Alemán"
        ));

    }

    // Devuelve los servicios
    public String mostrarServicios() {

        StringBuilder texto = new StringBuilder();

        for (ServicioTuristico servicio : servicios) {

            texto.append(servicio.toString());
            texto.append("\n");

        }

        return texto.toString();

    }

}