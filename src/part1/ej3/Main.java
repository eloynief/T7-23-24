package part1.ej3;

import java.util.ArrayList;
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
		char letra=' ';
		
		String texto = "En un agujero en el suelo, vivía un hobbit. No un agujero húmedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";
		
		char[] letras;
		
		int veces=0;

		
		Map<Integer,Character> listaPalabras= new TreeMap<Integer,Character>();
		
		//pasas la palabra a un array char
        letras=texto.toCharArray();
        
        for(int i=0;i<letras.length;i++) {
        	
        	//le pones el valor de la letra
        	listaPalabras.put(i, letras[i]);
        	
        }
        
		
        System.out.println("Escribe la letra: ");
        
        
        
        letra=sc.next().charAt(0);
        
        
        
        
        
		for (int i=0;i<listaPalabras.size();i++) {
			
			//
			if(listaPalabras.containsValue(letra)){
				veces+=1;
			}
			
			
		}
		System.out.println("La palabra aparece "+veces+" veces");
		
	}
	
}
