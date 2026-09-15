package br.unipe.apsii;

public class Principal {

    public static void main(String[] args) {

        Aniversariante joao = new Aniversariante("Joao", 15, 9);

        Aniversariante maria =
                new Aniversariante("Maria", 20, 10);

        Aniversariante joao2 =
                new Aniversariante("Joao", 15, 9);

        System.out.println(joao.equals(joao2));

        MinhaAgendaDeAniversarios agenda =
                new MinhaAgendaDeAniversarios();

        agenda.cadastrarAniversariante(joao);
        agenda.cadastrarAniversariante(maria);

        System.out.println(agenda.quantidadeAniversariantes());

        System.out.println(
                agenda.buscarAniversariante(joao2)
        );
    }
}
