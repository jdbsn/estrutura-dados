package br.mendonca.trabalho12.sorts;

import br.mendonca.trabalho12.ISort;
import br.mendonca.trabalho12.ITrabalho12;
import br.mendonca.trabalho12.tads.JoaoNetoTAD;

public class JoaoNetoSort implements ISort {

  @Override
  public String getAluno() {
    return "João de Barros e Silva Neto";
  }

  @Override
  public void insert(ITrabalho12 lista) {
    for (int i = 0; i < lista.getQuantidade(); i++) {
      for (int j = i; j > 0; j--) {
        if(lista.getItem(j).getDouble() < lista.getItem(j-1).getDouble()) {
          JoaoNetoTAD aux = (JoaoNetoTAD) lista.getItem(j-1);
          lista.setItem(lista.getItem(j), j-1);
          lista.setItem(aux, j);
        }
      }
    }
  }

}
