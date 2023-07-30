package br.mendonca.trabalho05.estruturas;

import br.mendonca.trabalho05.ITAD;
import br.mendonca.trabalho05.ITrabalho05;
import br.mendonca.trabalho05.tads.JoaoNetoTAD;

public class JoaoNetoEstrutura implements ITrabalho05 {

  private JoaoNetoTAD[] pilha;
  private int quantidade = 0;
  
  public JoaoNetoEstrutura(int tamanho) {
    this.pilha = new JoaoNetoTAD[tamanho];
  }
  
  @Override
  public Object getLista() {
    return pilha;
  }
  
  public String getAluno() {
    return "João de Barros e Silva Neto";
  }

  public int getQuantidade() {
    return quantidade;
  }
  
  public void push(ITAD tad) {
    if(quantidade == pilha.length) return;
    
    pilha[quantidade] = (JoaoNetoTAD) tad;
    quantidade++;
  }
  
  public ITAD pop() {
    if (quantidade == 0) return null;
    
    JoaoNetoTAD topo = pilha[quantidade-1];
    
    quantidade--;
    
    return topo; 
  }
  
  public ITAD get(int posicao) {
    if (posicao < 0 || posicao >= quantidade) return null;
    
    return pilha[posicao];
  }
  
  public String print() {
    StringBuilder texto = new StringBuilder();
    
    for (int i = 0; i < quantidade; i++) {
      texto.append("\n[" + (i + 1) + "] " + pilha[i].print());
    }
    
    return texto.toString();
  }
  
}
