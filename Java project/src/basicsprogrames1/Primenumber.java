package basicsprogrames1;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,m=0,flag=0;
int n=3;
m=n/2;
if(n==0||n==1){
System.out.println(n+"is not a palindrome");
}
else{
	for(i=2;i<=m;i++){
		if(n%i==0){
			System.out.println(n+"is not a palindrome");
			flag=1;
			break;
	}
}
	if(flag==0){
		System.out.println(m+"is a palindrome");
	}
	}
	}
}
