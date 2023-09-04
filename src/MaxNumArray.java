
public class MaxNumArray {
	
	 	public static void prueba(String[] args) {
	        int[] arregloDeNumeros = {10, 5, 23, 8, 28};
	        int resultado = encontrarMaximo(arregloDeNumeros);
	        System.out.println("El valor máximo del arreglo es: " + resultado);
	    }

	    public static int encontrarMaximo(int[] arreglo) {
	        int maximo = arreglo[0]; 
	        for (int numero : arreglo) {
	            if (numero > maximo) {
	                maximo = numero;  
	            }
	        }
	        return maximo;
	    }
}
