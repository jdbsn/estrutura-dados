package br.mendonca.trabalho13;

import br.mendonca.trabalho13.estruturas.JoaoNetoEstrutura;
import br.mendonca.trabalho13.sorts.JoaoNetoSort;
import br.mendonca.trabalho13.tads.JoaoNetoTAD;

public class Launch {

	public static void main(String[] args) {
	  JoaoNetoEstrutura lista = new JoaoNetoEstrutura(100);
      JoaoNetoSort sort = new JoaoNetoSort();
      
      for (int i = 0; i < 25; i++) {
        lista.inserirNoFim(new JoaoNetoTAD());
      }
      
      System.out.println(lista.print());
      
      System.out.println(lista.getQuantidade());
      
      sort.selection(lista);
      
      System.out.println(lista.print());
	}

}
