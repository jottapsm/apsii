package br.unipe.apsii;

public interface AgendaDeAniversarios {

    void cadastrarAniversariante(Aniversariante aniversariante);

    void removerAniversariante(Aniversariante aniversariante);

    Aniversariante buscarAniversariante(Aniversariante aniversariante);

    int quantidadeAniversariantes();
}