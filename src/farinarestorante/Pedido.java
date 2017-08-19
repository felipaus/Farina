/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farinarestorante;

import java.util.ArrayList;

/**
 *
 * @author felip
 */
class Pedido {

    float monto;
    ArrayList<Comidas> C;

    public Pedido() {
        this.C = new ArrayList();
        this.monto = 0.0F;
    }

    public void set_monto(int m) {
        this.monto = m;
    }

    public void set_comida(Comidas X) {
        this.C.add(X);
    }

    public float get_monto() {
        return this.monto;
    }

    public Comidas get_comida(int p) {
        return (Comidas) this.C.get(p);
    }

    public int get_CantidadDeElementos() {
        return this.C.size();
    }
    public void borrar_comida(int m)
    {
        C.remove(m-1);
    }

}
