package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Collectionsexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>list=new ArrayList<String>();
list.add("Ravi");
list.add("Vijay");
list.add("Ravi");
list.add("Ajay");
Iterator<String> itr =list.iterator();
while(itr.hasNext()){
	System.out.println(itr.next());
}
	}	
}