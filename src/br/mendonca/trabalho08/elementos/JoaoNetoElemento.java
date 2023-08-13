package br.mendonca.trabalho08.elementos;

import br.mendonca.trabalho08.IElemento;
import br.mendonca.trabalho08.ITAD;
import br.mendonca.trabalho08.tads.JoaoNetoTAD;

public class JoaoNetoElemento implements IElemento {

  JoaoNetoElemento proximo;
  JoaoNetoTAD tad;
  
  public JoaoNetoElemento(ITAD tad) {
    this.tad = (JoaoNetoTAD) tad;
  }
  
  @Override
  public ITAD getTad() {
    return tad;
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

}
