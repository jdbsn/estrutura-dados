package br.mendonca.trabalho12;

import br.mendonca.trabalho12.estruturas.JoaoNetoEstrutura;
import br.mendonca.trabalho12.sorts.JoaoNetoSort;
import br.mendonca.trabalho12.tads.JoaoNetoTAD;

public class Launch {

	public static void main(String[] args) {
	      JoaoNetoEstrutura lista = new JoaoNetoEstrutura(100);
	      JoaoNetoSort sort = new JoaoNetoSort();
	      
	      for (int i = 0; i < 20; i++) {
	        lista.inserirNoFim(new JoaoNetoTAD());
	      }
	      
	      System.out.println(lista.print());
	      
	      System.out.println(lista.getQuantidade());
	      
	      sort.insert(lista);
	      
	      System.out.println(lista.print());

	}

}
