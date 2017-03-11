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
public class Parking {
	private int coche;

	public Parking(int coche) {
		this.coche = coche;
	}
        
	public void EntradaParking(int cantidad){
		if ( cantidad > 0 && coche > cantidad ){
			coche -= cantidad;
			System.out.println("Saliendo del parking " + cantidad + " coches -----  Cantidad Actual=" + coche);
		}
	}
        
	public void SalidaParking(int cantidad){
		if ( cantidad > 0 ){
			coche += cantidad;
			System.out.println("Entrando en el parking " + cantidad + " coches -----  Cantidad Actual=" + coche);
		}	
	}
}
