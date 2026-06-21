
package service;

import model.Tour;

import java.util.ArrayList;

public class TourService {

    // Mostrar tours
    public void mostrarTours(ArrayList<Tour> tours) {

        for (Tour tour : tours) {

            System.out.println(tour);

        }
    }

    // Buscar por nombre
    public void buscarTour(ArrayList<Tour> tours, String nombre) {

        boolean encontrado = false;

        for (Tour tour : tours) {

            if (tour.getNombre().equalsIgnoreCase(nombre)) {

                System.out.println(tour);
                encontrado = true;

            }
        }

        if (!encontrado) {

            System.out.println("Tour no encontrado");

        }
    }
}