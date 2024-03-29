/*
	 * Crea un programa que permita a un profesor 
	 * registrar las notas de sus estudiantes. 
	 * Utiliza un HashMap donde las claves sean 
	 * los nombres de los estudiantes y los valores 
	 * sean las notas correspondientes. El programa 
	 * debe permitir al profesor agregar estudiantes 
	 * y asignar sus notas, así como también consultar 
	 * la nota de un estudiante específico.
	 */

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class NotasEstudiantes {
	HashMap<String, ArrayList<Double>> notasEstudiantesMap;
	int cantEst;
	
	public void Operaciones(){
		notasEstudiantesMap=new HashMap<String, ArrayList<Double>>();
	}
	
	public void iniciar() {
		cantEst=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes"));
		Operaciones();
		llenarMapa();
		imprimirMapa();
		consultarEstudiante();
	}
	
	private void consultarEstudiante() {
		String nombreConsulta=JOptionPane.showInputDialog("Ingrese el nombre del estudiante a consultar");
		if (notasEstudiantesMap.containsKey(nombreConsulta)) {
			ArrayList<Double> listaNotasTemp=notasEstudiantesMap.get(nombreConsulta);
			System.out.println("Nombre: "+nombreConsulta);
			
			double sum=0;
			System.out.println("Lista de notas: ");
			for (int i = 0; i < listaNotasTemp.size(); i++) {
				System.out.print(listaNotasTemp.get(i)+",");
				sum+=listaNotasTemp.get(i);
			}
			
			double prom=sum/listaNotasTemp.size();
			System.out.println("\nEl Promedio es: "+prom);
		}else {
			System.out.println("No encuentra el estudiante: "+nombreConsulta);
		}
	}

	private void imprimirMapa() {
		System.out.println(notasEstudiantesMap);
	}

	private void llenarMapa() {
		ArrayList<Double> notasList;
		String nombre;
		for (int i = 0; i < cantEst; i++) {
			nombre=JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
			notasList=new ArrayList<Double>();
			double nota;
			for (int j = 0; j < 3; j++) {
				nota=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota "+(j+1)+" Para "+nombre));
				notasList.add(nota);
			}
			System.out.println(nombre+"="+notasList);
			notasEstudiantesMap.put(nombre, notasList);
		}
	}
}
