package br.mendonca.trabalho09.estruturas;

import br.mendonca.trabalho09.ITAD;
import br.mendonca.trabalho09.ITrabalho09;
import br.mendonca.trabalho09.elementos.JoaoNetoElemento;

public class JoaoNetoEstrutura implements ITrabalho09 {

  private JoaoNetoElemento cursor;
  private int quantidade = 0;
  
  @Override
  public String getAluno() {
    return "João de Barros e Silva Neto";
  }

  @Override
  public int getQuantidade() {
    return quantidade;
  }

  @Override
  public Object getLista() {
    return cursor;
  }

  @Override
  public void inserirAntes(ITAD tad) {
    JoaoNetoElemento novo = new JoaoNetoElemento(tad);
    
    if(cursor == null) {
      cursor = novo;
      cursor.setNext(novo);
      cursor.setPrevious(novo);
    } else {
      JoaoNetoElemento anterior = (JoaoNetoElemento) cursor.getPrevious();
      
      novo.setNext(cursor);
      novo.setPrevious(anterior);
      anterior.setNext(novo);
      cursor.setPrevious(novo);
    }
    
    quantidade++;
  }

  @Override
  public void inserirDepois(ITAD tad) {
    JoaoNetoElemento novo = new JoaoNetoElemento(tad);
    
    if(cursor == null) {
      cursor = novo;
      cursor.setNext(novo);
      cursor.setPrevious(novo);
    } else {
      
      novo.setNext(cursor.getNext());
      novo.setPrevious(cursor);
      JoaoNetoElemento proximo = (JoaoNetoElemento) cursor.getNext();
      proximo.setPrevious(novo);
      cursor.setNext(novo);
    }
    
    quantidade++;
  }

  @Override
  public void deslocarCursor(int posicao) {
    while(posicao != 0) {
      if(posicao > 0) {
        cursor = (JoaoNetoElemento) cursor.getNext();
        posicao--;
      } else {
        cursor = (JoaoNetoElemento) cursor.getPrevious();
        posicao++;
      }
    }
  }

  @Override
  public ITAD removerAntes() {
    if(quantidade == 0) return null;
    
    JoaoNetoElemento atual = (JoaoNetoElemento) cursor.getPrevious();
    
    if(quantidade == 1) {
      cursor = null;
    } else {
      JoaoNetoElemento anterior = (JoaoNetoElemento) atual.getPrevious();
      JoaoNetoElemento proximo = (JoaoNetoElemento) atual.getNext();

      anterior.setNext(proximo);
      proximo.setPrevious(anterior);
    }
    
    quantidade--;
    
    return atual.getTad();
  }

  @Override
  public ITAD removerDepois() {
    if(quantidade == 0) return null;
    
    JoaoNetoElemento atual = (JoaoNetoElemento) cursor.getNext();

    if(quantidade == 1) {
      cursor = null;
    } else {
      JoaoNetoElemento anterior = (JoaoNetoElemento) atual.getPrevious();
      JoaoNetoElemento proximo = (JoaoNetoElemento) atual.getNext();

      anterior.setNext(proximo);
      proximo.setPrevious(anterior);
    }

    quantidade--;
    
    return atual.getTad();
  }

  @Override
  public ITAD getAtual() {
    return cursor.getTad();
  }

  @Override
  public ITAD get(int posicao) {
    JoaoNetoElemento atual = cursor;
    
    if(posicao < 0) {
      for(int i = posicao; i < 0; i++) {
        atual = (JoaoNetoElemento) atual.getPrevious();
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
    
    if(cursor != null) {
      JoaoNetoElemento inicio = cursor;
      int i = 1;
      do {
        texto.append("\n" + i + ". " + inicio.getTad().print());
        inicio = (JoaoNetoElemento) inicio.getNext();
        i++;
      } while (inicio != cursor);
    }
    
    return texto.toString();
  }

}
