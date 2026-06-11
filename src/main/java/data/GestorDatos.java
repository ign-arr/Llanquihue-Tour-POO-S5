
package data;

import model.Tour;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/** Gestiona lectura de datos */
public class GestorDatos {

    // Leer archivo
    public ArrayList<Tour> leerTours() {

        ArrayList<Tour> lista = new ArrayList<>();

        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader("src/main/resources/tours.txt")
                    );

            String linea;

            while ((linea = br.readLine()) != null) {

                // Separar datos
                String[] datos = linea.split(";");

                String nombre = datos[0];
                String comuna = datos[1];
                int precio = Integer.parseInt(datos[2]);

                // Crear objeto
                Tour tour =
                        new Tour(
                                nombre,
                                comuna,
                                precio
                        );

                // Guardar en lista
                lista.add(tour);
            }

            br.close();

        } catch (Exception e) {

            System.out.println("Error al leer archivo");

        }

        return lista;
    }
}