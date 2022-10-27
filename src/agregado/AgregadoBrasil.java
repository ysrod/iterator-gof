package agregado;

import conjuntoplano.Estado;
import iterator.Iterador;
import iterator.IteradorLista;
import java.util.ArrayList;

public class AgregadoBrasil implements Agregado {
    private ArrayList<Estado> estados;

    public AgregadoBrasil() {
        estados = new ArrayList<>();
        estados.add(new Estado("Ceará", "Fortaleza"));
        estados.add(new Estado("Bahia", "Salvador"));
        estados.add(new Estado("Acre", "Rio Branco"));
        estados.add(new Estado("Sergipe", "Aracaju"));
        estados.add(new Estado("Minas Gerais", "Belo Horizonte"));

    }

    @Override
    public Iterador criarIterador() {
        return new IteradorLista(estados);
    }
}
