package br.mendonca.trabalho14;

import br.mendonca.trabalho14.estruturas.JoaoNetoEstrutura;
import br.mendonca.trabalho14.sorts.JoaoNetoSort;
import br.mendonca.trabalho14.tads.JoaoNetoTAD;

public class Launch {

	public static void main(String[] args) {
	  JoaoNetoEstrutura lista = new JoaoNetoEstrutura(100);
      JoaoNetoSort sort = new JoaoNetoSort();
      
      for (int i = 0; i < 100; i++) {
        lista.inserirNoFim(new JoaoNetoTAD());
      }
      
      System.out.println(lista.print());
      
      System.out.println(lista.getQuantidade());
      
      sort.merger(lista, 0, lista.getQuantidade() - 1);

      System.out.println(lista.print());

	}

}
