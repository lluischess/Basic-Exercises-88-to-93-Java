package Program5;

import java.util.Scanner;

public class Activitat90 {
	public static final int filas = 3;
	public static final int columnas = 3;
	public static void main (String [] args){
		//Variables
		//Posicionament taulas
		int index;
		int index2;
		//altres
		int gran;
		int petit;
		
		//Importar taula i scanner
		int[][] taula = new int [filas][columnas];
		Scanner teclea = new Scanner(System.in);
		
		System.out.println("Donada  una  taula  de  dos  dimensions  de  10  x  10  de  reals  omplir  la  taula  amb  números  i "
					+ "posteriorment  buscar  quin  es  el  valor  més  gran  i  el "
						+ "més  petit  de  cada  fila,  mostrant  els  10 "
							+ "valors per pantalla.");
		
		//Omplir taula
		
		for (index = 0;index<filas;index++){
			for (index2 = 0;index2<columnas;index2++){
				taula[index][index2] = teclea.nextInt();
				
			}
		}
		
		// Buscar el numero mes gran i el mes petit de cada fila
		gran = petit = taula[0][0];
		for (index = 0;index<filas;index++){
			for (index2 = 0;index2<columnas;index2++){
				if ( taula[index][index2] > gran){
					gran = taula[index][index2];
					
				}
				if (taula[index][index2] <petit){
					petit = taula[index][index2];
				}
				
			}
			System.out.println("De la fila " + index + " el valor mes gran es: " + gran);
			System.out.println("De la fila " + index + " el valor mes petit es: " + petit);
			gran = petit = taula[0][0];
		}
		//Imprimir taula
		System.out.println(); 
				System.out.println("LA TAULA ES AQUESTA!"); 
				for (index = 0;index<filas;index++){
					System.out.println();
					for (index2 = 0; index2<columnas;index2++){
						System.out.print("|");
						System.out.print(taula[index][index2] +"");
						
						
					}
				}
				teclea.close();
	}
}
