package es.corenetwors.dam.programacion.tema7.polimorfismo;

public class Encargado extends Empleado{

	public int getSueldo() {
		return new Double(sueldoBase*1.1).intValue();
	}
	
	public void doCosasDeEncargado() {
		
	}
}
