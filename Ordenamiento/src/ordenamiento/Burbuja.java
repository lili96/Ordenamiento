/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author LIILY´S
 */
public class Burbuja {
	public static void main(String[] args) {
		String [] arreglo={"Karen","Andres", "Yuliana", "Alondra", "Daniela", "Isaac", "Nicolas","Laura", "Joselyn", "Emiliano"};
				
		//Imprime el arreglo desordenado
		System.out.println("Desordenado");
		for(int i=0;i<arreglo.length;i++){
			System.out.println("Arreglo ["+i+"]:"+ arreglo[i]);
		}
		
		String aux;
		
		for(int i=0;i<arreglo.length;i++){
			for(int j=0;j<arreglo.length-1;j++){
				if(arreglo[j].compareTo(arreglo[j+1])>0){
					aux=arreglo[j];
					arreglo[j]=arreglo[j+1];
					arreglo[j+1]=aux;
				}
			  }
			}
		System.out.println();
		System.out.println("Ordenado");
			for(int i=0;i<arreglo.length;i++){
				System.out.println("Arreglo ["+i+"]:"+ arreglo[i]);
			
		}
	}
}
