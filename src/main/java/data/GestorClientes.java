
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

    public void cargarClientes(String ruta) {

        ArrayList<String> datos = LectorArchivo.leerArchivo(ruta);

        for (String linea : datos) {

            try {

                String[] partes = linea.split(";");

                Cliente cliente = new Cliente(
                        partes[0],
                        new Rut(partes[1]),
                        new Direccion(partes[2], partes[3]),
                        partes[4]
                );

                clientes.add(cliente);

            } catch (Exception e) {

                System.out.println("Error al cargar cliente.");

            }

        }

    }

    public void mostrarClientes() {

        for (Cliente cliente : clientes) {

            System.out.println(cliente);

        }

    }

    public ArrayList<Cliente> getClientes() {

        return clientes;

    }

}
