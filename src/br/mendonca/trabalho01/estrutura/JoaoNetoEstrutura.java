package br.mendonca.trabalho01.estrutura;

import br.mendonca.trabalho01.ITAD;
import br.mendonca.trabalho01.ITrabalho01;

public class JoaoNetoEstrutura implements ITrabalho01 {

  private ITAD[] lista;
  private int quantidade = 0;
  private int maximo;

  public JoaoNetoEstrutura(int maximo) {
    this.lista = new ITAD[maximo];
    this.maximo = maximo;
  }

  @Override
  public String getAluno() {
    return "João de Barros e Silva Neto";
  }

  @Override
  public int getQuantidade() {
    return this.quantidade;
  }

  @Override
  public void inserirNoInicio(ITAD tad) {
    if (quantidade + 1 > maximo) return;
    
    for(int i = quantidade; i > 0 ; i--) {
      lista[i] = lista[i - 1];
    }
    
    lista[0] = tad;
    quantidade++;
  }

  @Override
  public void inserirNoFim(ITAD tad) {
    if (quantidade + 1 > maximo) return;
    
    lista[quantidade] = tad;
    quantidade++;
  }

  @Override
  public void inserirNoMeio(ITAD tad, int posicao) {
    if (quantidade + 1 > maximo) return;
    if (posicao < 0 || posicao > quantidade) return;
    
    for (int i = quantidade; i >= quantidade - posicao; i--) {
      lista[i] = lista[i-1];
    }
    
    lista[posicao] = tad;
    quantidade++;
  }
  
  @Override
  public void excluirNoFim() {
    lista[quantidade] = null;
    quantidade--;
  }

  @Override
  public void excluirNoInicio() {
    for (int i = 0; i < quantidade - 1; i++) {
      lista[i] = lista[i + 1];
    }
    
    lista[quantidade] = null;
    quantidade--;
  }

  @Override
  public void excluirNoMeio(int posicao) {
    if (posicao < 0 || posicao > quantidade) return;

    for (int i = posicao; i < quantidade - 1; i++) {
      lista[i] = lista[i+1];
      
    }
    
    lista[quantidade] = null;
    quantidade--;
  }

  @Override
  public ITAD getItem(int posicao) {
    return lista[posicao];
  }

  @Override
  public String print() {
    String texto = "";
    
    for (int i = 0; i < quantidade; i++) {
      texto += i + 1 + ". \n";
      texto += lista[i].print() + "\n\n";
    }
    
    return texto;
  }

}
