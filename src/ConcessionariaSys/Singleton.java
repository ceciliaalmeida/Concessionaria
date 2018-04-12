
package ConcessionariaSys;

import java.util.ArrayList;

public class Singleton {
    
    private Singleton() {
    }

    public static Singleton getInstance() {
        return NewSingletonHolder.INSTANCE;
    }
    
    private static class NewSingletonHolder {

        private static final Singleton INSTANCE = new Singleton();
    }
    
    private ArrayList<Motocicleta> motos = new ArrayList<>();
    private ArrayList<Automovel> carros = new ArrayList<>();
    private ArrayList<Comprador> compradores = new ArrayList<>();
    private ArrayList<Produto> todosProdutos = new ArrayList<>();
    private ArrayList<Vendas> vendido= new ArrayList<>();

    public ArrayList<Motocicleta> getMotos() {
        return motos;
    }

    public void setMotos(ArrayList<Motocicleta> motos) {
        this.motos = motos;
    }

    public ArrayList<Automovel> getCarros() {
        return carros;
    }

    public void setCarros(ArrayList<Automovel> carros) {
        this.carros = carros;
    }

    public ArrayList<Comprador> getCompradores() {
        return compradores;
    }

    public void setCompradores(ArrayList<Comprador> compradores) {
        this.compradores = compradores;
    }

    public ArrayList<Vendas> getVendido() {
        return vendido;
    }

    public void setVendido(ArrayList<Vendas> vendido) {
        this.vendido = vendido;
    }

    public ArrayList<Produto> getTodosProdutos() {
        return todosProdutos;
    }

    public void setTodosProdutos(ArrayList<Produto> todosProdutos) {
        this.todosProdutos = todosProdutos;
    }
    
    
}
