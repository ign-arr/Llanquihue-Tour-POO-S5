
package model;

import util.RutInvalidoException;

// Representa un RUT
public class Rut {

    private String numero;

    public Rut(String numero) throws RutInvalidoException {

        if (numero == null || numero.isBlank()) {
            throw new RutInvalidoException("RUT inválido.");
        }

        this.numero = numero;

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return numero;
    }

}