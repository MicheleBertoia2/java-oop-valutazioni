package org.lessons.java;

import java.util.Random;

import org.lessons.java.valutazioni.Studente;

public class Main {
	public static void main(String[] args) {
		Random rnd = new Random();
		
		
		
		Studente[] studs = new Studente[20];
		
		for(int i = 0; i < studs.length; i++)
		{
			
			int rndAss = rnd.nextInt(101);
			double rndAvg = ((rnd.nextDouble() * 10)- 1) + rnd.nextDouble();
			studs[i] = new Studente(i + 1,rndAss, rndAvg);
			
			studs[i].getInfo();
		}
	}
}
