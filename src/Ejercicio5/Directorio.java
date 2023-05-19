package Ejercicio5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Directorio implements Serializable{
	
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
	
	public void listarArbol(File file, int numDir) {
		long ultimaModificacion;
		Date fecha;
		SimpleDateFormat formatoFecha;
		String fechaModificacion;
		
		String nombreArchivos[];
		
		File listFile[] = file.listFiles();
		if (listFile != null && listFile.length > 0) {
			
			Arrays.sort(file.listFiles());
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
					listarArbol(listFile[i], numDir);
			}
		}else {
			numDir++;
			System.out.print(numDir + ", ");
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
	
	
	
	public void leerArchivo(String nombreArchivo) {
		
		Scanner sc = new Scanner(System.in);
		try {
			
			
			BufferedReader bf = new BufferedReader(new FileReader(nombreArchivo));
			String linea;
			int i=1;
			while ((linea = bf.readLine())!=null) {

				System.out.println(linea);
				i++;
			}
			

		} catch (Exception e) {
			System.out.println("Error, no se encuentra el archivo " + nombreArchivo);
		}
		
	}
	
public void escribirArchivoSerializado(String nombreArchivo, String datos) {
		
		ObjectOutputStream escribirArchivo=null;
        try
        {
        	escribirArchivo= new ObjectOutputStream(
        			new FileOutputStream(nombreArchivo));
        	
        	escribirArchivo.writeObject(datos);

           escribirArchivo.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != escribirArchivo)
        	   escribirArchivo.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
		
		
	}
	
	public void leerArchivoSerializado(String nombreArchivo) {
		
		ObjectInputStream leerArchivo=null;
        try
        {
        	leerArchivo= new ObjectInputStream(
        			new FileInputStream(nombreArchivo));
        	
        	String datosRecuperados = (String)leerArchivo.readObject();

        	leerArchivo.close();
        	
        	System.out.println("Archivo recuperado");
        	System.out.println(datosRecuperados);
        		

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (null != leerArchivo)
        	   leerArchivo.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
		
		
	}
		
}	
	

