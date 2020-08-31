package com.mycode.hashcode;

import java.io.BufferedReader;
import java.io.FileReader;

public class Archivo {
	
	public String readFile(String nameFile) {
		
		String text = "";
		
		try {
			FileReader fr = new FileReader(nameFile);// preparamos el archivo a leer
			BufferedReader bf = new BufferedReader(fr);//almacenamos la informacion en ese buffer de "text"
			String temp = "";
			String bfRead;
			
			while( (bfRead = bf.readLine() ) != null) {
				temp += bfRead;
			}
			
			text = temp;
			bf.close();
		}
		catch(Exception e){
			System.err.println(e.getMessage());
		}
		
		return text;
	}

}
