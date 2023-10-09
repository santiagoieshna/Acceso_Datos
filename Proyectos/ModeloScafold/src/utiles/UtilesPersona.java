package utiles;

import java.util.Random;


public class UtilesPersona {

	public static String genFakeName() {
		
		String[] nombres = {"Roberto", "Joaquin", "Estefania", "Pepelu", "Francisco", "Rosa", "Elena", "Debora"};
		String[] apellido = {"Garcia", "Peralta", "Perez", "Meloso", "Melendez", "Porro",
								"Melano", "Nito", "Olivo", "Rajoy", "Borbon", "Nabos"};
		
		String espacio = " ";
		String nombreCliente = nombres[genRandom(nombres.length)];
		nombreCliente += espacio+ apellido[genRandom(apellido.length)];
		
		return nombreCliente;
	}
	
	
	public static String genDNI() {
		Integer longitud = 9;
		Integer max= 10;
		Integer min= 1;
		String dni="";
		Character letra;
		
		dni=  Integer.valueOf(new Random().nextInt(max)+min).toString();
		
		for (int i = 0; i < longitud-1; i++) {
			
			Integer numero = new Random().nextInt(max);
			dni += numero;
		}
		
		do {
			letra = (char) (new Random().nextInt((int)'Z'-(int)'A')+(int)'A');
		}while(letra <'A' && letra > 'Z');
		 
		dni+= letra;
		return dni;
	}
	
	private static int genRandom(int length) {
		return new Random().nextInt(length);
	}
	
}
