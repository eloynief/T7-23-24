package part1.ej3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	

	//objeto tipo scanner
	public static Scanner sc=new Scanner(System.in);
	
	
	/**
	 * apliacion que cuente cuantas veces esta esa palabra puesta
	 * @param args
	 */
	public static void main(String[] args) {
		//string para escribir
		char escritura=' ';
		
		String texto = "En un agujero en el suelo, vivía un hobbit. No un agujero húmedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";
		
		char[] letras;
		
		int veces=0;

		
		Map<Character,Integer> listaPalabras= new HashMap<Character,Integer>();
		
		//pasas la palabra a un array char
        letras=texto.toLowerCase().toCharArray();
        
        for(int i=0;i<letras.length;i++) {
        	
        	//le pones el valor de la letra
        	listaPalabras.put(letras[i],i);
        	
        }
        
        
        for(char letra:texto.toCharArray()) {
        	
        	if(Character.isLetter(letra)) {
        		letra=Character.toLowerCase(letra);
        		
        		listaPalabras.put(letra, listaPalabras.getOrDefault(letra, 0)+1);
        		
        	}
        	
        }
        
        
        
        
        
		
        System.out.println("Escribe la letra: ");
        
        
        
        escritura=sc.next().charAt(0);
        
        for(char palabra:listaPalabras) {
        	
        	if(palabra==escritura) {
        		veces+=1;
        	}
        	
        }
        
        
//		for (int i=0;i<listaPalabras.size();i++) {
//			
//			//
//			if(listaPalabras.containsValue(letra)){
//				veces+=1;
//			}
//			
//			
//		}
		System.out.println("La palabra aparece "+veces+" veces");
		
	}
	
}
