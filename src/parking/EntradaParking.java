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
        
	public EntradaParking(SincronizacionParking parking, int cantidadEntrando, String codigoPuertaEntrada) {
		super();
		this.parking = parking;
		this.cantidadEntrando = cantidadEntrando;
                this.codigoPuertaEntrada = codigoPuertaEntrada;
	}
        
	@Override
	public void run() {
		parking.entrarCoche(cantidadEntrando, codigoPuertaEntrada);
		try {
			Thread.sleep((long) (Math.random() * 3_000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
