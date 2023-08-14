package br.mendonca.trabalho11.tads;

import java.util.Random;
import br.mendonca.trabalho11.ITAD;

public class JoaoNetoTAD implements ITAD {

  private String nome;
  private double comprimentoGalho;
  private boolean epifita;
  
  public JoaoNetoTAD() {
    Random random = new Random();
    
    String[] nomes = {"Ansellia", "Calypso", "Eulophia", "Ophrys", "Phalaenopsis", "Satyrium"};

    this.nome = nomes[random.nextInt(6)] + " " + nomes[random.nextInt(6)] + " " + nomes[random.nextInt(6)];
    this.comprimentoGalho = random.nextDouble(10);
    this.epifita = random.nextBoolean();
  }
  
  public JoaoNetoTAD(String nome, double comprimentoGalho, boolean epifita) {
    super();
    this.nome = nome;
    this.comprimentoGalho = comprimentoGalho;
    this.epifita = epifita;
  }

  @Override
  public String getString() {
    return nome;
  }

  @Override
  public void setString(String name) {
    this.nome = name;
  }

  @Override
  public double getDouble() {
    return comprimentoGalho;
  }

  @Override
  public void setDouble(double value) {
    this.comprimentoGalho = value;
  }

  @Override
  public boolean isBoolean() {
    return epifita;
  }

  @Override
  public void setBoolean(boolean bit) {
    this.epifita = bit;
  }

  @Override
  public String print() {
    return "Nome: " + nome + " | " + "Comprimento Galho: " + comprimentoGalho 
        + " cm | " + "Epifita? " + (isBoolean() ? "Sim" : "Não");
  }

}
