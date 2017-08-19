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
class pastas extends Comidas {

    String salsa;

    public pastas(String n, Float p, String s) {
        super(n + " salsa : " + s, p.floatValue());
        this.salsa = s;
    }

    public void set_salsa(String s) {
        this.salsa = s;
    }

    public String get_salsa() {
        return this.salsa;
    }
}
