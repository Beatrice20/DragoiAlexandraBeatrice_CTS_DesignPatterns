package main;

import clase.Administrator;
import clase.Soare;

public class Main {

	public static void main(String[] args) {
		Administrator administrator1 = Administrator.getInstance();
		Administrator administrator2 = Administrator.getInstance();
		
		System.out.println(administrator1);
		System.out.println(administrator2);
		
		//constructorul este apelat o singura data la primul apel al functiei getInstance()
		Soare soare1 = Soare.getInstance("galben",10000);
		Soare soare2 = Soare.getInstance("portocaliu",2000);
		
		System.out.println(soare1.toString());
		System.out.println(soare2.toString());
	}

}
