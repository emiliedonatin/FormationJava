package fr.treeptik.eclipsemaven;

import java.io.InputStreamReader;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {

		try {

			Properties properties = new Properties();

			
			properties.load(new InputStreamReader(Main.class.getResourceAsStream("/application.properties")));

			System.out.println(properties.getProperty("application.message"));

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
