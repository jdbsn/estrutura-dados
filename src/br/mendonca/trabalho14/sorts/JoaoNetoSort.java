package br.mendonca.trabalho14.sorts;

import br.mendonca.trabalho14.ISort;
import br.mendonca.trabalho14.ITrabalho14;
import br.mendonca.trabalho14.estruturas.JoaoNetoEstrutura;

public class JoaoNetoSort implements ISort {
  
  @Override
  public String getAluno() {
    return "João de Barros e Silva Neto";
  }

  @Override
  public void merger(ITrabalho14 lista, int inicio, int fim) {
    if(inicio < fim) {
      int meio = (inicio + fim) / 2;
      merger(lista, inicio, meio);
      merger(lista, meio + 1, fim);
      merge(lista, inicio, meio, fim);
    }

  }
  
  private void merge(ITrabalho14 lista, int inicio, int meio, int fim) {
    boolean fim1 = false;
    boolean fim2 = false;
    
    int p1 = inicio;
    int p2 = meio + 1;
    int tamanho = fim - inicio + 1;

    JoaoNetoEstrutura aux = new JoaoNetoEstrutura(tamanho);

    for (int i = 0; i < tamanho; i++) { 
      if(!fim1 && !fim2) {
        if(lista.getItem(p1).getDouble() < lista.getItem(p2).getDouble()) {
          aux.inserirNoMeio(lista.getItem(p1++), i);
        } else {
          aux.inserirNoMeio(lista.getItem(p2++), i);
        }
        if(p1 > meio) fim1 = true;
        if(p2 > fim) fim2 = true;
      } else {
        if(!fim1) {
          aux.inserirNoMeio(lista.getItem(p1++), i);
        } else {
          aux.inserirNoMeio(lista.getItem(p2++), i);
        }
      }
    }
    
    for (int i = 0, j = inicio; i < tamanho; i++, j++) {
      lista.setItem(aux.getItem(i), j);
    }
       
  }

}
