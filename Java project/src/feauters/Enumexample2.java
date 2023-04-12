package feauters;

public class Enumexample2 {
public enum Season{WINTER,SPRING,SUMMER,FALL}
public static void main(String[]args){
	for(Season s:Season.values()){
		System.out.println(s);
	}
	System.out.println("Value of WINTER is:"+Season.valueOf("WINTER"));
	System.out.println("index of WINTER is:"+Season.valueOf("WINTER").ordinal());
	System.out.println("index of SUMMER is:"+Season.valueOf("SUMMER").ordinal());
}
}
