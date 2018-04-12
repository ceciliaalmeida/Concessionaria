/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConcessionariaSys;

/**
 *
 * @author Thiago
 */
public class Vendas {

    private Produto prod;
    private Comprador comp;

    
    public Vendas(Produto prod, Comprador comp) {
        this.prod = prod;
        this.comp = comp;
    }

    public Produto getProd() {
        return prod;
    }

    public void setProd(Produto prod) {
        this.prod = prod;
    }

    public Comprador getComp() {
        return comp;
    }

    public void setComp(Comprador comp) {
        this.comp = comp;
    }

}
