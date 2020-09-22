package arithmetic_Operators;

public class Question05 {

	public static void main(String[] args) {
		// outputs the number of hours, minutes, and seconds that corresponds to input total seconds
		
		int is=3695, h,m,s;
		h=is/3600;
		m=is%3600/60;
		s=is%60;
		System.out.println("inputSecond is "+is);
		System.out.println(h+" hours, "+m+" minutes, and "+s+" seconds");

	}

}
