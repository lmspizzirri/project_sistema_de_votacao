package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * Classe GerenciamentoVotacao.
 */
public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {

  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();
  private ArrayList<String> cpfsComputados = new ArrayList<String>();

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata pessoaCandidata : pessoasCandidatas) {
      if (numero == pessoaCandidata.getNumero()) {
        System.out.println("Número da pessoa candidata já utilizado!");
      }
      PessoaCandidata novaPessoaCandidata = new PessoaCandidata(nome, numero);
      pessoasCandidatas.add(novaPessoaCandidata);
    }
  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora pessoaEleitora : pessoasEleitoras) {
      if (cpf.equals(pessoaEleitora.getCpf())) {
        System.out.println("Pessoa eleitora já cadastrada!");
      }
      PessoaEleitora novaPessoaEleitora = new PessoaEleitora(nome, cpf);
      pessoasEleitoras.add(novaPessoaEleitora);
    }
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {

  }

  @Override
  public void mostrarResultado() {

  }
}