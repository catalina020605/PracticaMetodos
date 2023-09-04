import java.util.ArrayList;

public class MaxNumArrayList {
	public static void prueba(String[] args) {
		ArrayList<Integer> listaDeNumeros = new ArrayList<>();
        listaDeNumeros.add(10);
        listaDeNumeros.add(5);
        listaDeNumeros.add(23);
        listaDeNumeros.add(8);
        listaDeNumeros.add(17);
        int resultado = encontrarMaximo(listaDeNumeros);
        System.out.println("El valor máximo del arreglo es: " + resultado);
    }

	public static int encontrarMaximo(ArrayList<Integer> lista) {
        int maximo = lista.get(0);
        
        for (int numero : lista) {
            if (numero > maximo) {
                maximo = numero;  
            }
        }
        return maximo;
    }
}
