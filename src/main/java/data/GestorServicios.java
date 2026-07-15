
package data;

import model.*;

import java.util.ArrayList;

// Gestiona servicios
public class GestorServicios {

    private ArrayList<ServicioTuristico> servicios;

    public GestorServicios() {

        servicios = new ArrayList<>();

    }

    // Crea servicios de prueba
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

    public void mostrarServicios() {

        for (ServicioTuristico servicio : servicios) {

            servicio.mostrarInformacion();

        }

    }

}