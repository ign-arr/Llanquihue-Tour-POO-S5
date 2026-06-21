
package data;

import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class GestorDatos {

    public ArrayList<Tour> leerTours() {

        ArrayList<Tour> tours = new ArrayList<>();

        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader("src/main/resources/tours.txt")
                    );

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(";");

                String nombre = datos[0];
                String comuna = datos[1];
                int precio = Integer.parseInt(datos[2]);

                tours.add(
                        new Tour(
                                nombre,
                                comuna,
                                precio
                        )
                );
            }

            br.close();

        } catch (Exception e) {

            System.out.println("Error al leer archivo");

        }

        return tours;
    }
}