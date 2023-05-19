package Ejercicio3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Directorio {
	
	private File directorio;
	
	private String direccionDirectorio;
	
	private String datosParaGuardar;
	
	private String datos="";
	
	public Directorio(String direccionDirectorio) {
		
		this.direccionDirectorio = direccionDirectorio;
		this.directorio = new File(direccionDirectorio);
		
	}
	
	
	public File getDirectorio() {
		return directorio;
	}


	public String getDatos() {
		return datos;
	}


	

	public String getDatosParaGuardar() {
		return datosParaGuardar;
	}


	public void setDatosParaGuardar(String datosParaGuardar) {
		this.datosParaGuardar = datosParaGuardar;
	}


	public String getDireccionDirectorio() {
		return direccionDirectorio;
	}


	public void setDireccionDirectorio(String direccionDirectorio) {
		this.direccionDirectorio = direccionDirectorio;
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
					datos=datos + "- "+nombreArchivos[i]+"\n";
				}
				else {
					 ultimaModificacion = listFile[i].lastModified();
					 fecha = new Date(ultimaModificacion);
					 formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
				     fechaModificacion = formatoFecha.format(fecha);
					
				     System.out.println("   "+nombreArchivos[i] + " Fecha Modificacion: " + fechaModificacion);
					datos = datos + "   "+nombreArchivos[i] + " Fecha Modificacion: " + fechaModificacion+"\n";
				}
					
				
				if (listFile[i].isDirectory())
					listarArbol(listFile[i]);
			}
		}		
	}
	
	public void AsignarDatos() {
		setDatosParaGuardar(datos);
	}
	
	public void crearArchivo(String direcciondirectorio, String nombreArchivo) {
		String ruta = getDireccionDirectorio() + "/"+nombreArchivo;
		
		File rutaNuevoArchivo = new File(ruta);
		
		try {
			rutaNuevoArchivo.canExecute();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void escribirArchivo(String nombreArchivo, String datos) {
		
		FileWriter archivo = null;
        PrintWriter pw = null;
        try
        {
        	archivo = new FileWriter(nombreArchivo);
            pw = new PrintWriter(archivo);

            pw.println(datos);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != archivo)
              archivo.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
		
		
	}
	
		
}	
	

