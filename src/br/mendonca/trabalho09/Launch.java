package br.mendonca.trabalho09;

import br.mendonca.trabalho09.estruturas.JoaoNetoEstrutura;
import br.mendonca.trabalho09.tads.JoaoNetoTAD;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  JoaoNetoEstrutura listacde = new JoaoNetoEstrutura();
	  
	  JoaoNetoTAD tad;
	  
	  listacde.removerAntes();
	  listacde.removerDepois();
	  System.out.println(listacde.getQuantidade());
	  
	  for(int i = 0; i< 4; i++) {
	    tad = new JoaoNetoTAD();
	    System.out.println("Elemento inserido - " + tad.print());
	    listacde.inserirDepois(tad);
	  }
	  
	  System.out.println("ATUAL - " + listacde.getAtual().print());
	  
	  System.out.println(listacde.print());
	  
	  System.out.println("Elemento removido -" + listacde.removerAntes().print());
	  
	  System.out.println("Lista vazia? - " + listacde.print());
	  
	  System.out.println("Quantidade: " + listacde.getQuantidade());
	  
	  System.out.println("ELEMENTO - " + listacde.get(-1).print());
	  
	}

}
