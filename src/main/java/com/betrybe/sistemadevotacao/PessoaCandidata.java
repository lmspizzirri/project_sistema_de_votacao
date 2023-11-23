package com.betrybe.sistemadevotacao;

/**
 * The type Pessoa candidata.
 */
public class PessoaCandidata extends Pessoa {
  private int numero;
  private int votos;

  /**
   * Instantiates a new Pessoa candidata.
   *
   * @param numero the numero
   * @param nome   the nome
   */
  public PessoaCandidata(int numero, String nome) {
    this.numero = numero;
    this.nome = nome;
    this.votos = 0;
  }

  /**
   * Gets numero.
   *
   * @return the numero
   */
  public int getNumero() {
    return numero;
  }

  /**
   * Gets votos.
   *
   * @return the votos
   */
  public int getVotos() {
    return votos;
  }

  /**
   * Sets numero.
   *
   * @param numero the numero
   */
  public void setNumero(int numero) {
    this.numero = numero;
  }

  /**
   * Receber voto.
   */
  public void receberVoto() {
    this.votos += 1;
  }
}