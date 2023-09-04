/*Escribe un método con parámetros y sin retorno que reciba un número entero y lo imprima en 
 * pantalla si es mayor que 10.*/

public class NumMayor10 {
	public static void prueba(String arg[]) {
		numero(9);
	}
	public static void numero (int num) {
		if (num > 10) {
			System.out.println("El "+num+" es mayor que 10");
		} else {
			System.out.println("El numero no es mayor que 10");
		}
	}
}
