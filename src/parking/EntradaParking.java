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
public class EntradaParking extends Thread {
	SincronizacionParking parking;
        String codigoPuertaEntrada;
	int cantidadEntrando;
        
        //Constructor
	public EntradaParking(SincronizacionParking parking, int cantidadEntrando, String codigoPuertaEntrada) {
		super();
		this.parking = parking;
		this.cantidadEntrando = cantidadEntrando;
                this.codigoPuertaEntrada = codigoPuertaEntrada;
	}
        
	@Override
	public void run() {
                //Le pasamos a SincronizacionParking la cantidad de coches que entra, y el nombre de la puerta
		parking.entrarCoche(cantidadEntrando, codigoPuertaEntrada);
		try {
                        //Dormimos el hilo como mucho 3 segundos
			Thread.sleep((long) (Math.random() * 3_000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
