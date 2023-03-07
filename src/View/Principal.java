/*Considerando exercícios realizados anteriormente, criar uma função
recursiva que solucione a função (Entrada limitada a 10):*/
package View;

import Controller.Controller;


public class Principal {

	public static void main(String[] args) {
		Controller soma = new Controller();
		int n = 5;
		double somas = soma.somas(n);
		System.out.println(somas);


	}

}
