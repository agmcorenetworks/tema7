package es.corenetwors.dam.programacion.tema7.arrays;

public class Strings {

	public static void main(String[] args) {

		char [] cadena1= {'p','e','p','e'};
		
		
		
		String cad1 = "pepe";
		String cad2 = new String("Lionel");
		String cad3 = new String(cad2);
		String cad4 = new String(cadena1);

		System.out.println(cadena1);
		System.out.println(cad1);
		System.out.println(cad2);
		System.out.println(cad3.length());
		System.out.println(cad4);
		
		
		String cadenaS="andy";
		String cadenaS2="andy y lucas";
		String cadenaS3=cadenaS.concat("andy y lucas");
		String cadenaS4=cadenaS.concat(new String("andy y lucas"));
		String cadenaS5=cadenaS.concat(cadenaS2);
		
		String nombre="garcia";
		String apellido="Garcia";
		String nombreCompleto=apellido+", "+nombre;
		System.out.println(nombreCompleto);
		
		int valor=nombre.compareToIgnoreCase(apellido);
		System.out.println("valor: "+valor);
		if(valor>0) {
			System.out.println(nombre +" es mayor que "+apellido);
		}else if(valor<0) {
			System.out.println(nombre +" es menor que "+apellido);
		}else {
			System.out.println("son iguales");
			
		}
		System.out.println();
		System.out.println("=====================================");
		String st1="Emma";
		String st2="Emma";
		if(st1.equals(st2))
			System.out.println("son iguales");
		else
			System.out.println("son diferentes");
		if(st1==(st2))
			System.out.println("son iguales");
		else
			System.out.println("son diferentes");		
		String st3="  Emma  ".trim();
		System.out.println(st3);

		Integer minum=Integer.parseInt("45");
		Integer g=new Integer("45");
		Integer g2=new Integer(45);
		System.out.println(g.equals(g2));
		
		System.out.println(minum);
		
		String nombreDeFichero="alumnos.txt";
		
		String [] partes=nombreDeFichero.split("\\.");
		
		System.out.println("nombre: "+partes[0]);
		System.out.println("extension: "+partes[1]);
		
		String csv="uno;dos;tres;cuatro;5";		
		String [] elementos=csv.split(";");
		System.out.println("elementos en el array: "+elementos.length);

		//inmutabilidad de strings:
		String name="soy alex";
		name.replace('e', 'i');
		System.out.println(name);
		System.out.println(name.replace('e', 'i'));
		System.out.println(name);
	}
}
