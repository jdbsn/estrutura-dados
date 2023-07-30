package br.mendonca.trabalho06.estruturas;

import br.mendonca.trabalho06.ITAD;
import br.mendonca.trabalho06.ITrabalho06;
import br.mendonca.trabalho06.elementos.JoaoNetoElemento;

public class JoaoNetoEstrutura implements ITrabalho06 {

  private JoaoNetoElemento topo;
  private int quantidade = 0;
  
  public String getAluno() {
    return "João de Barros e Silva Neto";
  }

  public int getQuantidade() {
    return quantidade;
  }
  
  @Override
  public Object getLista() {
    return topo;
  }
  
  public void push(ITAD tad) {
    JoaoNetoElemento elemento = new JoaoNetoElemento(tad);
    
    elemento.setNext(topo);
    topo = elemento;

    quantidade++;
  }
  
  public ITAD pop() {
    if(topo == null) return null;
    
    JoaoNetoElemento atual = topo;
    
    topo = topo.getNext();
    quantidade--;
    
    return atual.getItad();
  }

  @Override
  public ITAD get(int posicao) {
    if (posicao < 0 || posicao >= quantidade) return null;
        
    JoaoNetoElemento atual = topo;
        
    for(int i = 0; i < posicao; i++) {
      atual = atual.getNext();
    }
        
    return atual.getItad();
  }
  
  
  public String print() {
    StringBuilder texto = new StringBuilder();
    
    JoaoNetoElemento atual = topo;
    
    for(int i = 1; i <= quantidade; i++) {
      texto.append("\n" + i + ". " + atual.getItad().print());
      atual = atual.getNext();
    }
    
    return texto.toString();
  }

}
