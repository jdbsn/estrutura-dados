package br.mendonca.trabalho01.tads;

import java.util.Random;
import br.mendonca.trabalho01.ITAD;

public class JoaoNetoTAD implements ITAD {

  private String nome;
  private double espessuraFolha;
  private boolean epifita;
  
  public JoaoNetoTAD() {
    String[] nomes = {"Ansellia", "Calypso", "Eulophia", "Ophrys", "Phalaenopsis", "Satyrium"};
    Random random = new Random();
    this.nome = nomes[random.nextInt(5)] + " " + nomes[random.nextInt(5)] + " " + nomes[random.nextInt(5)];
    this.espessuraFolha = random.nextDouble(1);
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
    return espessuraFolha;
  }

  @Override
  public void setDouble(double value) {
    this.espessuraFolha = value;
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
    return "Nome: " + nome + "\n" + "Espessura da Folha: " + espessuraFolha + " cm\n" + "Epifita? " + (isBoolean() ? "Sim" : "Não");
  }

}
