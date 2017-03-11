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
public class SincronizacionParking {
	private int cantidadCoches;

        //Constructor
	public SincronizacionParking(int cantidadCoches) {
		this.cantidadCoches = cantidadCoches;
	}
        
        
	public synchronized void  salirCoche(int cochesSaliendo, String codigoPuertaSalida){
		if ( cochesSaliendo > 0 && cantidadCoches > cochesSaliendo ){
			cantidadCoches -= cochesSaliendo;
			System.out.println("SALIENDO del parking " + cochesSaliendo + " coches, por la  "+codigoPuertaSalida+"-----  Cantidad Actual=" + cantidadCoches);
		}
	}
        
        
	public synchronized void entrarCoche(int cochesEntrando, String codigoPuertaEntrada){
                //Comprobamos que existen mas de "X" coches
                if ( cochesEntrando > 0 && cantidadCoches <100){
		//if ( cochesEntrando > 0 && cantidadCoches >7){
			cantidadCoches += cochesEntrando;
			System.out.println("ENTRANDO en el parking " + cochesEntrando +" coches, por la "+codigoPuertaEntrada+" -----  Cantidad Actual=" + cantidadCoches);
		}	
	}

    
}
