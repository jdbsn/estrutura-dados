package br.mendonca.trabalho07.elementos;

import br.mendonca.trabalho07.IElemento;
import br.mendonca.trabalho07.ITAD;
import br.mendonca.trabalho07.tads.JoaoNetoTAD;

public class JoaoNetoElemento implements IElemento {

  JoaoNetoElemento proximo;
  JoaoNetoElemento anterior;
  JoaoNetoTAD tad;
  
  public JoaoNetoElemento(ITAD tad) {
    this.tad = (JoaoNetoTAD) tad;
  }
  
  @Override
  public ITAD getTad() {
    return this.tad;
  }

  @Override
  public void setTad(ITAD tad) {
    this.tad = (JoaoNetoTAD) tad;

  }

  @Override
  public IElemento getNext() {
    return proximo;
  }

  @Override
  public void setNext(IElemento next) {
    this.proximo = (JoaoNetoElemento) next;
  }

  @Override
  public IElemento getPrevious() {
    return anterior;
  }

  @Override
  public void setPrevious(IElemento previous) {
    this.anterior = (JoaoNetoElemento) previous;
  }

}
