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
public class SalidaParking implements Runnable {
	SincronizacionParking parking;
        String codigoPuertaSalida;
	int cantidadSaliendo;
	
        //Constructor
	public SalidaParking(SincronizacionParking parking, int cantidadSaliendo, String codigoPuertaSalida) {
		super();
		this.parking = parking;
		this.cantidadSaliendo = cantidadSaliendo;
                this.codigoPuertaSalida = codigoPuertaSalida;
	}

	@Override
	public void run() {
                //Le pasamos a SincronizacionParking la cantidad de coches que salen, y el nombre de la puerta
		parking.salirCoche(cantidadSaliendo,codigoPuertaSalida);
		try {
                        //Dormimos el hilo como mucho 3 segundos
			Thread.sleep((long) (Math.random() * 3_000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
