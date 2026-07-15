
package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// Lee archivos txt
public class LectorArchivo {

    public static ArrayList<String> leerArchivo(String ruta) {

        ArrayList<String> datos = new ArrayList<>();

        try {

            BufferedReader br = new BufferedReader(new FileReader(ruta));

            String linea;

            while ((linea = br.readLine()) != null) {

                datos.add(linea);

            }

            br.close();

        } catch (IOException e) {

            System.out.println("Error al leer el archivo.");

        }

        return datos;

    }

}