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
        return this.estados[++estadoAtual];
    }

    @Override
    public boolean hasNext() {
        int proximo = estadoAtual + 1;
        return proximo < this.estados.length && this.estados[proximo] != null;
    }

    // Como usar esse método para tratar de casos quando o array estiver cheio?
    public void increaseArrayLimit() {
        Estado[] aux = new Estado[this.estados.length + 10];

        for (int i = 0; i < this.estados.length; i++) {
            aux[i] = this.estados[i];
        }

        this.estados = aux;
    }
}
