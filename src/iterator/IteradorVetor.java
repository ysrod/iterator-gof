package iterator;

import conjuntoplano.Estado;
import iterator.Iterador;

public class IteradorVetor implements Iterador {
    private Estado[] estados;
    private int estadoAtual;

    public IteradorVetor(Estado[] estados) {
        this.estados = estados;
        this.estadoAtual = -1;
    }


    @Override
    public Estado next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
