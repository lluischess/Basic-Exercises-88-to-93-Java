package Program5;

import java.util.Scanner;

public class Activitat92 {
	public static final int filas = 3;
	public static final int columnas = 3;
	public static void main (String [] args){
		//Variables
				//Posicionament taulas
				int index;
				int index2;
				//altres
				
				
				//Importar taula i scanner
				int[][] sum = new int [filas][columnas];
				int[][] taula = new int [filas][columnas];
				int[][] taula2 = new int [filas][columnas];
				Scanner teclea = new Scanner(System.in);
				
				System.out.println("Fer un algoritme que sumi dues matrius i mostri el resultat per pantalla.");
				
				//Omplir taula
				System.out.println("Omplir la primera taula: ");
				for (index = 0;index<filas;index++){
					for (index2 = 0;index2<columnas;index2++){
						taula[index][index2] = teclea.nextInt();
						
					}
				}
				//Imprimir taula1
				System.out.println(); 
						System.out.println("TAULA 1"); 
						for (index = 0;index<filas;index++){
							System.out.println();
							for (index2 = 0; index2<columnas;index2++){
								System.out.print("|");
								System.out.print(taula[index][index2] +"");
								
								
							}
						}
				//Omplir taula 2
						System.out.println();
						System.out.println();
				System.out.println("Omplir la segona taula: ");
				for (index = 0;index<filas;index++){
					for (index2 = 0;index2<columnas;index2++){
						taula2[index][index2] = teclea.nextInt();
						
					}
				}
				//Imprimir taula1
				System.out.println(); 
						System.out.println("TAULA 2"); 
						for (index = 0;index<filas;index++){
							System.out.println();
							for (index2 = 0; index2<columnas;index2++){
								System.out.print("|");
								System.out.print(taula2[index][index2] +"");
								
								
							}
						}
				
				//Sumar las dos taulas
						System.out.println();
						System.out.println();
				for (index = 0;index<filas;index++){
					for (index2 = 0;index2<columnas;index2++){
						sum[index][index2] = taula[index][index2]+ taula2[index][index2];
						
					}
				}
				
				//Imprimir LA suma de las dos
				System.out.println(); 
						System.out.println("LA SUMA ES: "); 
						for (index = 0;index<filas;index++){
							System.out.println();
							for (index2 = 0; index2<columnas;index2++){
								System.out.print("|");
								System.out.print(sum[index][index2] +"");
								
								
							}
						}
						teclea.close();
				
				
	}
}
