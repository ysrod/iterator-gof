package iterator;

import conjuntoplano.Estado;

public class IteradorNo {
    private IteradorNo proximo;
    private IteradorNo anterior;
    private Estado estado;

    public IteradorNo(Estado estado) {
        this.proximo = null;
        this.anterior = null;
        this.estado = estado;
    }

    public IteradorNo getProximo() {
        return proximo;
    }

    public void setProximo(IteradorNo proximo) {
        this.proximo = proximo;
    }

    public IteradorNo getAnterior() {
        return anterior;
    }

    public void setAnterior(IteradorNo anterior) {
        this.anterior = anterior;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
