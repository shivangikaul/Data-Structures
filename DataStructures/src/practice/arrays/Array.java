package practice.arrays;

import java.util.Arrays;

public class Array {
private int[] arr ;
private int count;
private int length;
public Array(int length) {
	this.length=length;
	arr=new int[length];
}
 public void insert(int element){
	 if(count==this.length){
		  int[] NewArr=Arrays.copyOf(arr, this.length*2);
		arr=NewArr;
	 }
	 arr[count++]=element;

 }
 
 public int elementAt(int index){
	 return arr[index];
 }
 public void remove(int index){
	 
	 if(index<0|| index>count)
		 throw new IllegalArgumentException();
	 for(int i=index;i<count;i++)
		 arr[i]=arr[i+1];
	 count--;
 }
 
 public int indexOf(int element)
 {
	 for(int i=0;i<count;i++){
		 if(arr[i]==element)
			return i; 
	 }
		 return -1;
 }
 public void print(){
	 for(int i=0;i<count;i++){
		 //if(arr[i]!=0)
		 System.out.print(arr[i]+"  ");
	 }
	 System.out.println();
 }
 
 public int max(){
	 int largest=0;
	 for(int i=0;i<count;i++){
		 if(arr[i]>largest)
			 largest=arr[i];
	 }
	 return largest;
 }
 
 public Array intersect(Array input){
	 Array common=new Array(input.length);
	 for(int i=0;i<input.length;i++){
		 for(int j=0;j<count;j++){
			 if(input.elementAt(i)==arr[j])
				 common.insert(input.elementAt(i));
		 }
	 }
	 return common;
 }
 
 

}
