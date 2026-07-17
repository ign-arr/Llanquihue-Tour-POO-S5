
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

    // Agrega entidades
    public void cargarEntidades(Guia guia, Vehiculo vehiculo) {

        entidades.add(guia);
        entidades.add(vehiculo);

    }

    // Devuelve las entidades
    public String mostrarEntidades() {

        StringBuilder texto = new StringBuilder();

        for (Registrable entidad : entidades) {

            texto.append(entidad.toString());

            if (entidad instanceof Guia) {

                texto.append(" (Guía)");

            }

            if (entidad instanceof Vehiculo) {

                texto.append(" (Vehículo)");

            }

            texto.append("\n");

        }

        return texto.toString();

    }

}