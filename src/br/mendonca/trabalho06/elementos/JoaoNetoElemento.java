package br.mendonca.trabalho06.elementos;

import br.mendonca.trabalho06.ITAD;
import br.mendonca.trabalho06.tads.JoaoNetoTAD;

public class JoaoNetoElemento {

  JoaoNetoElemento proximo;
  JoaoNetoTAD tad;
  
  public JoaoNetoElemento(ITAD itad) {
    super();
    this.tad = (JoaoNetoTAD) itad;
  }

  public ITAD getItad() {
    return (ITAD) tad;
  }

  public void setItad(ITAD itad) {
    this.tad = (JoaoNetoTAD) itad;
  }

  public JoaoNetoElemento getNext() {
    return proximo;
  }

  public void setNext(JoaoNetoElemento next) {
    this.proximo = next;
  }
  
}
