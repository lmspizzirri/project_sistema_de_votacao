package com.betrybe.sistemadevotacao;

/**
 * Classe PessoaCandidata.
 */

public class PessoaCandidata extends Pessoa {
  private int numero;
  private int votos;
  /**
   * Instantiates a new Pessoa candidata.
   *
   * @param nome   the nome
   * @param numero the numero
   */
  public PessoaCandidata(int numero, String nome) {
    this.numero = numero;
    this.nome = nome;
    this.votos = 0;
  }

  public int getNumero() {
    return numero;
  }

  public int getVotos() {
    return votos;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public void receberVoto() {
    this.votos += 1;
  }
}