package practice.arrays;

public class Main {

	
	public static void main(String...strings ){
		Array otherArr= new Array(5);
		otherArr.insert(10);
		otherArr.insert(4);
		otherArr.insert(5);
		otherArr.insert(7);
		otherArr.insert(8);
		Array num=new Array(3);
		num.insert(1);
		num.insert(2);
		num.insert(3);
		num.insert(4);
		num.insert(5);
		num.remove(2);
		num.remove(1);
		num.insert(8);
		num.insert(9);
		num.remove(4);
		num.print();
		Array InterArr=num.intersect(otherArr);
		System.out.println(num.max());
		InterArr.print();
	}
}
