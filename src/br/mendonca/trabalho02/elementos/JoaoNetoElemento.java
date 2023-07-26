package br.mendonca.trabalho02.elementos;

import br.mendonca.trabalho02.ITAD;

public class JoaoNetoElemento {

  private ITAD itad;
  private JoaoNetoElemento next;
  
  public JoaoNetoElemento(ITAD itad) {
    super();
    this.itad = itad;
  }

  public ITAD getItad() {
    return itad;
  }

  public void setItad(ITAD itad) {
    this.itad = itad;
  }

  public JoaoNetoElemento getNext() {
    return next;
  }

  public void setNext(JoaoNetoElemento next) {
    this.next = next;
  }
  
}
