
package model;

// Representa un cliente
public class Cliente extends Persona implements Registrable {

    private String telefono;

    public Cliente(String nombre, Rut rut, Direccion direccion, String telefono) {
        super(nombre, rut, direccion);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public void mostrarResumen() {
        System.out.println("Cliente: " + getNombre() + " | Teléfono: " + telefono);
    }

    @Override
    public String toString() {
        return super.toString() + " | " + telefono;
    }

}
