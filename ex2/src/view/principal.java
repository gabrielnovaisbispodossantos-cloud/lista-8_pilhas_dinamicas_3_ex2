package view;
import model.*;
import controller.metodos;
public class principal {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {

	            PilhaString pilha = new PilhaString();

	            // ===============================
	            // 🔹 PILHA INICIAL (na main)
	            // ===============================
	            pilha.push("J");
	            pilha.push("G");
	            pilha.push("R");
	            pilha.push("B");
	            pilha.push("H");
	            pilha.push("L");
	            pilha.push("W");

	            metodos c = new metodos();

	            c.exercicio2(pilha);

	        } catch (Exception e) {

	            System.out.println("Erro: " + e.getMessage());
	        }
	    
    }
	}


