
package data;

import model.*;

import java.util.ArrayList;

// Gestiona entidades
public class GestorEntidades {

    private ArrayList<Registrable> entidades;

    public GestorEntidades() {

        entidades = new ArrayList<>();

    }

    // Carga entidades
    public void cargarEntidades(Guia guia, Vehiculo vehiculo) {

        entidades.add(guia);
        entidades.add(vehiculo);

    }

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