package iterator;

import conjuntoplano.Estado;
import java.util.ArrayList;

public class IteradorListaEstatica implements Iterador {
    private ArrayList<Estado> estados;
    private int EstadoAtual;

    public IteradorListaEstatica(ArrayList<Estado> estados) {
        this.estados = estados;
        this.EstadoAtual = -1;
    }

    @Override
    public Estado next() {
        return estados.get(++EstadoAtual);
    }

    @Override
    public boolean hasNext() {
        int proximo = EstadoAtual + 1;
        if(proximo < estados.size() && estados.get(EstadoAtual + 1) != null)
            return true;

        return false;
    }
}