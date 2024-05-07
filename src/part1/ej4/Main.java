package part1.ej4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	//objeto tipo scanner
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		List<String> listaNombres=new ArrayList<String>();
		
		String nombre="";
		
		System.out.println("Escribe 5 nombres: ");
		
		while(listaNombres.size()<5) {
			
			nombre=sc.next();
			
			if (!listaNombres.contains(nombre)) {
				listaNombres.add(nombre);
				
			}
			else {
				System.out.println("Ese nombre ya se ha introducido, introduzca otro");
			}
			
		}

		System.out.println(listaNombres);
		
		//funcion dentro del collections que invierte el valor de la lista
		Collections.reverse(listaNombres);
		
		System.out.println(listaNombres);
		
	}

}
