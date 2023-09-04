/*Realice un algoritmo que use un Método sin parámetros y con retorno que genera un número 
 * aleatorio entre 1 y 100 y lo devuelve como resultado:*/

import javax.swing.JOptionPane;

public class Aleatorio {
	
	public static int numAleatorio() {
		int numero = (int)(Math.random()*100+1);
		System.out.println("El numero es:"+numero);
		return numero;
	}
}
