package part1.ej2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		

		Set<Integer> nums=new LinkedHashSet<Integer>();

		
		
		//numero random
		int random=0;
		
		//mientras que el tamaño del set sea menor que 10
		while(nums.size()<10) {
			//se crea el numero
			random=(int)(Math.random()*20+1);
			//se añade el numero
			nums.add(random);
		}
		
		
		//se imprime el numero
		System.out.println(nums);
		
		//se ace un for
//		for(int i=0;i<10;i++) {
//			//mientras no tenga el numero
//			while(!nums.contains(i)) {
//				random=(int)(Math.random()*10+1);
//						
//				
//			}
//			//se añade el numero
//			nums.add(i,random);
//		}
		

	}

}
