package es.corenetwors.dam.programacion.tema7.arrays;

public class ArraysObjetos {

	
	public static Rectangulo[] obtenerRectangulos() {
				
		//crear array de tamaño 5 de rectangulos
		Rectangulo[] rectangulos=new Rectangulo[5];
				
		//crear 5 rectangulos
		Rectangulo r1=new Rectangulo(1, 1);
		Rectangulo r2=new Rectangulo(1, 2);
		Rectangulo r3=new Rectangulo(1, 3);
		Rectangulo r4=new Rectangulo(1, 4);
		Rectangulo r5=new Rectangulo(1, 5);
		
		//rellenar el array
		rectangulos[0]=r1;
		rectangulos[1]=r2;
		rectangulos[2]=r3;
		rectangulos[3]=r4;
		rectangulos[4]=r5;
		
		//crear e inicializar
		Rectangulo [] rectangulos2 = {r1,r2,r3,r4,new Rectangulo(1, 5)};
				
		//iterar sobre el array para ver los rectangulos que contiene
		for (Rectangulo rectangulo : rectangulos) {
			System.out.println(rectangulo);
		}
		
		return rectangulos;		
	}
	
	public static void main (String[] args) {
		Rectangulo [] rectangulos =obtenerRectangulos();
		
		for (Rectangulo rectangulo : rectangulos) {
			System.out.println(rectangulo);
		}
	}
}
