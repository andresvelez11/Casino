package Casino;
import java.io.*;


public class Dealer {
	public  int cualRonda() {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		int rondas = 0;

		try {

			archivo = new File ("Rondas.txt");
			fr = new FileReader (archivo);
			br = new BufferedReader(fr);

			String linea;
			while((linea=br.readLine())!=null)
				rondas=Integer.parseInt(linea.split(" ")[0]);
		}
		catch(IOException e){
			System.out.println(e.getMessage());;
		}finally{


			try{                    
				if( null != fr ){   
					fr.close();     
				}                  
			}catch (IOException e2){ 
				System.out.println(e2.getMessage());
			}
		}

		return rondas;
	}
	public  void escribirFichero(String dinero,String ronda) {
		FileWriter f= null;
		BufferedWriter b= null;
		try {
			f= new FileWriter("Rondas.txt",true);
			b= new BufferedWriter(f);
			b.write(ronda+" "+dinero);b.newLine();
		}catch(IOException e){
			System.out.println("No se puede abrir el fichero");
		}finally {
			try {
				b.close();
				f.close();
			}catch(IOException e) {
				System.out.println("No se pudo cerrar bien el fichero");
			}
		}
	}

}
