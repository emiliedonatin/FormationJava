package fr.treeptik.initjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class ListEtCollection {
	
	public static void main(String[] args) throws InterruptedException {
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("Bonjour");
		arrayList.add("tout");
		arrayList.add("le");
		arrayList.add("monde");
		
		afficherInverse(arrayList);
		
		
		ArrayList<Character> arrayList2 = new ArrayList<>();
		
		arrayList2.add('A');
		arrayList2.add('Z');
		arrayList2.add('M');
		arrayList2.add('E');
		arrayList2.add('T');
		
		afficherCaractere(arrayList2);
		
		Random random = new Random();
		
		ArrayList<String> arrayList3 = new ArrayList<>();
		System.out.println((System.currentTimeMillis()));
		for (int i=0; i<15000; i++){
			arrayList3.add("b");
			long randomLong = random.nextLong();
			
		}
		
		System.out.println((System.currentTimeMillis()));
		
		
		LinkedList<String> linkedList = new LinkedList<>();
		System.out.println((System.currentTimeMillis()));
		for (int i=0; i<15000; i++){
			
			linkedList.add("b");
		}
		
		System.out.println((System.currentTimeMillis()));
		
		
		
		 for(int i =0; i<1; i++){
			    int randomInteger = random.nextInt(10000);
			    
			}

			

	}

	
	public static ArrayList<String> afficherInverse (ArrayList<String> arrayList){
		
		
		Collections.reverse(arrayList);
		
		for (String string : arrayList) {
			System.out.println(string);
		}
		
		return arrayList;
	}
	
	
	public static ArrayList<Character> afficherCaractere (ArrayList<Character> arrayListCaractere){
		
		Collections.sort(arrayListCaractere);
		Collections.reverse(arrayListCaractere);
		
		for (Character character : arrayListCaractere) {
			System.out.println(character);
			
		}
		
		
		return arrayListCaractere;
	}






}
