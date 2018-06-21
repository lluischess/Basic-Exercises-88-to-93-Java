package Program5;

import java.util.Scanner;

public class Activitat89 {
	public static final int filas = 3;
	public static final int columnas = 3;
	public static void main (String [] args){
		//Variables
		//Posicionament taulas
		int index;
		int index2;
		//altres
		int sumfilas;
		int sumcolumnes;
		
		//Importar taula i scanner
		int[][] taula = new int [filas][columnas];
		Scanner teclea = new Scanner(System.in);
		
		System.out.println("Donada  una  taula  de  dos  dimensions  de  10  x  10  de  reals  omplir  la  taula  amb "
					+ "números  i posteriorment  calcular  la  suma  de  cada  fila  i  la  suma  de  cada  columna  mostrant  els  20 "
						+ "resultats per pantalla.");
		//Omplir taula
		for (index = 0;index<filas;index++){
			for (index2 = 0;index2<columnas;index2++){
				taula[index][index2] = teclea.nextInt();
				
			}
		}
		
		// Sumar las files i despres las columnes imprimir suma de cada fila i columne
		sumfilas = 0;
		sumcolumnes = 0;
		for (index = 0;index<filas;index++){
			for (index2 = 0;index2<columnas;index2++){
				sumfilas = sumfilas + taula[index][index2];
				sumcolumnes = sumcolumnes + taula[index2][index];
			}
			System.out.println("Fila " + index + " =" + sumfilas);
			System.out.println("Columnes " + index2 + " =" + sumcolumnes);
            
		}
		
		//Imprimir taula
		System.out.println("LA TAULA ES AQUESTA!"); 
		for (index = 0;index<filas;index++){
			System.out.println();
			for (index2 = 0; index2<columnas;index2++){
				System.out.print("|");
				System.out.print(taula[index][index2] +"");
				
				
			}
		}
		System.out.println(); 
		System.out.println("La suma de las filas taula es: "+ sumfilas);
		System.out.println("La suma de las columnes taula es: "+ sumcolumnes);
		teclea.close();
	}

}
