package Program5;

import java.util.Scanner;

public class Activitat91 {
	public static final int filas = 3;
	public static final int columnas = 3;
	public static void main (String [] args){
		//Variables
				//Posicionament taulas
				int index;
				int index2;
				//altres
				
				
				//Importar taula i scanner
				int[][] aux = new int [filas][columnas];
				int[][] taula = new int [filas][columnas];
				Scanner teclea = new Scanner(System.in);
				
				System.out.println("Fer un algoritme per transposar una matriu de 10x10.");
				
				//Omplir taula
				
				for (index = 0;index<filas;index++){
					for (index2 = 0;index2<columnas;index2++){
						taula[index][index2] = teclea.nextInt();
						
					}
				}
				//Imprimir taula per primer cop
				System.out.println(); 
						System.out.println("LA TAULA ES AQUESTA!"); 
						for (index = 0;index<filas;index++){
							System.out.println();
							for (index2 = 0; index2<columnas;index2++){
								System.out.print("|");
								System.out.print(taula[index][index2] +"");
								
								
							}
						}
				
				//trasposar matriu
				for (index = 0;index<filas;index++){
					for (index2 = 0;index2<columnas;index2++){
						aux[index2][index] = taula[index][index2];
					}
				}
				//Imprimir taula
				System.out.println(); 
						System.out.println("LA TAULA TRASPOSADA"); 
						for (index = 0;index<filas;index++){
							System.out.println();
							for (index2 = 0; index2<columnas;index2++){
								System.out.print("|");
								System.out.print(aux[index][index2] +"");
								
								
							}
						}
						teclea.close();
				
	}

}
