package es.corenetwors.dam.programacion.tema7.arrays;

public class StringBufferJava {
	
	
	public static void main(String[] args) {
	
		//crear un stringbuffer y utilizar con el los metodos vistos
		
		//constructor con String
		StringBuffer myStringBuff=new StringBuffer("Hola Me llamo Alejandro");
		
		//consttuctor capacity
		StringBuffer myStringCap=new StringBuffer(5);
		myStringCap.append("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
		System.out.println(myStringCap);
		
		//length
		System.out.println(myStringBuff.length());
		
		//capacity
		System.out.println(myStringBuff.capacity());
		
		//append
		System.out.println(myStringBuff.append(" garcia"));
		
		//insert
		System.out.println(myStringBuff.insert(0,"Hello - "));
		
		//reverse
		System.out.println(myStringBuff.reverse());
		
		//delete
		System.out.println(myStringBuff.reverse());
		System.out.println(myStringBuff.delete(0,8));
		
		//replace
		System.out.println(myStringBuff.replace(0,4,"Hello"));
		
		//substring
		System.out.println(myStringBuff.substring(15));
		
		//toString
		System.out.println(myStringBuff.toString());
		
		//charAt
		System.out.println(myStringBuff.charAt(0));
		
		//setChar
		myStringBuff.setCharAt(23,'a');
		System.out.println(myStringBuff);
		
		
	}
}
