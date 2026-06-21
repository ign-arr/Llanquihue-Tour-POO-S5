
package app;

import data.GestorDatos;
import model.Tour;
import service.TourService;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();
        TourService servicio = new TourService();

        ArrayList<Tour> tours = gestor.leerTours();

        System.out.println("--- TODOS LOS TOURS ---");

        servicio.mostrarTours(tours);

        System.out.println();
        System.out.println("--- BUSQUEDA ---");

        servicio.buscarTour(
                tours,
                "Paseo Lago Llanquihue"
        );
    }
}
