
package ui;

import data.GestorClientes;
import data.GestorEntidades;
import data.GestorServicios;
import model.*;

public class Main {

    public static void main(String[] args) {

        try {

            // Clientes
            GestorClientes gestorClientes = new GestorClientes();

            gestorClientes.cargarClientes("src/main/resources/clientes.txt");

            System.out.println("===== CLIENTES =====");

            gestorClientes.mostrarClientes();

            System.out.println();

            // Guía
            Guia guia = new Guia(
                    "Pedro González",
                    new Rut("11.783.861-0"),
                    new Direccion("Vazquez 120", "Llanquihue"),
                    "986871203"
            );

            // Vehículo
            Vehiculo vehiculo = new Vehiculo(
                    "DZ-BH-19",
                    "Minibús"
            );

            // Entidades
            GestorEntidades gestorEntidades = new GestorEntidades();

            gestorEntidades.cargarEntidades(guia, vehiculo);

            System.out.println("===== ENTIDADES =====");

            gestorEntidades.mostrarEntidades();

            // Servicios
            GestorServicios gestorServicios = new GestorServicios();

            gestorServicios.cargarServicios(guia);

            System.out.println("===== SERVICIOS =====");

            gestorServicios.mostrarServicios();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

    }

}