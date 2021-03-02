package practice.hashTable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable map= new Hashtable();
		map.put(1,"A");
		map.put(2,"B");
		map.put(3,"C");
		map.put(1, "D");
		map.remove(2);
		System.out.println(map.get(2));
		
		
	}

}
