/*Realiza un algoritmo donde se simule un diccionario simple. Crea un HashMap o HashTable donde las 
 * claves sean palabras en inglés y los valores sean las traducciones al español. Permite al usuario 
 * ingresar una palabra en inglés y muestra su traducción en español si está en el diccionario.*/

import java.util.HashMap;
import javax.swing.JOptionPane;

public class Diccionario {
	
	static HashMap<String, String> mapaPalabras = new HashMap<String, String>();
	
	public static void traduccion () {
		mapaPalabras.put("Apple","Manzana");
		mapaPalabras.put("Hair","Cabello");
		mapaPalabras.put("Nose","Nariz");
		mapaPalabras.put("Juice","Jugo");
		mapaPalabras.put("Name","Nombre");
		System.out.println(mapaPalabras);
	}
	
	static void consultarPalabras() {
		String palabraConsulta=JOptionPane.showInputDialog("Ingrese la palabra que quiere consultar");
		if (mapaPalabras.containsKey(palabraConsulta)) {
            System.out.println("Traduccion: "+mapaPalabras.get(palabraConsulta));

        }else {
            System.out.println("No encuentra la palabra: "+ palabraConsulta);
        }
	}
}
