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
public class SellShort {
  public double [] shell(double[] array){
		boolean estado;
		for(int j = array.length / 2; j > 0; j = j == 2 ? 1 : j / 2){
			do{
				estado = false;
			for(int i = 0; i + j < array.length;i++ ){
				if(array[i+j] < array[i]){
					double aux = array[i+j];
					array[i+j] = array[i];
					array[i] = aux;	
					estado = true;
				}
			}
			}while(estado);
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		double[] numeros ={500, 10, 20, 150, 50, 300, 100, 35, 5, 400};
		
		SellShort sell = new SellShort();
		
		double[] result = sell.shell(numeros);
		
		for(int i=0; i<result.length;i++){
			System.out.print(result[i] + " , ");
		}
	}
  
}
