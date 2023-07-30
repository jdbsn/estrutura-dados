package br.mendonca.trabalho04.estruturas;

import br.mendonca.trabalho04.ITAD;
import br.mendonca.trabalho04.ITrabalho04;
import br.mendonca.trabalho04.elementos.JoaoNetoElemento;

public class JoaoNetoEstrutura implements ITrabalho04 {

  private JoaoNetoElemento inicio;
  private JoaoNetoElemento fim;
  private int quantidade = 0;
  
  public String getAluno() {
    return "João de Barros e Silva Neto";
  }

  public int getQuantidade() {
    return quantidade;
  }
  
  @Override
  public Object getLista() {
    return inicio;
  }

  public void enqueue(ITAD tad) {
    JoaoNetoElemento novo = new JoaoNetoElemento(tad);
    
    if (inicio == null) {
      inicio = novo;
      fim = novo;
    } else {
      fim.setNext(novo);
      fim = novo;
    }

    quantidade++;
  }

  public ITAD dequeue() {
    if (quantidade == 0) return null;
    
    JoaoNetoElemento item = inicio;
    
    if (quantidade == 1) {
      inicio = null;
      fim = null;
    } else {
      inicio = item.getNext();
    }
    
    quantidade--;
    
    return item.getItad();
  }

  public ITAD get(int posicao) {
    if(posicao < 0 || posicao >= quantidade) return null;
    
    JoaoNetoElemento atual = inicio;
    
    for (int i = 0; i < posicao; i++) {
      atual = atual.getNext();
    }
    
    return (ITAD) atual.getItad();
  }

  public String print() {
    StringBuilder texto = new StringBuilder();
    
    JoaoNetoElemento atual = inicio;    
    
    for(int i = 1; i <= quantidade; i++) {
      texto.append("\n[" + i + "] " + atual.getItad().print());
      atual = atual.getNext();
    }

    return texto.toString();
  }
  
}
