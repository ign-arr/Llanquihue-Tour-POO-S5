
package ui;

import data.GestorClientes;
import data.GestorEntidades;
import data.GestorServicios;
import model.Direccion;
import model.Guia;
import model.Rut;
import model.Vehiculo;

import javax.swing.JOptionPane;

// Programa principal
public class Main {

    public static void main(String[] args) {

        try {

            // Clientes
            GestorClientes gestorClientes = new GestorClientes();
            gestorClientes.cargarClientes("src/main/resources/clientes.txt");

            // Guía
            Guia guia = new Guia(
                    "Pedro González",
                    new Rut("11.111.111-1"),
                    new Direccion(
                            "Baquedano 120",
                            "Llanquihue"
                    ),
                    "987654321"
            );

            // Vehículo
            Vehiculo vehiculo = new Vehiculo(
                    "ABCD-12",
                    "Minibús"
            );

            // Entidades
            GestorEntidades gestorEntidades = new GestorEntidades();
            gestorEntidades.cargarEntidades(guia, vehiculo);

            // Servicios
            GestorServicios gestorServicios = new GestorServicios();
            gestorServicios.cargarServicios(guia);

            String opcion;

            do {

                opcion = JOptionPane.showInputDialog(
                        null,
                        """
                        ===== LLANQUIHUE TOUR =====
                        
                        1. Ver clientes
                        2. Ver entidades
                        3. Ver servicios
                        4. Salir
                        """,
                        "Menú",
                        JOptionPane.QUESTION_MESSAGE
                );

                if (opcion == null) {
                    break;
                }

                switch (opcion) {

                    case "1":

                        JOptionPane.showMessageDialog(
                                null,
                                gestorClientes.mostrarClientes(),
                                "Clientes",
                                JOptionPane.INFORMATION_MESSAGE
                        );

                        break;

                    case "2":

                        JOptionPane.showMessageDialog(
                                null,
                                gestorEntidades.mostrarEntidades(),
                                "Entidades",
                                JOptionPane.INFORMATION_MESSAGE
                        );

                        break;

                    case "3":

                        JOptionPane.showMessageDialog(
                                null,
                                gestorServicios.mostrarServicios(),
                                "Servicios",
                                JOptionPane.INFORMATION_MESSAGE
                        );

                        break;

                    case "4":

                        JOptionPane.showMessageDialog(
                                null,
                                "Gracias por utilizar Llanquihue Tour."
                        );

                        break;

                    default:

                        JOptionPane.showMessageDialog(
                                null,
                                "Opción no válida."
                        );

                }

            } while (!opcion.equals("4"));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    null,
                    e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );

        }

    }

}