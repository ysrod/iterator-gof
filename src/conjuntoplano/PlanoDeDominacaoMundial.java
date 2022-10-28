package conjuntoplano;

import agregado.AgregadoCanada;
import agregado.AgregadoEUA;
import iterator.Iterador;
import agregado.AgregadoBrasil;

import java.util.ArrayList;

public class PlanoDeDominacaoMundial {
    public static void main(String[] args) {
        ArrayList<Iterador> pacotes = new ArrayList<>();
        pacotes.add(new AgregadoBrasil().criarIterador());
        pacotes.add(new AgregadoEUA().criarIterador());
        pacotes.add(new AgregadoCanada().criarIterador());

        for (Iterador iterador: pacotes) {
            while(iterador.hasNext()) {
                Estado estadoAtual = iterador.next();
                System.out.println(estadoAtual.getNome() + ". " + estadoAtual.getCapital());
            }
            System.out.println();
        }
    }
}
