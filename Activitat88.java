package Program5;

import java.util.Scanner;

public class Activitat88 {
	public static final int filas = 3;
	public static final int columnas = 3;
	public static void main(String [] args) {
		int sum;
		int index;
		int index2;
		int[][] taula = new int [filas][columnas];
		
		Scanner teclea = new Scanner(System.in);
		System.out.print("Donada  una  taula  de  dos  dimensions de  10  x  10 "
				+ " de  reals  omplir  la  taula  amb  números  i posteriorment calcular la suma dels seus elements.");
		
		
		//Introducció numeros a la taula
		
		for (index = 0;index<filas;index++){
			for (index2 = 0;index2<columnas;index2++){
				taula[index][index2] = teclea.nextInt();
				
			}
		}
		//Calculs dins de la taula
		sum = 0;
		for (index = 0;index<filas;index++){
			for (index2 = 0; index2<columnas;index2++){
				sum = sum + taula[index][index2];
				
				
			}
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
		System.out.println("La suma de la seguent taula es: "+ sum);
		teclea.close();
		
	}
}
