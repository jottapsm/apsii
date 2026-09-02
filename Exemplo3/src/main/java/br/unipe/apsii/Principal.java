package br.unipe.apsii;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(java.util.Locale.US);

        Livro livro = new Livro();
        CD cd = new CD();

        System.out.println("Cadastro do Livro");

        System.out.print("Nome do livro: ");
        livro.setNome(entrada.nextLine());

        System.out.print("Preço do livro: ");
        livro.setPreco(entrada.nextDouble());
        entrada.nextLine();

        System.out.print("Autor do livro: ");
        livro.setAutor(entrada.nextLine());

        System.out.println();

        System.out.println("Cadastro do CD");

        System.out.print("Nome do CD: ");
        cd.setNome(entrada.nextLine());

        System.out.print("Preço do CD: ");
        cd.setPreco(entrada.nextDouble());

        System.out.print("Número de faixas: ");
        cd.setNumFaixas(entrada.nextInt());

        System.out.println();

        System.out.println("Informações do CD:");
        cd.exibeInformacoes();

        entrada.close();
    }
}
