package es.corenetwors.dam.programacion.tema7.abstractas;

public class TestAbstract {

	public static void main(String[] args) {
		
		Moto m=new Moto();
		m.getMarca();
		
		Vehiculo v=new Moto();
		v.getVelocidadActual();
		//v.getMarca(); no se puede hacer, fallo de compilación
		
	}
}
