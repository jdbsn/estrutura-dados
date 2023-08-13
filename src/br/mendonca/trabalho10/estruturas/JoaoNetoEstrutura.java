package br.mendonca.trabalho10.estruturas;

import br.mendonca.trabalho10.ITAD;
import br.mendonca.trabalho10.ITrabalho10;
import br.mendonca.trabalho10.tads.JoaoNetoTAD;

public class JoaoNetoEstrutura implements ITrabalho10 {

  private JoaoNetoTAD[] lista;
  private int quantidade;
  private int maximo;

  public JoaoNetoEstrutura(int maximo) {
    this.lista = new JoaoNetoTAD[maximo];
    this.maximo = maximo;
    this.quantidade = 0;
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
    
    lista[0] = (JoaoNetoTAD) tad;
    quantidade++;
  }

  @Override
  public void inserirNoFim(ITAD tad) {
    if (quantidade + 1 > maximo) return;
    
    lista[quantidade] = (JoaoNetoTAD) tad;
    quantidade++;
  }

  @Override
  public void inserirNoMeio(ITAD tad, int posicao) {
    if (quantidade + 1 > maximo) return;
    if (posicao < 1 || posicao > quantidade - 1) return;

    for (int i = quantidade; i > posicao; i--) {
      lista[i] = lista[i-1];
    }
    
    lista[posicao] = (JoaoNetoTAD) tad;
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
    if (posicao < 1 || posicao > quantidade - 2) return;

    for (int i = posicao; i < quantidade - 1; i++) {
      lista[i] = lista[i+1];
    }
    
    lista[quantidade] = null;
    quantidade--;
  }

  @Override
  public ITAD getItem(int posicao) {
    if (posicao < 0 || posicao > quantidade) return null;
    
    return lista[posicao];
  }

  @Override
  public String print() {
    StringBuilder texto = new StringBuilder();
    
    for (int i = 0; i < quantidade; i++) {
      texto.append("\n[" + (i + 1) + "] " + lista[i].print());
    }
    
    return texto.toString();
  }

}
