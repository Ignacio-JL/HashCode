package com.mycode.hashcode;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Person people1 = new Person();
		Archivo info = new Archivo();
		
		//System.out.println("Ingrese Nombre y apellido: ");
		//people1.setName(sc.nextLine());
		people1.setName(info.readFile("DataText.txt"));
		System.out.println("el nombre ingresado es: " + people1.getName());
		System.out.println("y tiene " + ( people1.getName().length() - countBlanks(people1.getName())  ) + " letras");
		System.out.println("Ingrese Dni: ");
		people1.setDni(Integer.valueOf(sc.nextLine()));
		System.out.println("digitos de dni son: " + Integer.toString(people1.getDni()).length() );
		
		showHashCode(people1.getName().length() - countBlanks(people1.getName()) , people1.getDni());

	}
	
	public static int countBlanks(String pName) {
		int white = 0;
		//char [] Arrayname = name.toCharArray();
		
		for(int i = 0; i < pName.length(); i++) {
			if(pName.charAt(i) == (char)32) {
				white ++;
			}
		}
		
		return white;
	}
	
	public static void showHashCode(int longName, int pDni ) {
		
		int hashCode = (int)((Math.random() * 100) * longName) + pDni;
		System.out.println("HashCode: " + hashCode);
		
	}
	

}
