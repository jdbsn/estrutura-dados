package br.mendonca.trabalho02;

import br.mendonca.trabalho01.tads.JoaoNetoTAD;
import br.mendonca.trabalho02.estruturas.JoaoNetoEstrutura;

public class Launch {

	public static void main(String[] args) {
		JoaoNetoEstrutura listaDinamica = new JoaoNetoEstrutura();
		JoaoNetoTAD jntad;
		
		for(int i = 0; i<2; i++) {
		  jntad = new JoaoNetoTAD();
		  System.out.println("Elemento adicionado - " + jntad.print());
		  listaDinamica.inserirNoFim(jntad);
		}
        
		System.out.println("---------------------------------------------------------------");
		System.out.println("Início - " + listaDinamica.getInicio().getItad().print());
		System.out.println(listaDinamica.print());
		System.out.println("Quantidade: " + listaDinamica.getQuantidade());
		
		listaDinamica.excluirNoMeio(1);
		
	       System.out.println("---------------------------------------------------------------");
//	       System.out.println("Início - " + listaDinamica.getInicio().getItad().print());
	         System.out.println(listaDinamica.print());
	         System.out.println("Quantidade: " + listaDinamica.getQuantidade());
	         
		listaDinamica.excluirNoMeio(0);

		
	     System.out.println("---------------------------------------------------------------");
//	     System.out.println("Início - " + listaDinamica.getInicio().getItad().print());
	     System.out.println(listaDinamica.print());
	     System.out.println("Quantidade: " + listaDinamica.getQuantidade());
		
//        
//		jntad = new JoaoNetoTAD();
//        System.out.println("Elemento adicionado - " + jntad.print());
//		listaDinamica.inserirNoMeio(jntad, 4);
//		
//		System.out.println("---------------------------------------------------------------");
//        System.out.println("Início - " + listaDinamica.getInicio().getItad().print());
//        System.out.println(listaDinamica.print());
//        System.out.println("Quantidade: " + listaDinamica.getQuantidade());
//        
//        System.out.println("---------------------------------------------------------------");
//        System.out.println("APAGANDO NO INICIO");
//        for(int i = 0; i<6;i++ ) {
//          listaDinamica.excluirNoMeio(2);
//          
//          System.out.println(listaDinamica.print());
//        }
//        
//        System.out.println(listaDinamica.getItem(0));
		
//		System.out.println("---------------------------------------------------------------");
//		System.out.println("Início - " + listaDinamica.getInicio().getItad().print());
//		
//		System.out.println("---------------------------------------------------------------");
//		listaDinamica.excluirNoInicio();
//		System.out.println(listaDinamica.print());
//		System.out.println("Início - " + listaDinamica.getInicio().getItad().print());
//		System.out.println("Quantidade: " + listaDinamica.getQuantidade());
//		
//		System.out.println("---------------------------------------------------------------");
//		System.out.println("Elemento na posição 3 - " + listaDinamica.getItem(2).print());
//		
//		System.out.println("---------------------------------------------------------------");
//		JoaoNetoTAD jntad5 = new JoaoNetoTAD();
//		listaDinamica.inserirNoFim(jntad5);
//		System.out.println("Elemento adicionado - " + jntad5.print());
//		System.out.println(listaDinamica.print());
//		System.out.println("Início - " + listaDinamica.getInicio().getItad().print());
//		System.out.println("Quantidade: " + listaDinamica.getQuantidade());
//		
//		System.out.println("---------------------------------------------------------------");
//		JoaoNetoTAD jntad6 = new JoaoNetoTAD();
//		listaDinamica.inserirNoMeio(jntad6, 3);
//        System.out.println("Elemento adicionado - " + jntad6.print());
//        System.out.println(listaDinamica.print());
//        System.out.println("Início - " + listaDinamica.getInicio().getItad().print());
//        System.out.println("Quantidade: " + listaDinamica.getQuantidade());
//        System.out.println("Elemento na posição 5 - " + listaDinamica.getItem(4).print());
//        
//        System.out.println("---------------------------------------------------------------");
//        listaDinamica.excluirNoFim();
//        System.out.println(listaDinamica.print());
//        System.out.println("Quantidade: " + listaDinamica.getQuantidade());
//        System.out.println(listaDinamica.getItem(3) == null ? "Elemento não existe" : "Elemento na posição 5 - " + listaDinamica.getItem(0).print());
//        
//        System.out.println("---------------------------------------------------------------");
//        listaDinamica.excluirNoMeio(2);
//        System.out.println(listaDinamica.print());
//        System.out.println("Início - " + listaDinamica.getInicio().getItad().print());
	}

}
