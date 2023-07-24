package br.mendonca.trabalho02.estruturas;

import br.mendonca.trabalho01.ITAD;
import br.mendonca.trabalho01.ITrabalho01;
import br.mendonca.trabalho02.elementos.JoaoNetoElemento;

public class JoaoNetoEstrutura implements ITrabalho01 {
  
  private JoaoNetoElemento inicio;
  private int quantidade;
  
  public JoaoNetoElemento getInicio() {
    return this.inicio;
  }
  
  @Override
  public String getAluno() {
    return "João de Barros e Silva Neto";
  }

  @Override
  public int getQuantidade() {
    return this.quantidade;
  }

  @Override
  public void inserirNoInicio(ITAD tad) {
    JoaoNetoElemento elemento = new JoaoNetoElemento(tad);
    
    elemento.setNext(inicio);
    inicio = elemento;
    quantidade++;
  }

  @Override
  public void inserirNoFim(ITAD tad) {
    JoaoNetoElemento elemento = new JoaoNetoElemento(tad);
    
    if(inicio == null) {
      inicio = elemento;
    } else {
      JoaoNetoElemento atual = inicio;
      while(atual.getNext() != null) {
        atual = atual.getNext();
      }
        atual.setNext(elemento);
    }
    
    quantidade++;
  }

  @Override
  public void inserirNoMeio(ITAD tad, int posicao) {
    if (posicao < 0 || posicao > quantidade) return;
    
    JoaoNetoElemento elemento = new JoaoNetoElemento(tad);
    JoaoNetoElemento atual = inicio;
    
    for(int i = 1; i < posicao; i++) {
      atual = atual.getNext();
    }

    JoaoNetoElemento anterior = atual.getNext();
    
    atual.setNext(elemento);
    elemento.setNext(anterior);
    quantidade++;
  }

  @Override
  public void excluirNoFim() {
    JoaoNetoElemento anterior = inicio;
    JoaoNetoElemento atual = inicio;
    
    while(atual.getNext() != null) {
      anterior = atual;
      atual = atual.getNext();
    }
    
    anterior.setNext(null);

    quantidade--;
  }

  @Override
  public void excluirNoInicio() {
    JoaoNetoElemento novoInicio = inicio.getNext();
    
    inicio.setNext(null);
    inicio = novoInicio;
    quantidade--;
  }

  @Override
  public void excluirNoMeio(int posicao) {
    if (posicao < 0 || posicao > quantidade - 1) return;
    
    JoaoNetoElemento atual = inicio;
    JoaoNetoElemento anterior = inicio;
    
    for(int i = 0; i < posicao; i++) {
      anterior = atual;
      atual = atual.getNext();
    }

    anterior.setNext(atual.getNext());

    quantidade--;
  }

  @Override
  public ITAD getItem(int posicao) {
    if (posicao < 0 || posicao > quantidade - 1) return null;
    
    JoaoNetoElemento atual = inicio;
    
    for(int i = 0; i < posicao; i++) {
      atual = atual.getNext();
    }
    
    return atual.getItad();
  }

  @Override
  public String print() {
    StringBuilder texto = new StringBuilder();
    
    JoaoNetoElemento atual = inicio;    
    
    for(int i = 1; i <= quantidade; i++) {
      texto.append("\n" + i + ". " + atual.getItad().print());
      atual = atual.getNext();
    }

    return texto.toString();
  }

}
