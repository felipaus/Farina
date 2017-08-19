/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farinarestorante;

/**
 *
 * @author felip
 */
class Comidas {

    float precio;
    String nombre;

    public Comidas(String n, float p) {
        this.precio = p;
        this.nombre = n;
    }

    public void set_precio(float p) {
        this.precio = p;
    }

    public void set_nombre(String n) {
        this.nombre = n;
    }

    public float get_precio() {
        return this.precio;
    }

    public String get_nombre() {
        return this.nombre;
    }
}
