package agregado;

import conjuntoplano.Estado;
import iterator.Iterador;
import iterator.IteradorListaDinamica;

public class AgregadoCanada implements Agregado {

    private IteradorListaDinamica estados;

    public AgregadoCanada() {
        estados = new IteradorListaDinamica();
        estados.add(new Estado("Ontario","Toronto"));
        estados.add(new Estado("Nova Scotia","Halifax"));
        estados.add(new Estado("Manitoba","Winnipeg"));
        estados.add(new Estado("Alberta","Edmonton"));
        estados.add(new Estado("Saskatchewan","Regina"));
    }

    @Override
    public Iterador criarIterador() {
        return new IteradorListaDinamica(estados);
    }
}

