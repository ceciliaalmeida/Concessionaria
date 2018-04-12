
package Encadeada;
import java.security.spec.InvalidParameterSpecException;
import java.util.Iterator;
public abstract class ListaEncadeada<Tipo> implements Iterable, IlistaEncadeadaTeste<Tipo>{
   
    private No<Tipo> primeiro, ultimo;
    private int tamanho;
    
    public ListaEncadeada(){ // garantindo que o inicio esteja com inicio e final nulo;
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }
    @Override
    public void adicionar(Tipo elemento){// para adicionar estou garantindo que não há nda dentro dele e que estou criando um novo nó, o tamanho esta contando;
        No<Tipo> NovoNo = new No<Tipo>(elemento);
        if(primeiro == null){
            primeiro = ultimo = NovoNo;
            tamanho++;
        }
    }
    @Override
    public void adicionarTodos(Tipo... elementos){
        
    }
    
}
