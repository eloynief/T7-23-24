package part1.ej3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Corrected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = "En un agujero en el suelo, "
				+ "vivía un hobbit. No un agujero húmedo, "
				+ "sucio, repugnante, "
				+ "con restos de gusanos y olor a fango, "
				+ "ni tampoco un agujero, seco, desnudo y arenoso, "
				+ "sin nada en que sentarse o que comer: "
				+ "era un agujero-hobbit, y eso significa comodidad";
		//texto en minusculas
		String textoMinuscula=texto.toLowerCase();
		
		
		

		Map<Character,Integer> listaPalabras= new TreeMap<>();
		
		
		char caracter=' ';
		
		
		
		for (int i =0;i<texto.length();i++) {
			
			//agarra el caracter de esa posicion
			caracter=textoMinuscula.charAt(i);
			
			if(Character.isLetter(caracter)) {
				
				//si tiene este valor
				if(listaPalabras.containsKey(caracter)) {
					
					listaPalabras.put(caracter, listaPalabras.get(caracter)+1);
					
				}
				
			}
			
		}
		
		System.out.println(listaPalabras);
		
		
	}

}
