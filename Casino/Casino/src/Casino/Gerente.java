package Casino;

import java.io.*;

public class Gerente {
	
	public static String[] leerTxt() {
		FileReader fr;
		BufferedReader br;
		File f=new File("Ronda.txt");
		try {
			String cadena;
			int i=0;
			fr=new FileReader(f);
			br=new BufferedReader(fr);
			String arg[]=new String[br.read()];
			while ((cadena = br.readLine())!=null) {
				arg[i]=cadena;
				i++;
			}
			br.close();
			fr.close();
			return arg;
		} catch (IOException e) {
			return null;
		}	
	}
	
	public static float calcularIngresos() {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		float ganancias=0;

		try {
			
			float cantidad2;
			archivo = new File ("Rondas.txt");
			fr = new FileReader (archivo);
			br = new BufferedReader(fr);
			String linea;
			String cantidad="";
			String[] partes;
			int i=0;
			
			while((linea=br.readLine())!=null && i<linea.length()) {
				
				String signo="";
				partes=linea.split(" ");
				if(partes[1].charAt(0)=='-') 
					signo="-";
					
				cantidad=partes[1];
				
				cantidad2=Float.parseFloat(cantidad);
				
				if(cantidad2>0) 
					ganancias+=cantidad2;
			}
			

		} catch (IOException e) {
			System.out.println("No se pudo leer");
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e1) {
				System.out.println("No se pudo cerrar");
			}
		}
		return ganancias;
	}
	
	public static float calcularPerdidas() {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		float perdidas=0;

		try {
			
			float cantidad2;
			archivo = new File ("Rondas.txt");
			fr = new FileReader (archivo);
			br = new BufferedReader(fr);
			String linea;
			String cantidad="";
			String[] partes;
			int i=0;
			
			while((linea=br.readLine())!=null && i<linea.length()) {
				
				String signo="";
				partes=linea.split(" ");
				if(partes[1].charAt(0)=='-') 
					signo="-";
					
				cantidad=partes[1];
				
				cantidad2=Float.parseFloat(cantidad);
				
				if(cantidad2<0) 
					perdidas+=cantidad2;
			}
			

		} catch (IOException e) {
			System.out.println("No se pudo leer");
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e1) {
				System.out.println("No se pudo cerrar");
			}
		}
		return perdidas*-1;
	}
	
}