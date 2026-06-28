
package data;

import model.ExcursionCultural;
import model.Guia;
import model.PaseoLacustre;
import model.RutaGastronomica;
import service.ServicioService;
import util.Validador;

// Crea servicios
public class GestorServicios {

    public void crearServicios() {

        ServicioService servicio = new ServicioService();

        // Guías
        Guia guia1 = new Guia("Maria Espinoza", "939988712");
        Guia guia2 = new Guia("Roberto Arriagada", "932147821");

        // Rutas gastronómicas
        RutaGastronomica ruta1 =
                new RutaGastronomica(
                        "Ruta Cocina Local",
                        4,
                        guia1,
                        5);

        RutaGastronomica ruta2 =
                new RutaGastronomica(
                        "Ruta Sabores del Lago",
                        3,
                        guia2,
                        4);

        // Paseos lacustres
        PaseoLacustre paseo1 =
                new PaseoLacustre(
                        "Paseo Lago Llanquihue",
                        2,
                        guia1,
                        "Catamarán");

        PaseoLacustre paseo2 =
                new PaseoLacustre(
                        "Paseo Bahía de Llanquihue",
                        1,
                        guia2,
                        "Lancha");

        // Excursiones culturales
        ExcursionCultural excursion1 =
                new ExcursionCultural(
                        "Historia de Llanquihue",
                        5,
                        guia1,
                        "Parroquia San José");

        ExcursionCultural excursion2 =
                new ExcursionCultural(
                        "Patrimonio Local",
                        4,
                        guia2,
                        "Museo Del Lago Llanquihue");

        // Mostrar servicios
        if (Validador.duracionValida(ruta1.getDuracionHoras()))
            servicio.mostrarServicio(ruta1);

        if (Validador.duracionValida(ruta2.getDuracionHoras()))
            servicio.mostrarServicio(ruta2);

        System.out.println();

        if (Validador.duracionValida(paseo1.getDuracionHoras()))
            servicio.mostrarServicio(paseo1);

        if (Validador.duracionValida(paseo2.getDuracionHoras()))
            servicio.mostrarServicio(paseo2);

        System.out.println();

        if (Validador.duracionValida(excursion1.getDuracionHoras()))
            servicio.mostrarServicio(excursion1);

        if (Validador.duracionValida(excursion2.getDuracionHoras()))
            servicio.mostrarServicio(excursion2);

    }

}