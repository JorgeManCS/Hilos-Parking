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
        //Cantidad actual de coches en el parking
	private int cantidadCoches;

        //Constructor
	public SincronizacionParking(int cantidadCoches) {
		this.cantidadCoches = cantidadCoches;
	}
        
        //Metodo de sincronización para salir coches. Recibe la cantidad de coches que salen, y el nombre de la puerta mediante MainParking
	public synchronized void  salirCoche(int cochesSaliendo, String codigoPuertaSalida){
                //comprobamos que sale como mínimo un coche, y que la cantidad de coches actual es mayor a la cantidad de coches que va a salir
		if ( cochesSaliendo > 0 && cantidadCoches > cochesSaliendo ){
                        //Le restamos a la cantidad actual, el numero de coches que han salido
			cantidadCoches -= cochesSaliendo;
			System.out.println("SALIENDO del parking " + cochesSaliendo + " coches, por la  "+codigoPuertaSalida+"-----  Cantidad Actual=" + cantidadCoches);
		}
	}
        
        
        //Metodo de sincronización para entrar coches. Recibe la cantidad de coches que entran, y el nombre de la puerta mediante MainParking
	public synchronized void entrarCoche(int cochesEntrando, String codigoPuertaEntrada){
                //Comprobamos que existen mas de "X" coches
                if ( cochesEntrando > 0 && cantidadCoches <100){
		//if ( cochesEntrando > 0 && cantidadCoches >7){
                        //Le sumamos a la cantidad actual, el numero de coches que han entrado
			cantidadCoches += cochesEntrando;
			System.out.println("ENTRANDO en el parking " + cochesEntrando +" coches, por la "+codigoPuertaEntrada+" -----  Cantidad Actual=" + cantidadCoches);
		}	
	}

    
}
