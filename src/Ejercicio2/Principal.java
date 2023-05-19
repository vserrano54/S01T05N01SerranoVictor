package Ejercicio2;

import java.util.Scanner;

public class Principal {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ingrese la dirección del direcctorio para listar sus archivos:  ");	
		String nombreDirectorio =  input.nextLine();
		
		Directorio directorio = new Directorio(nombreDirectorio);
		
		String unidadDisco =   directorio.getDirectorio().toPath().getRoot().toString();
				
		System.out.println("Unidad de disco es: " + unidadDisco);
		
		System.out.println("Lista de Archivo y Directorios recorridos de forma recursiva");
		directorio.listarArbol(directorio.getDirectorio());
				
	}

}
