package es.corenetwors.dam.programacion.tema7.arrays;

import java.util.Iterator;

public class ServicioRectangulo {

	//devuelve un array de rectangulos 
	//con la longitud pasada por parametro
	public Rectangulo[] getRectangulos(int numeroRectangulos){
		
		Rectangulo[] arrayRectangulos=new Rectangulo[numeroRectangulos];
		for (int i = 0; i < arrayRectangulos.length; i++) {
			arrayRectangulos[i]=new Rectangulo(0, 1);
		}
		return arrayRectangulos;
	}
	
	public static void main (String[] args) {
		
		ServicioRectangulo se=new ServicioRectangulo();
		Rectangulo [] rectangulos =se.getRectangulos(20);
		
		for (Rectangulo rectangulo : rectangulos) {
			System.out.println(rectangulo);
		}
	}
}
