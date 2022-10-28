package agregado;

import conjuntoplano.Estado;
import iterator.Iterador;
import iterator.IteradorVetor;

public class AgregadoEUA implements Agregado{
    private Estado[] estados;

    public AgregadoEUA() {
        estados = new Estado[5];
        estados[0] = new Estado("Florida", "Tallahase");
        estados[1] = new Estado("California", "Sacramento");
        estados[2] = new Estado("Hawaii", "Honolulu");
        estados[3] = new Estado("Texas", "Austin");
        estados[4] = new Estado("Pennsylvania", "Harrisburg");
    }

    @Override
    public Iterador criarIterador() {
        return new IteradorVetor(estados);
    }
}
