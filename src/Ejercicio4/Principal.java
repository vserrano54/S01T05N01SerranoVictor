package Ejercicio4;

import java.util.Scanner;

public class Principal {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ingrese la dirección del direcctorio para listar sus archivos:  ");	
		String nombreDirectorio =  input.nextLine();
		
		Directorio directorio = new Directorio(nombreDirectorio);
		int numDir = 0;
		System.out.println("Lista de Arivos y Directorios recorridos de forma recursiva");
		directorio.listarArbol(directorio.getDirectorio(), numDir);
		
		System.out.println();
		directorio.AsignarDatos();
		
		//System.out.println(directorio.getDatosParaGuardar());
		
		directorio.crearArchivo(nombreDirectorio, "ArchivoNuevo.txt");
		
		directorio.escribirArchivo(nombreDirectorio + "/ArchivoNuevo.txt", directorio.getDatosParaGuardar());
		
		System.out.println();
		System.out.println("Lectura en pantalla del nuevo archivo que se asigno lo que se encontraba en el directorio anterior");
		directorio.leerArchivo(nombreDirectorio + "/ArchivoNuevo.txt");
		
		
		
		
	}

}
