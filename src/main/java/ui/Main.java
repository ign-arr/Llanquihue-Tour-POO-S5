
package ui;

import data.GestorDatos;
import model.Tour;
import java.util.ArrayList;

/** Clase principal */
public class Main {

    public static void main(String[] args) {

        // Crear gestor
        GestorDatos gestor = new GestorDatos();

        // Leer tours
        ArrayList<Tour> tours = gestor.leerTours();

        System.out.println("--- TODOS LOS TOURS ---");

        // Mostrar tours
        for (Tour tour : tours) {

            System.out.println(tour);

        }

        System.out.println();
        System.out.println("--- TOURS MAYORES A $10000 ---");

        // Filtrar tours
        for (Tour tour : tours) {

            if (tour.getPrecio() > 10000) {

                System.out.println(tour);

            }

        }
    }
}
