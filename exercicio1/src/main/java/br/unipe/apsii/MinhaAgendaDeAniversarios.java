package br.unipe.apsii;

import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {

    private ArrayList<Aniversariante> aniversariantes;

    public MinhaAgendaDeAniversarios() {
        aniversariantes = new ArrayList<>();
    }

    @Override
    public void cadastrarAniversariante(Aniversariante aniversariante) {
        aniversariantes.add(aniversariante);
    }

    @Override
    public void removerAniversariante(Aniversariante aniversariante) {
        aniversariantes.remove(aniversariante);
    }

    @Override
    public Aniversariante buscarAniversariante(Aniversariante aniversariante) {

        int posicao = aniversariantes.indexOf(aniversariante);

        if (posicao != -1) {
            return aniversariantes.get(posicao);
        }

        return null;
    }

    @Override
    public int quantidadeAniversariantes() {
        return aniversariantes.size();
    }
}
