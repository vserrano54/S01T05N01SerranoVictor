package Ejercicio2;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

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
	
	public void listarArbol(File file) {
		long ultimaModificacion;
		Date fecha;
		SimpleDateFormat formatoFecha;
		String fechaModificacion;
		
		String nombreArchivos[];
		File listFile[] = file.listFiles();
		if (listFile != null && listFile.length > 0) {
			Arrays.sort(file.list());
			nombreArchivos = file.list();
			for (int i=0;i<listFile.length; i++) {
				if (listFile[i].isDirectory()) {		
					System.out.println("- "+nombreArchivos[i]);
				}
				else {
					
				    ultimaModificacion = listFile[i].lastModified();
					fecha = new Date(ultimaModificacion);
					formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			        fechaModificacion = formatoFecha.format(fecha);
			         
			        System.out.println("   "+nombreArchivos[i] + " Fecha Modificacion: " + fechaModificacion);
			       
				}
				
				if (listFile[i].isDirectory()) {
					listarArbol(listFile[i]);
					
				}
					
			}
		
		}
		
	}
}
	

