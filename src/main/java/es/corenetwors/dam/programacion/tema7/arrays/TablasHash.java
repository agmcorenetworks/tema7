package es.corenetwors.dam.programacion.tema7.arrays;

import java.util.Enumeration;
import java.util.Hashtable;

public class TablasHash {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo(1, 1);
		Rectangulo r2 = new Rectangulo(1, 2);
		Rectangulo r3 = new Rectangulo(1, 3);

		// crear una tabla hash y meter dentro:
		Hashtable<String, Rectangulo> rectangulos = new Hashtable<String, Rectangulo>();

		String key1 = new String("primero");
		String key2 = new String("segundo");
		String key3 = new String("tercero");

		rectangulos.put(key1, r1);
		rectangulos.put(key2, r2);
		rectangulos.put(key2, r3);

		// recuperar los datos directamente y pintarlos por pantalla a traves de las
		// keys
		Rectangulo r4 = rectangulos.get(key1);
		Rectangulo r5 = rectangulos.get(key2);
		// Rectangulo r6=rectangulos.get(key3);

		System.out.println(r4.toString());
		System.out.println(r5.toString());
		// System.out.println(r6.toString());

		System.out.println(r1.equals(r4));
		System.out.println(r1 == (r4));

		System.out.println(r1);
		System.out.println(r4);

		// recuperar e iterar las keys para sacar los datos a traves ellas (keys())
		Enumeration e = rectangulos.keys();
		while (e.hasMoreElements()) {
			String object = (String) e.nextElement();
			System.out.println("key: " + object);
			System.out.println(rectangulos.get(object));
		}

		System.out.println("========================================================");
		// recuperar e iterar los elements para sacar los datos a traves ellas
		// (elements())
		Enumeration enu = rectangulos.elements();
		while (enu.hasMoreElements()) {
			Rectangulo object = (Rectangulo) enu.nextElement();
			System.out.println(object);
		}
	}
}
