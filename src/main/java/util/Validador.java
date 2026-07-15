
package util;

// Validaciones básicas
public class Validador {

    public static boolean validarTexto(String texto) {

        return texto != null && !texto.isBlank();

    }

}