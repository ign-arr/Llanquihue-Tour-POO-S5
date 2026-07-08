
package ui;

import data.GestorEntidades;
import model.Guia;
import model.Vehiculo;

import javax.swing.JOptionPane;

// Clase principal
public class Main {

    public static void main(String[] args) {

        GestorEntidades gestor = new GestorEntidades();

        int opcion;

        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "1. Agregar guía\n" +
                            "2. Agregar vehículo\n" +
                            "3. Mostrar entidades\n" +
                            "4. Salir"
            ));

            switch (opcion) {

                case 1:

                    String nombre = JOptionPane.showInputDialog("Nombre del guía");
                    String telefono = JOptionPane.showInputDialog("Teléfono");

                    gestor.agregarGuia(
                            new Guia(nombre, telefono)
                    );

                    break;

                case 2:

                    String patente = JOptionPane.showInputDialog("Patente");
                    String tipo = JOptionPane.showInputDialog("Tipo de vehículo");

                    gestor.agregarVehiculo(
                            new Vehiculo(patente, tipo)
                    );

                    break;

                case 3:

                    gestor.mostrarEntidades();

                    JOptionPane.showMessageDialog(
                            null,
                            "Los datos fueron mostrados en la consola."
                    );

                    break;

            }

        } while (opcion != 4);

    }

}