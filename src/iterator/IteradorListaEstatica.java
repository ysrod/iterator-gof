package iterator;

import conjuntoplano.Estado;
import java.util.ArrayList;

public class IteradorListaEstatica implements Iterador {
    private ArrayList<Estado> estados;
    private int estadoAtual;

    public IteradorListaEstatica(ArrayList<Estado> estados) {
        this.estados = estados;
        this.estadoAtual = -1;
    }

    @Override
    public Estado next() {
        return estados.get(++estadoAtual);
    }

    @Override
    public boolean hasNext() {
        int proximo = estadoAtual + 1;
        if(proximo < estados.size() && estados.get(estadoAtual + 1) != null)
            return true;

        return false;
    }
}
