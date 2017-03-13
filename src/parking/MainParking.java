/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking;

/**
 *
 * @author jorgemanuel
 */
public class MainParking {

	public static void main(String[] args) {
                //Le indicamos la cantidad inicial de coches que tiene el parking
		SincronizacionParking parking = new SincronizacionParking(10);
		int cantidad;
           
		for(int i = 0; i < 100; i++ ){
                    
                        //Creamos una cantidad al azar de coches que entren o salen por la puerta
                        cantidad = (int) (Math.random() * 11);
                        //Creamos un hilo o en este caso una puerta de entrada indicando la cantidad de cohes que entran y el nombre de la puerta
			Thread entrada_1 = new EntradaParking(parking, cantidad, "PUERTA_ENTRADA_1");
                        
                        cantidad = (int) (Math.random() * 11);
                        Thread entrada_2 = new EntradaParking(parking, cantidad, "PUERTA_ENTRADA_2");
                        
                        cantidad = (int) (Math.random() * 11);
                        Thread entrada_3 = new EntradaParking(parking, cantidad, "PUERTA_ENTRADA_3");  
			//Iniciamos los hilos
                        entrada_1.start();entrada_2.start();entrada_3.start();
                        
                        
                        //Creamos una cantidad al azar de coches que entren o salen por la puerta
			cantidad = (int) (Math.random() * 7);
                        //Creamos un hilo o en este caso una puerta de salida indicando la cantidad de cohes que salen y el nombre de la puerta
                        Thread hiloRetirada_1 = new Thread(new SalidaParking(parking, cantidad, "PUERTA_SALIDA_1"));
                        cantidad = (int) (Math.random() * 7);
                        Thread hiloRetirada_2 = new Thread(new SalidaParking(parking, cantidad, "PUERTA_SALIDA_2"));
			//Iniciamos los hilos
                        hiloRetirada_1.start();hiloRetirada_2.start();
                        
			//System.out.println();
                    
		}

	}

}
