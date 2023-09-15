package org.lessons.java.valutazioni;

public class Studente {
	public int id;
	public int assenze;
	public double avg;
	public boolean isPromossed;
	
	public Studente(int id, int assenze, double avg)
	{
		this.id = id;
		this.assenze = assenze;
		this.avg = avg;
		
		this.isPromossed = isPromossed(id, assenze, avg);
	}
	
	public boolean isPromossed(int id, int assenze, double avg)
	{
		boolean isPromossed = false;
		
		boolean isBeetwen = assenze >= 25 && assenze <= 50;
		boolean isUnder = assenze < 25;
		boolean isAvgGreatThanTwo = avg > 2;
		boolean isAvgGreatOrEqualThanTwo = avg >= 2;
		
		if(isBeetwen && isAvgGreatThanTwo || isUnder && isAvgGreatOrEqualThanTwo)
			isPromossed = true;
				
		
		return isPromossed;
	}
	
	public void getInfo()
	{
		System.out.println("id: " + id 
				+ ", assenze: " + assenze
				+ ", media voti: " + avg
				+ ", promosso: " + ((isPromossed)? "si" : "no"));
	}
}
