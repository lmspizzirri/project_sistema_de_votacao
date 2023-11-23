package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * Classe Principal.
 */
public class Principal {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();

  Scanner scanner = new Scanner(System.in);
  short opcao;

    System.out.println("Cadastrar pessoa candidata?");
    System.out.println("1 - Sim");
    System.out.println("2 - Não");
    System.out.println("Entre com o número correspondente à opção desejada:");

    opcao = Short.parseShort(scanner.next());

    if (opcao == 1) {
      System.out.println("Entre com o nome da pessoa candidata:");
      String nome = scanner.next();

      System.out.println("Entre com o número da pessoa candidata:");
      int numero = Integer.parseInt(scanner.next());

      gerenciamentoVotacao.cadastrarPessoaCandidata(nome, numero);
    }
    while (opcao == 1) {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");

      opcao = Short.parseShort(scanner.next());

      if (opcao == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nome = scanner.next();

        System.out.println("Entre com o número da pessoa candidata:");
        int numero = Integer.parseInt(scanner.next());

        gerenciamentoVotacao.cadastrarPessoaCandidata(nome, numero);
      }
    }

    do {
      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");

      opcao = Short.parseShort(scanner.next());

      if (opcao == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String nome = scanner.next();

        System.out.println("Entre com o CPF da pessoa eleitora:");
        String cpf = scanner.next();

        gerenciamentoVotacao.cadastrarPessoaEleitora(nome, cpf);
      }
    } while (opcao == 1);

    do {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");

      opcao = Short.parseShort(scanner.next());

      if (opcao == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scanner.next();

        System.out.println("Entre com o número da pessoa candidata:");
        int numero = Integer.parseInt(scanner.next());

        gerenciamentoVotacao.votar(cpf, numero);
      } else {
        gerenciamentoVotacao.mostrarResultado();
      }
    } while (opcao == 1 || opcao == 2);

    scanner.close();
  }
}