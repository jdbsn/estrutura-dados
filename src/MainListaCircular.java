import br.mendonca.trabalho03.tads.JoaoNetoTAD;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

//        FilaDinamica fila = new FilaDinamica();
        JoaoNetoTAD jntad;
        PilhaDinamica pilha = new PilhaDinamica();

        for (int i = 0; i < 5; i++) {
          jntad = new JoaoNetoTAD();
          System.out.println(jntad.print());
          pilha.push(jntad);
        }

        System.out.println(pilha.print());
        
    }

}