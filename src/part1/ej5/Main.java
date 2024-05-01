package part1.ej5;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	//objeto tipo scanner
	public static Scanner sc=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		//en este treemap guardaremos la clave(string) (nosepuederepetir) y el valor(int) (sepuederepetir)
		TreeMap<String,Integer> tv=new TreeMap<String,Integer>();
		
		int opcion=-1;
		
		//valoracion de la serie. esta se puede repetir
		int valoracion=0;
		
		//la serie. esta no se puede repetir
		String serie="";
		
		while(opcion!=0) {
			
			System.out.println("Introduce la opcion: ");
			
			opcion=sc.nextInt();
			
			switch (opcion){
			//agregar
			case 1:{
				
				//se podria haber un hecho un metodo que directamente agrega a la coleccion los valores
				while(serie.equals("")) {

					//pedimos la serie
					System.out.println("Introduce la serie");
					
					serie=sc.next();
					
				}

				//se podria haber un hecho un metodo que directamente agrega a la coleccion los valores
				while(valoracion<=0) {
					
					try {

						System.out.println("Introduce la valoracion");
						
						valoracion=sc.nextInt();
						
					}
					catch(InputMismatchException noteolvide) {
						System.out.println("El valor escrito debe ser un numero y que ese numero no tenga decimales");
					}
					
				}
				
				tv.put(serie, valoracion);
				
				break;
			}//fin case 1
			//mostrar la valoracion de la clave
			case 2:{
				
				//pedimos la serie
				System.out.println("Introduce la serie");
				
				serie=sc.next();
				
				
				System.out.println(tv.get(serie));
				
				
				break;
			}//fin case 2
			
			case 3:{
				
				//pedimos la serie
				System.out.println("Introduce la serie");
				
				serie=sc.next();
				
				tv.remove(serie);
				
				
				break;
			}//fin case 3
			
			
			
			}
			
			
		}
		
	}

}
