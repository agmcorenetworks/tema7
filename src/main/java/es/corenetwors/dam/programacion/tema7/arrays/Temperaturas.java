package es.corenetwors.dam.programacion.tema7.arrays;

public class Temperaturas {


	public static void main(String[] args) {
		byte [] temperaturas= {10,11,12,11,10,9,18,19,14,13,15,15};
		for (byte b : temperaturas) {
			System.out.print(b+ ",");
		}
		
		byte [] temperaturasClon=temperaturas.clone(); 
		System.out.println("\n-------------------");
		for (byte b : temperaturasClon) {
			System.out.print(b+ ",");
		}
		byte [] temperaturasCopy=temperaturas;
		System.out.println("\n-------------------");

		if(temperaturas.equals(temperaturasClon)) {
			System.out.println("temperaturas==temperaturasClon");
		}else {
			System.out.println("temperaturas!=temperaturasClon");
		}
		
		if(temperaturas.equals(temperaturasCopy)) {
			System.out.println("temperaturas==temperaturasCopy");
		}else {
			System.out.println("temperaturas!=temperaturasCopy");
		}
		
	}
}
