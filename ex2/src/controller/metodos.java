package controller;
import model.*;
public class metodos {

	public metodos() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void exercicio2(PilhaString pilha) throws Exception {

      

        String w = pilha.pop(); // remove W (topo)

        pilha.pop(); // L
        pilha.pop(); // H
        pilha.pop(); // B

        String r = pilha.pop(); // remove R

        // imprime na ordem correta
        System.out.print(r + " " + w);

        // remove restante da pilha antiga
        pilha.pop(); // G
        pilha.pop(); // J

        // ===============================
        // 🔄 NOVA PILHA (CORRETA)
        // base → topo: L B M G K
        // ===============================
        pilha.push("L");
        pilha.push("B");
        pilha.push("M");
        pilha.push("G");
        pilha.push("K");

       
        System.out.println("\n\nPilha final (topo → base):");

        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }
    }
	
}
