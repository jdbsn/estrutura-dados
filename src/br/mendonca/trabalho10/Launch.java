package br.mendonca.trabalho10;

import br.mendonca.trabalho10.buscas.JoaoNetoBusca;
import br.mendonca.trabalho10.estruturas.JoaoNetoEstrutura;
import br.mendonca.trabalho10.tads.JoaoNetoTAD;

public class Launch {

	public static void main(String[] args) {
		JoaoNetoTAD tad;
		JoaoNetoEstrutura lista = new JoaoNetoEstrutura(100);
		JoaoNetoBusca busca = new JoaoNetoBusca();
		
		for (int i = 0; i < 90; i++) {
          lista.inserirNoFim(new JoaoNetoTAD());
        }
		
		System.out.println(lista.print());
		
		tad = new JoaoNetoTAD();
		System.out.println("TAD adicionado - " + tad.print());
		lista.inserirNoMeio(tad, 65);
		
		System.out.println(lista.print());
		
		JoaoNetoTAD encontrado = (JoaoNetoTAD) busca.linear(lista, tad);

		System.out.println("TAD encontrado - " + encontrado.print());
		
	}

}
