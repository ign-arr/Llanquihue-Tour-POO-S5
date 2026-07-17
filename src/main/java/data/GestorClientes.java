
package data;

import model.Cliente;
import model.Direccion;
import model.Rut;
import util.LectorArchivo;

import java.util.ArrayList;

// Gestiona clientes
public class GestorClientes {

    private ArrayList<Cliente> clientes;

    public GestorClientes() {

        clientes = new ArrayList<>();

    }

    // Lee clientes desde un archivo
    public void cargarClientes(String ruta) {

        ArrayList<String> lineas = LectorArchivo.leerArchivo(ruta);

        for (String linea : lineas) {

            try {

                String[] datos = linea.split(";");

                Cliente cliente = new Cliente(
                        datos[0],
                        new Rut(datos[1]),
                        new Direccion(datos[2], datos[3]),
                        datos[4]
                );

                clientes.add(cliente);

            } catch (Exception e) {

                System.out.println("Error al cargar un cliente.");

            }

        }

    }

    // Devuelve los clientes
    public String mostrarClientes() {

        StringBuilder texto = new StringBuilder();

        for (Cliente cliente : clientes) {

            texto.append(cliente).append("\n");

        }

        return texto.toString();

    }

    public ArrayList<Cliente> getClientes() {

        return clientes;

    }

}