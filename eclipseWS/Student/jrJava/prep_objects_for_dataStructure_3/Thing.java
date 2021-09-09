package jrJava.prep_objects_for_dataStructure_3;

public class Thing {
	private int a;
	public Thing(int a){
		this.a = a;
	}
	public int getA(){
		return a;
	}
	public boolean equals(Object b){
		
		Thing t = (Thing) b;
		if(t.a == a) return true;
		
		return false;
	}
	public String toString(){
		return "Thing";
	}
	public int hashCode(){
		return 3;
	}
	public int compareTo(Object o){
		if(!(o instanceof Thing))return -1;
		Thing b = (Thing) o;
		if(a>b.a)return 1;
		else if(a<b.a)return -1;
		else return 0;
	}
}
