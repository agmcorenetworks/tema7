package es.corenetwors.dam.programacion.tema7.arrays;

public class Rectangulo {

	
	private int base;
	private int altura;
	
	Rectangulo(int base, int altura){
		this.base=base;
		this.altura=altura;
	}
	
	@Override
	public String toString() {		
		return "Rectangulo [base: "+base+" altura: "+altura+"]";
	}
}
