package fr.treeptik.initjava;

public class TestMultiMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MultiMap multiMap = new MultiMap();
		
		multiMap.put("Cle1", "value1"); // on a bien créé une map qui a une seule key et plusieurs value pour cette key
		multiMap.put("Cle1", "value2");
		multiMap.put("Cle1", "value3");
		

	}

}
