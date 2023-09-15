package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

import org.lessons.java.valutazioni.Studente;

public class Main {
	public static void main(String[] args) {
		Random rnd = new Random();
		int lng = 20;	
		Studente[] studs = new Studente[lng];
		
		int promossiCounter = 0;
		
		for(int i = 0; i < studs.length; i++)
		{
			
			int rndAss = rnd.nextInt(101);
			double rndAvg = (rnd.nextDouble() * 91) + rnd.nextDouble();
			studs[i] = new Studente(i + 1,rndAss, rndAvg);
			
			studs[i].getInfo();
			
			if(studs[i].isPromossed == true)
			{
				promossiCounter++;
			}
		}
		
		Studente[] goodStuds = new Studente[promossiCounter];
		Studente[] badStuds = new Studente[lng -promossiCounter];
		int goodCounter = 0;
		int badCounter = 0;
		
		for(int i = 0; i < studs.length; i++)
		{
			if(studs[i].isPromossed == true)
			{
				goodStuds[goodCounter] = studs[i];
				goodCounter++;
			}
			else
			{
				badStuds[badCounter] = studs[i];
				badCounter++;
			}
		}
		
		System.out.println(Arrays.asList(goodStuds));
		System.out.println(Arrays.asList(badStuds));
		
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		
		Studente best = null;
		Studente worst = null;
		
		for(int i = 0; i < goodStuds.length; i++)
		{
			if(goodStuds[i].avg > max)
			{
				max = goodStuds[i].avg;
				best = goodStuds[i];
			}
			
		}
		
		System.out.println("miglior studente id: " + best.id);
		
		for(int i = 0; i < badStuds.length; i++)
		{
			if(badStuds[i].avg < min)
			{
				min = badStuds[i].avg;
				worst = badStuds[i];
			}
			
		}
		
		System.out.println("peggior studente id: " + worst.id);
	}
}
