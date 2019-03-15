import java.util.Scanner;

	/**
	 * Este es un pequeño programa que nos permitirá buscar un número introducido por teclado.
	 * @author jose.guapache
	 * @version 1.0 - 15/Marzo/2019
	 *
	 */
public class MainBusqueda {

	public static void main(String[] args) {
		
		//Zona de variables
		int num;
		
		//Zona de invocaciones
		Scanner sc = new Scanner (System.in);
		Busqueda actividad = new Busqueda (); //En esta línea instanciamos nuestra clase Busqueda
		
		System.out.println("Introduzca el número que quiere buscar");
		num = sc.nextInt(); //Almacenamos el número que queremos buscar
		
		
		/* Invocamos el método busqueda lineal de nuestra clase Busqueda para buscar
		 * el número introducido por teclado. Si el resultado es true se imprimirá por pantalla si se ha encontrado o no.  
		 */
		if (actividad.busquedaLineal(num) == true) {
			System.out.println("El número se ha encontrado");
		}
		else {
			System.out.println("El número no se ha encontrado");
		}
		
		sc.close();
	}

}
