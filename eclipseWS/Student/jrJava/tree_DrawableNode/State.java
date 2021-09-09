package jrJava.tree_DrawableNode;

public class State implements Comparable<State> {

	private String name;
	private String abbr;
	private String capital;
	private int population;
	private int area;
	private int yy, mm, dd;
	
	
	public State(String name, String abbr, String capital, int population, int area, int yy, int mm, int dd) {
		this.name = name;
		this.abbr = abbr;
		this.capital = capital;
		this.population = population;
		this.area = area;
		this.yy = yy;
		this.mm = mm;
		this.dd = dd;
	}
	
	
	public int compareTo(State o){
		if(yy>o.yy) return 1;
		else if(yy<o.yy) return -1;
		else {
			if(mm>o.mm) return 1;
			else if(mm<o.mm) return -1;
			else {
				if(dd>o.dd) return 1;
				else if(dd<o.dd) return -1;
				else return 0;
			}
		}
	}
	
	
	public String toString(){
		return abbr;
	}
	
}





