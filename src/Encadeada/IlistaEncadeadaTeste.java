
package Encadeada;
import java.security.spec.InvalidParameterSpecException;
public interface IlistaEncadeadaTeste<Tipo> {
    
    public void adicionar(Tipo elemento);
    
    public void adicionarTodos(Tipo... elementos);
    
    public void adicionar(Tipo elemento, int indice) throws InvalidParameterSpecException;
    
    public void adicionarNoInicio(Tipo elemento);
    
    public void adicionarNoFim(Tipo elemento);
    
    public Tipo obter(int indice) throws InvalidParameterSpecException;
    
    public int contem(Tipo valor);
    
    public Tipo remover(int indice) throws InvalidParameterSpecException;
    
    public Tipo removerNoInicio();
    
    public Tipo removerNoFim();
    
    public boolean remover (Tipo elemento);
    
    public void limpar();
    
    public int tamanho();
    
    public int capacidade();
    
}