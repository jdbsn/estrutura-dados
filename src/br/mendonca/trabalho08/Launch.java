package br.mendonca.trabalho08;

import br.mendonca.trabalho08.estruturas.JoaoNetoEstrutura;
import br.mendonca.trabalho08.tads.JoaoNetoTAD;

public class Launch {

  public static void main(String[] args) {
    JoaoNetoEstrutura listacircular = new JoaoNetoEstrutura();
    JoaoNetoTAD tad; 

//    JoaoNetoTAD removido = (JoaoNetoTAD) listacircular.removerNoInicio();
//    System.out.println("Elemento removido no inicio - " + removido);
//    System.out.println("Lista após remover elemento no inicio - " + listacircular.print());
//    System.out.println(listacircular.getQuantidade());
//    System.out.println("-------------------------------------------------------------------------------------------------------");
    
    for(int i = 0; i < 5; i++) {
      tad = new JoaoNetoTAD();
      System.out.println("Elemento adicionado - " + tad.print());
      listacircular.inserirNoFim(tad);
    }
   
    System.out.println("-------------------------------------------------------------------------------------------------------");
    System.out.println("Lista após adicionar 5 elementos - " + listacircular.print());
    System.out.println(listacircular.get(-5).print());
    
//    System.out.println("-------------------------------------------------------------------------------------------------------");
//    JoaoNetoTAD removido = (JoaoNetoTAD) listacircular.removerNoMeio(3);
//    System.out.println("Elemento removido na posição 2 - " + removido.print());
//    System.out.println("Lista após remover elemento na posição 2 - " + listacircular.print());
//       
//    System.out.println("-------------------------------------------------------------------------------------------------------");
//    JoaoNetoElemento primeiro;
//    
//    for(int i = 0; i < 4; i++) {
//      removido = (JoaoNetoTAD) listacircular.removerNoFim();
//      System.out.println("Elemento removido no fim - " + removido.print());
//      System.out.println("Lista após remover elemento no fim - " + listacircular.print());
//      
//      primeiro = (JoaoNetoElemento) listacircular.getLista();
//      System.out.println("PRIMEIRO - " + primeiro);
//      System.out.println("-------------------------------------------------------------------------------------------------------");
//    }
    
  }

}
