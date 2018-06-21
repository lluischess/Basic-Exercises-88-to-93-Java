package Program5;

import java.util.Scanner;

public class Activitat93 {
	public static final int filas = 3;
	public static final int columnas = 3;
	public static void main (String [] args){
		//Variables
				//Posicionament taulas
				int index;
				int index2;
				//altres
				int surt = 1;
				
				//Importar taula i scanner
				int[][] taula = new int [filas][columnas];
				Scanner teclea = new Scanner(System.in);
				
				System.out.println("Fer  un  algoritme  on  l'usuari  haurà  d'anar  introduint  de  manera  aleatòria,  indicant  fila  i columna, de números enters."
						+ " S'haurà de validar que estigui dins dels marges de la columna i que  no  es  pot  introduir  un  valor  en  la  casella  on  ja  s'havia  introduït  un  valor  prèviament. "
						+ "Finalment s'haurà de dir quantes caselles per cada fila tenen valors introduïts.");
				
				System.out.println("Omplir la primera taula: ");
				for (index = 0;index<filas;index++){
					for (index2 = 0;index2<columnas;index2++){
						taula[index][index2] = 0;
						
					}
				}
				//Omplir taula amb las reglas del usuari
				index = 0;
				index2 = 0;
				System.out.println("Introduix primer la fila i despres la columna y per ultim el numero( per sortir 0 cuan to pregunti)");
				while (surt != 0){
					if (index<filas){
						System.out.println("Introduix fila: ");
						index = teclea.nextInt();
					}
					if (index<columnas){
						System.out.println("Introduix Columna: ");
						index2 = teclea.nextInt();
					}
				if (surt != 0 && index > -1 && index < filas){
					if (surt != 0 && index2 > -1 && index2 < columnas){
						if (taula[index][index2] == 0){
							
							System.out.println("Introduix el numero: ");
							taula[index][index2] = teclea.nextInt();
						}
						else {
							System.out.println("La posicio introduida ja esta omplerta");
						}
						
						System.out.println("Si vols sortir introdueix un 0");
						surt = teclea.nextInt();
						index= 0;
						index2 = 0;
						
					}
				}
				//Control de rang
				if ((index < -1 || index > filas)|| (index2 < -1 || index2 > columnas)){
					System.out.println("Fora del rang");
					System.out.println("Si vols sortir introdueix un 0");
					surt = teclea.nextInt();
					index= 0;
					index2 = 0;
				}
				}
				//Imprimir taula
					System.out.println(); 
					System.out.println("TAULA INTRODUIDA"); 
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
