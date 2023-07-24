package br.mendonca.trabalho02;

import br.mendonca.trabalho01.tads.JoaoNetoTAD;
import br.mendonca.trabalho02.estruturas.JoaoNetoEstrutura;

public class Launch {

	public static void main(String[] args) {
		JoaoNetoEstrutura listaDinamica = new JoaoNetoEstrutura();

		JoaoNetoTAD jntad1 = new JoaoNetoTAD();
		JoaoNetoTAD jntad2 = new JoaoNetoTAD();
		JoaoNetoTAD jntad3 = new JoaoNetoTAD();
		JoaoNetoTAD jntad4 = new JoaoNetoTAD();
		
		System.out.println("Elemento adicionado - " + jntad1.print());
		System.out.println("Elemento adicionado - " + jntad2.print());
		System.out.println("Elemento adicionado - " + jntad3.print());
		System.out.println("Elemento adicionado - " + jntad4.print());
		
		listaDinamica.inserirNoInicio(jntad1);
		listaDinamica.inserirNoInicio(jntad2);
		listaDinamica.inserirNoInicio(jntad3);
		listaDinamica.inserirNoInicio(jntad4);
        
		System.out.println("---------------------------------------------------------------");
		System.out.println("Início - " + listaDinamica.getInicio().getItad().print());
		System.out.println(listaDinamica.print());
		System.out.println("Quantidade: " + listaDinamica.getQuantidade());
        
		System.out.println("---------------------------------------------------------------");
		System.out.println("Início - " + listaDinamica.getInicio().getItad().print());
		
		System.out.println("---------------------------------------------------------------");
		listaDinamica.excluirNoInicio();
		System.out.println(listaDinamica.print());
		System.out.println("Início - " + listaDinamica.getInicio().getItad().print());
		System.out.println("Quantidade: " + listaDinamica.getQuantidade());
		
		System.out.println("---------------------------------------------------------------");
		System.out.println("Elemento na posição 3 - " + listaDinamica.getItem(2).print());
		
		System.out.println("---------------------------------------------------------------");
		JoaoNetoTAD jntad5 = new JoaoNetoTAD();
		listaDinamica.inserirNoFim(jntad5);
		System.out.println("Elemento adicionado - " + jntad5.print());
		System.out.println(listaDinamica.print());
		System.out.println("Início - " + listaDinamica.getInicio().getItad().print());
		System.out.println("Quantidade: " + listaDinamica.getQuantidade());
		
		
		System.out.println("---------------------------------------------------------------");
		JoaoNetoTAD jntad6 = new JoaoNetoTAD();
		listaDinamica.inserirNoMeio(jntad6, 3);
        System.out.println("Elemento adicionado - " + jntad6.print());
        System.out.println(listaDinamica.print());
        System.out.println("Início - " + listaDinamica.getInicio().getItad().print());
        System.out.println("Quantidade: " + listaDinamica.getQuantidade());
        System.out.println("Elemento na posição 5 - " + listaDinamica.getItem(4).print());
        
        System.out.println("---------------------------------------------------------------");
        listaDinamica.excluirNoFim();
        System.out.println(listaDinamica.print());
        System.out.println("Quantidade: " + listaDinamica.getQuantidade());
        System.out.println(listaDinamica.getItem(3) == null ? "Elemento não existe" : "Elemento na posição 5 - " + listaDinamica.getItem(0).print());
        
        System.out.println("---------------------------------------------------------------");
        listaDinamica.excluirNoMeio(2);
        System.out.println(listaDinamica.print());
        System.out.println("Início - " + listaDinamica.getInicio().getItad().print());
	}

}
