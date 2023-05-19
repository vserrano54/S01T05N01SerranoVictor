package Ejercicio1;

import java.io.File;
import java.util.Arrays;

public class Directorio {
	
	private File directorio;
	
	public Directorio(String direccionDirectorio) {
		
		directorio = new File(direccionDirectorio);
		
	}
	
	
	public File getDirectorio() {
		return directorio;
	}


	public void setDirectorio(File directorio) {
		this.directorio = directorio;
	}


	public boolean validarDirectorio() {
		boolean bandera = false;
	    System.out.println(directorio.getAbsolutePath());
		if (this.directorio.exists() && this.directorio.isDirectory())
			bandera = true;
		
		return bandera;
				
	}
	
	public void listarDirectorio() {
		String[] nombreArchivos;
		if (validarDirectorio()) {
			nombreArchivos = this.directorio.list();
			Arrays.sort(nombreArchivos);
			for (String nombreArchivo: nombreArchivos)
				System.out.println(nombreArchivo);
		}
		else {
			System.out.println("no es un directorio valido");
		}
	}
	

}
