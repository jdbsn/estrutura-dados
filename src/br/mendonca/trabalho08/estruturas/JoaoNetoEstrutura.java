package br.mendonca.trabalho08.estruturas;

import br.mendonca.trabalho08.ITAD;
import br.mendonca.trabalho08.ITrabalho08;
import br.mendonca.trabalho08.elementos.JoaoNetoElemento;

public class JoaoNetoEstrutura implements ITrabalho08 {

  JoaoNetoElemento inicio;
  int quantidade = 0;
  
  @Override
  public String getAluno() {
    return "João de Barros e Silva Neto";
  }

  @Override
  public Object getLista() {
    return inicio;
  }

  @Override
  public int getQuantidade() {
    return quantidade;
  }

  @Override
  public void inserirNoIncio(ITAD tad) {
    JoaoNetoElemento novo = new JoaoNetoElemento(tad);
    
    if(inicio == null) {
      inicio = novo;
      novo.setNext(novo);
    } else {
      JoaoNetoElemento atual = inicio;
      
      while(atual.getNext() != inicio) {
        atual = (JoaoNetoElemento) atual.getNext();
      }
      
      atual.setNext(novo);
      novo.setNext(inicio);
      inicio = novo;
    }
    
    quantidade++;
  }

  @Override
  public void inserirNoFim(ITAD tad) {
    JoaoNetoElemento novo = new JoaoNetoElemento(tad);
    
    if(inicio == null) {
      inicio = novo;
      novo.setNext(novo);
    } else {
      JoaoNetoElemento atual = inicio;
      
      while(atual.getNext() != inicio) {
        atual = (JoaoNetoElemento) atual.getNext();
      }
      
      atual.setNext(novo);
      novo.setNext(inicio);
    }
    
    quantidade++;
  }

  @Override
  public void inserirNoMeio(ITAD tad, int posicao) {
    if(posicao <= 0) {
      this.inserirNoIncio(tad);
      return;
    }
    if(posicao >= quantidade) {
      this.inserirNoFim(tad);
      return;
    }
    
    JoaoNetoElemento novo = new JoaoNetoElemento(tad);
    
    JoaoNetoElemento atual = inicio;
    JoaoNetoElemento anterior = atual;
    
    for(int i = 0; i < posicao; i++) {
      anterior = atual;
      atual = (JoaoNetoElemento) atual.getNext();
    }
    
    novo.setNext(atual);
    anterior.setNext(novo);
    
    quantidade++;
  }

  @Override
  public ITAD removerNoInicio() {
    if(quantidade == 0) return null;
    
    JoaoNetoElemento removido = inicio;
    JoaoNetoElemento atual = inicio;
    
    for(int i = 0; i < quantidade - 1; i++) {
      atual = (JoaoNetoElemento) atual.getNext();
    }
    
    if(quantidade == 1) {
      inicio = null;
    } else {
      atual.setNext(inicio.getNext());
      inicio = (JoaoNetoElemento) inicio.getNext();
    }

    
    quantidade--;
    
    return removido.getTad();
  }

  @Override
  public ITAD removerNoFim() {
    if(quantidade == 0) return null;
        
    JoaoNetoElemento atual = inicio;
    
    for(int i = 0; i < quantidade - 2; i++) {
      atual = (JoaoNetoElemento) atual.getNext();
    }
    
    JoaoNetoElemento removido = (JoaoNetoElemento) atual.getNext();
    
    if(quantidade == 1) {
      inicio = null;
    } else {
      atual.setNext(inicio);
    }
 
    quantidade--;
    
    return removido.getTad();
  }

  @Override
  public ITAD removerNoMeio(int posicao) {
    if(posicao < 1 || posicao >= quantidade - 1) return null;
    
    JoaoNetoElemento atual = inicio;
    
    for(int i = 0; i < posicao - 1; i++) {
      atual = (JoaoNetoElemento) atual.getNext();
    }
    
    JoaoNetoElemento removido = (JoaoNetoElemento) atual.getNext();
    atual.setNext(removido.getNext());
    
    quantidade--;
    
    return removido.getTad();
  }

  @Override
  public ITAD get(int posicao) {
    
    JoaoNetoElemento atual = inicio;

    if(posicao < 0) {
      for(int i = posicao; i <= quantidade; i++) {
        atual = (JoaoNetoElemento) atual.getNext();
      }
    } else {
      for(int i = 0; i < posicao; i++) {
        atual = (JoaoNetoElemento) atual.getNext();
      }
    }

    return atual.getTad();
  }

  @Override
  public String print() {
    StringBuilder texto = new StringBuilder();
    
    JoaoNetoElemento atual = inicio;
    
    for(int i = 1; i <= quantidade; i++) {
      texto.append("\n" + i + ". " + atual.getTad().print());
      atual = (JoaoNetoElemento) atual.getNext();
    }
    
    return texto.toString();
  }

}
