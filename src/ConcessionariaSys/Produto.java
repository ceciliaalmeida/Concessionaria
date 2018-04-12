
package ConcessionariaSys;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    
    private String nome;
    private int AnoDeFab;
    private int numChassi;
    private String Categoria;
    private boolean comprou = false;

    public Produto(String nome, int AnoDeFab, int numChassi, String Categoria) {
        this.nome = nome;
        this.AnoDeFab = AnoDeFab;
        this.numChassi = numChassi;
        this.Categoria = Categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeFab() {
        return AnoDeFab;
    }

    public void setAnoDeFab(int AnoDeFab) {
        this.AnoDeFab = AnoDeFab;
    }

    public int getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public boolean isComprou() {
        return comprou;
    }

    public void setComprou(boolean comprou) {
        this.comprou = comprou;
    }


    @Override
    public String toString() {
        return "Produto{" + "nome=" + nome + ", AnoDeFab=" + AnoDeFab + ", numChassi=" + numChassi + ", Categoria=" + Categoria + '}';
    }

}
