package feauters;

public class Varargsexample {
static void display(String... values){
	System.out.println("display method invoked");
}
public static void main(String args[]){
	display();
	display("my","name","is","varargs");
	
}
}
