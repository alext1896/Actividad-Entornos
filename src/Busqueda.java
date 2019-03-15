
public class Busqueda {
	
	/**
	 * La clase busqueda nos permite buscar un número introducido por teclado.
	 * @author Alejandro Guapache
	 * @version 1.0 - 15/Marzo/2019
	 */
	
	private int [] array = {5, 1, 22, 9, 12, 6, 4, 8, 15, 21, 18, 17, 2, 11, 16};
	
	/**
	 * Constructor vacío de la clase Busqueda
	 */
	public Busqueda () {
		
	}
	
	/**
	 * Método que nos permite recorrer el array buscando el número introducido.
	 * @param num - En este parámetro se almacenará el número entero que buscaremos. 
	 * @return Este método nos retornará un booleano, si se ha encontrado el número devolverá
	 * un true, sino, devolvera un false. 
	 */
	public boolean busquedaLineal (int num) {
		 boolean valid = false;
		 
		 for (int i = 0; i < array.length; i++) {
			 if (array [i] == num) {
				 valid = true;
			 }
		 }
		 
		 return valid;
	}
}
