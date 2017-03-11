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
                //Cantidad principal del parking
		SincronizacionParking parking = new SincronizacionParking(10);
		int cantidad;
           
		for(int i = 0; i < 100; i++ ){
                    
                        cantidad = (int) (Math.random() * 11);
			Thread entrada_1 = new EntradaParking(parking, cantidad, "PUERTA_ENTRADA_1");
                        cantidad = (int) (Math.random() * 11);
                        Thread entrada_2 = new EntradaParking(parking, cantidad, "PUERTA_ENTRADA_2");
                        cantidad = (int) (Math.random() * 11);
                        Thread entrada_3 = new EntradaParking(parking, cantidad, "PUERTA_ENTRADA_3");  
			
                        entrada_1.start();entrada_2.start();entrada_3.start();
                        
			cantidad = (int) (Math.random() * 7);
                        Thread hiloRetirada_1 = new Thread(new SalidaParking(parking, cantidad, "PUERTA_SALIDA_1"));
                        cantidad = (int) (Math.random() * 7);
                        Thread hiloRetirada_2 = new Thread(new SalidaParking(parking, cantidad, "PUERTA_SALIDA_2"));
			
                        hiloRetirada_1.start();hiloRetirada_2.start();
                        
			System.out.println();
                    
		}

	}

}
