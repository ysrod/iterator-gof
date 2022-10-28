package iterator;

import conjuntoplano.Estado;

public class IteradorListaDinamica implements Iterador{

    private int contador;
    private IteradorNo primeiro;
    private IteradorNo ultimo;
    private IteradorNo atual;

    public IteradorListaDinamica() {
        this.contador = 0;
        this.primeiro = null;
        this.ultimo = null;
        this.atual = null;
    }

    public IteradorListaDinamica(IteradorListaDinamica listaDinamica){
        this.contador = listaDinamica.size();
        this.primeiro = listaDinamica.primeiro;
        this.ultimo =  listaDinamica.ultimo;
        this.atual = listaDinamica.primeiro;
    }

    public int size(){
        return contador;
    }


    public void add(Estado estado) {
        IteradorNo novoNo = new IteradorNo(estado);
        if (primeiro == null) {
            primeiro = novoNo;
            atual = primeiro;
            ultimo = novoNo;
        } else {

            ultimo.setProximo(novoNo);
            novoNo.setAnterior(ultimo);
            ultimo = novoNo;

        }
        contador++;
    }

    public void remove(int indice) {
        IteradorNo aux = primeiro;
        for (int i = 0; i < indice; i++) {
            aux = aux.getProximo();
        }
        aux.getAnterior().setProximo(aux.getProximo());
        aux.getProximo().setAnterior(aux.getAnterior());
        contador--;
    }

    @Override
    public Estado next() {
        IteradorNo aux = atual;
        atual = atual.getProximo();
        return aux.getEstado();

    }

    @Override
    public boolean hasNext() {
        return atual != null;
    }
}
