package iterator;

import conjuntoplano.Estado;

public class IteradorListaDinamica implements Iterador{

    private int contador;
    private IteradorNo primeiro;
    private IteradorNo ultimo;

    public int size(){
        return contador;
    }


    public void add(Estado estado) {
        IteradorNo novoNo = new IteradorNo(estado);
        if (primeiro == null) {
            primeiro = novoNo;
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

        return null;
    }

    @Override
    public boolean hasNext() {

        return false;
    }
}
