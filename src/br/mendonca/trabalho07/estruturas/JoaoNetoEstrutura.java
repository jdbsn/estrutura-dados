package br.mendonca.trabalho07.estruturas;

import br.mendonca.trabalho07.ITAD;
import br.mendonca.trabalho07.ITrabalho07;
import br.mendonca.trabalho07.elementos.JoaoNetoElemento;

public class JoaoNetoEstrutura implements ITrabalho07 {

  private JoaoNetoElemento inicio;
  private JoaoNetoElemento fim;
  int quantidade = 0;
  
  @Override
  public String getAluno() {
    return "João de Barros e Silva Neto";
  }

  @Override
  public Object getLista() {
    return this.inicio;
  }

  @Override
  public int getQuantidade() {
    return this.quantidade;
  }

  @Override
  public void inserirNoIncio(ITAD tad) {
    JoaoNetoElemento novo = new JoaoNetoElemento(tad);
    
    if(inicio == null) {
      inicio = novo;
      fim = novo;
    } else {
      novo.setNext(inicio);
      inicio.setPrevious(novo);
      inicio = novo;
    }
    
    quantidade++;
  }

  @Override
  public void inserirNoFim(ITAD tad) {
    JoaoNetoElemento novo = new JoaoNetoElemento(tad);
    
    if(inicio == null) {
      inicio = novo;
      fim = novo;
    } else {
      novo.setPrevious(fim);
      fim.setNext(novo);
      fim = novo;
    }
    
    quantidade++;
  }

  @Override
  public void inserirNoMeio(ITAD tad, int posicao) {
    if(posicao < 1 || posicao >= quantidade - 1) return;
    
    JoaoNetoElemento novo = new JoaoNetoElemento(tad);
    JoaoNetoElemento aux = inicio;
    
    for(int i = 0; i < posicao; i++) {
      aux = (JoaoNetoElemento) aux.getNext();
    }
    
    JoaoNetoElemento anterior = (JoaoNetoElemento) aux.getPrevious();
    
    novo.setNext(aux);
    novo.setPrevious(anterior);
    anterior.setNext(novo);
    aux.setPrevious(novo);
    
    quantidade++;
  }

  @Override
  public ITAD removerNoInicio() {
    if(quantidade == 0) return null;
    
    JoaoNetoElemento aux = inicio;
    
    inicio = (JoaoNetoElemento) inicio.getNext();
    
    if(inicio != null) {
      inicio.setPrevious(null);
    } else {
      fim = null;
    }
    
    quantidade--;
    
    return aux.getTad();
  }

  @Override
  public ITAD removerNoFim() {
    if(quantidade == 0) return null;
    
    JoaoNetoElemento aux = fim;
    
    fim = (JoaoNetoElemento) fim.getPrevious();
    
    if(fim != null) {
      fim.setNext(null);
    } else {
      inicio = null;
    }
    
    quantidade--;
    
    return aux.getTad();
  }

  @Override
  public ITAD removerNoMeio(int posicao) {
    if(posicao < 1 || posicao >= quantidade - 1) return null;
    
    JoaoNetoElemento aux = inicio;
    
    for(int i = 0; i < posicao; i++) {
      aux = (JoaoNetoElemento) aux.getNext();
    }
    
    aux.getNext().setPrevious(aux.getPrevious());
    aux.getPrevious().setNext(aux.getNext());
    
    quantidade--;
    
    return aux.getTad();
  }

  @Override
  public ITAD get(int posicao) {
    if(posicao < 0 || posicao + 1 > quantidade) return null; // TODO checar
    
    JoaoNetoElemento aux = null;
    
    int doInicio = posicao;
    int doFim = quantidade - posicao;
    
    if(doInicio < doFim) {
      aux = inicio;
      
      for (int i = 0; i < posicao; i++) {
        aux = (JoaoNetoElemento) aux.getNext();
      }
    } else {
      aux = fim;
      
      for (int i = quantidade - 1; i > posicao; i--) { 
        aux = (JoaoNetoElemento) aux.getPrevious();
      }
    }
    
    return aux.getTad();
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
