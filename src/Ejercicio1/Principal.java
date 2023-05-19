package Ejercicio1;

import java.util.Scanner;

public class Principal {
	
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ingrese la dirección del direcctorio para listar sus archivos:  ");	
		String nombreDirectorio =  input.nextLine();
		
		Directorio directorio = new Directorio(nombreDirectorio);
		
		directorio.listarDirectorio();
		
		
		
	}

}
