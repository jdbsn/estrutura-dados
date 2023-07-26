package br.mendonca.trabalho02.tads;

import java.util.Random;
import br.mendonca.trabalho02.ITAD;

public class JoaoNetoTAD implements ITAD {

  private String nome;
  private double comprimentoGalho;
  private boolean epifita;
  
  public JoaoNetoTAD() {
    
    String[] nomes = {"Ansellia", "Calypso", "Eulophia", "Ophrys", "Phalaenopsis", "Satyrium"};
    Random random = new Random();
    this.nome = nomes[random.nextInt(6)] + " " + nomes[random.nextInt(6)] + " " + nomes[random.nextInt(6)];
    this.comprimentoGalho =random.nextDouble(10);
    this.epifita = random.nextBoolean();
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
