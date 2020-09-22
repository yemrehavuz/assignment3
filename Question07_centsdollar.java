package arithmetic_Operators;

public class Question07_centsdollar {

	public static void main(String[] args) {
		// An item in the machine can cost between 25 cents and 1 dollar, in 5-cent increments 
		
		int p=65,q,d,n,r;
		r=100-p;
		q=r/25;
		d=(r-25*q)/10;
		n=(r-(25*q+10*d))/5;
		System.out.println("Price in cents: "+p);
		System.out.println("Your change is "+q+" quarters, "+d+" dimes, and "+n+" nickles");
		

	}

}
