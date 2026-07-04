
package data;

import model.*;

import java.util.ArrayList;
import java.util.List;

// Gestiona los servicios
public class GestorServicios {

    private List<ServicioTuristico> servicios;

    public GestorServicios() {

        servicios = new ArrayList<>();

        Guia guia1 =
                new Guia(
                        "Maria Espinoza",
                        "939988712"
                );

        Guia guia2 =
                new Guia(
                        "Roberto Arriagada",
                        "932147821"
                );

        servicios.add(
                new RutaGastronomica(
                        "Ruta Cocina Local",
                        4,
                        guia1,
                        5
                )
        );

        servicios.add(
                new RutaGastronomica(
                        "Ruta Sabores del Lago",
                        3,
                        guia2,
                        4
                )
        );

        servicios.add(
                new PaseoLacustre(
                        "Paseo Lago Llanquihue",
                        2,
                        guia1,
                        "Catamarán"
                )
        );

        servicios.add(
                new PaseoLacustre(
                        "Paseo Bahía de Llanquihue",
                        1,
                        guia2,
                        "Lancha"
                )
        );

        servicios.add(
                new ExcursionCultural(
                        "Historia de Llanquihue",
                        5,
                        guia1,
                        "Museo Del Lago Llanquihue"
                )
        );

    }

    // Mostrar servicios
    public void mostrarServicios() {

        for (ServicioTuristico servicio : servicios) {

            servicio.mostrarInformacion();

        }

    }
