package br.mendonca.trabalho15;

import br.mendonca.trabalho15.estruturas.JoaoNetoEstrutura;
import br.mendonca.trabalho15.sorts.JoaoNetoSort;
import br.mendonca.trabalho15.tads.JoaoNetoTAD;

public class Launch {

	public static void main(String[] args) {
	    JoaoNetoEstrutura lista = new JoaoNetoEstrutura(100);
	      JoaoNetoSort sort = new JoaoNetoSort();
	      
	      for (int i = 0; i < 10; i++) {
	        lista.inserirNoFim(new JoaoNetoTAD());
	      }
	      
	      System.out.println(lista.print());
	      
	      System.out.println(lista.getQuantidade());
	      
	      sort.quick(lista, 0, lista.getQuantidade() - 1);
	      
	      System.out.println(lista.print());

	}

}
