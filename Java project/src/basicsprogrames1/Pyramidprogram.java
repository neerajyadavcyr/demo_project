package basicsprogrames1;

public class Pyramidprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0; i<5; i++){
	for(int j=5-i; j>1; j--){
		System.out.print(" ");
	}
	for (int k=0; k<=i; k++){
		System.out.print("*");
	}
	System.out.println();
}
	}

}
