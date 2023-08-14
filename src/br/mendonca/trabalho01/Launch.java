package br.mendonca.trabalho01;

import br.mendonca.trabalho01.estruturas.JoaoNetoEstrutura;
import br.mendonca.trabalho01.tads.JoaoNetoTAD;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  JoaoNetoTAD jntad;
	  JoaoNetoEstrutura estrutura = new JoaoNetoEstrutura(10);
	  
	  for(int i = 0; i < 5; i++) {
	    jntad = new JoaoNetoTAD();
	    System.out.println(jntad.print());
	    estrutura.inserirNoFim(jntad);
	  }
	  
	  System.out.println(estrutura.print());
	  
	  for(int i = 0; i < 4; i++) {
	    estrutura.excluirNoInicio();
      }

	  System.out.println("dd" + estrutura.print());
	  
	  estrutura.excluirNoFim();
	  estrutura.excluirNoFim();
	  estrutura.excluirNoFim();
	  estrutura.excluirNoFim();
	  
	  System.out.println(estrutura.getQuantidade());
	  
//	  JoaoNetoTAD x = new JoaoNetoTAD();
//	  System.out.println(x.print());
//	  estrutura.inserirNoMeio(x, 1);
//	  
//	  System.out.println("--------------------------------------------------");
//	  System.out.println(estrutura.print());
//	  
//	  estrutura.excluirNoMeio(2);
//	  System.out.println("--------------------------------------------------");
//      System.out.println(estrutura.print());
//      System.out.println(estrutura.getQuantidade());
//	  
//      System.out.println(estrutura.getItem(1).print());
//      
//	  estrutura.inserirNoInicio(new JoaoNetoTAD());
//	  
//	  System.out.println(estrutura.print());
//	  
//	  System.out.println("--------------------------------------------------");
//	  
//	  estrutura.excluirNoInicio();
//	  estrutura.excluirNoFim();
//	  
//	  System.out.println(estrutura.print());
//	  
//	  System.out.println("Quantidade: " + estrutura.getQuantidade());	  
	  
//	  int quantidade = 4;
//	  int lista[] = new int[5];
//	  lista[0] = 2;
//	  lista[1] = 3;
//	  lista[2] = 4;
//	  lista[3] = 5;
//	  // [2,3,4,5, ]
//	  for(int i = quantidade; i > 0 ; i--) {
//	      lista[i] = lista[i - 1];
//	  }
//	  lista[0] = 1;
//	  
//	  for (int i = 0; i < lista.length; i++) {
//	    System.out.println(lista[i]);
//        
//      }

	  
	}

}
