package br.mendonca.trabalho11.sorts;

import br.mendonca.trabalho11.ISort;
import br.mendonca.trabalho11.ITAD;
import br.mendonca.trabalho11.ITrabalho11;

public class JoaoNetoSort implements ISort {

  @Override
  public String getAluno() {
    return "Jo�o de Barros e Silva Neto";
  }

  @Override
  public void bubble(ITrabalho11 lista) {
    int fim = lista.getQuantidade();
    int continua = 0;
    ITAD aux;
    
    do {
      continua = 0;
      for (int i = 0; i < fim; i++) {
        if(lista.getItem(i).getDouble() < lista.getItem(i-1).getDouble()) {
          aux = lista.getItem(i);
          lista.setItem(lista.getItem(i-1), i);
          lista.setItem(aux, i-1);
          continua = i;
        }
      }
      fim--;
    } while (continua != 0);
  }

}
