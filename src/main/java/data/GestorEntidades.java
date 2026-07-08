
package data;

import model.Guia;
import model.Registrable;
import model.Vehiculo;

import java.util.ArrayList;

// Gestiona entidades
public class GestorEntidades {

    private ArrayList<Registrable> entidades;

    public GestorEntidades() {

        entidades = new ArrayList<>();

    }

    // Agregar guía
    public void agregarGuia(Guia guia) {
        entidades.add(guia);
    }

    // Agregar vehículo
    public void agregarVehiculo(Vehiculo vehiculo) {
        entidades.add(vehiculo);
    }

    // Mostrar entidades
    public void mostrarEntidades() {

        for (Registrable entidad : entidades) {

            entidad.mostrarResumen();

            if (entidad instanceof Guia) {
                System.out.println("Tipo: Guía");
            }

            if (entidad instanceof Vehiculo) {
                System.out.println("Tipo: Vehículo");
            }

            System.out.println();

        }

    }

}