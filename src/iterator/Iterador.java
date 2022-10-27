package iterator;

import conjuntoplano.Estado;

public interface Iterador {
    Estado next();
    boolean hasNext();
}
