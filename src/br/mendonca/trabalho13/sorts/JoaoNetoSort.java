package br.mendonca.trabalho13.sorts;

import br.mendonca.trabalho13.ISort;
import br.mendonca.trabalho13.ITAD;
import br.mendonca.trabalho13.ITrabalho13;

public class JoaoNetoSort implements ISort {

  @Override
  public String getAluno() {
    return "João de Barros e Silva Neto";
  }

  @Override
  public void selection(ITrabalho13 lista) {
    int menor;
    ITAD aux;
    
    for(int i = 0; i < lista.getQuantidade() - 1; i++) {
      menor = i;
      for(int j = i+1; j < lista.getQuantidade(); j++) {
        if(lista.getItem(j).getDouble() < lista.getItem(menor).getDouble()) {
          menor = j;
        }
      }
      if(i != menor) {
        aux = lista.getItem(i);
        lista.setItem(lista.getItem(menor), i);
        lista.setItem(aux, menor);;
      }
    }
  }

}
