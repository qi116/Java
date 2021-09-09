package jrJava.abstractType_4_generics;

public class MapStorage<K, V> {

	private K key;
	private V value;
	
	
	public void put(K key, V value){
		this.key = key;
		this.value = value;
	}
	
	public K getKey(){ return key; }
	public V getValue(){ return value; }
	
}
