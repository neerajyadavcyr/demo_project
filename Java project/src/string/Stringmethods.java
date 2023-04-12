package string;

public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "javatpoint";

		// compare
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "meklo";
		String s4 = "hemlo";
		String s5 = "flag";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s1.compareTo(s5));

		// concat
		String s6 = "java string";
		s1.concat("is immutble");
		System.out.println(s6);
		s6 = s6.concat("is immutable so assing it explicity");
		System.out.println(s6);

		// contains
		String Name = "what do you know about me";
		System.out.println(name.contains("do you know"));
		System.out.println(name.contains("about"));
		System.out.println(name.contains("hello"));

		// endswith
		String s7 = "java by javatpoint";
		System.out.println(s7.endsWith("t"));
		System.out.println(s7.endsWith("point"));

		// equals

		String s8 = "javatpoint";
		String s9 = "javatpoint";
		String s10 = "JAVATPOINT";
		String s11 = "python";
		System.out.println(s8.equals(s9));
		System.out.println(s8.equals(s10));
		System.out.println(s8.equals(s11));

		// getbytyes
		String s12 = "ABCDEFG";
		byte[] barr = s12.getBytes();
		for (int i = 0; i < barr.length; i++) {
			System.out.println(barr[i]);
			
		
			
		}
	}
}
