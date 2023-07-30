package br.mendonca.trabalho04.elementos;

import br.mendonca.trabalho04.ITAD;
import br.mendonca.trabalho04.tads.JoaoNetoTAD;

public class JoaoNetoElemento {

  JoaoNetoTAD tad;
  JoaoNetoElemento proximo;
  
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
