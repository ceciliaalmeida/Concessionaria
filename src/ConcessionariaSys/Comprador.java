
package ConcessionariaSys;

import java.util.ArrayList;
import java.util.List;

public class Comprador {
    private String nome;
    private int cpf;
    private List<Produto> prods = new ArrayList<>();

    public Comprador(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public List<Produto> getProds() {
        return prods;
    }

    public void setProds(List<Produto> prods) {
        this.prods = prods;
    }

    @Override
    public String toString() {
        return "Comprador{" + "nome=" + nome + ", cpf=" + cpf + ", prods=" + prods + '}';
    }

    
    
    
    
}
