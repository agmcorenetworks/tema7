package es.corenetwors.dam.programacion.tema7.polimorfismo;

public class Empleado extends Persona{
	protected int sueldoBase;
	
	public int getSueldo() {
		return sueldoBase;
	}
	public void setSueldo(int sueldo) {
		this.sueldoBase=sueldo;
	}
	
}
