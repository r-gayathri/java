

import java.util.Scanner;
public class palrev{

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a,y,b=0,z=0,x;
		int c=input.nextInt();
	   while(c>0)
	   {
	     a=c%10;
	     b=b+a;
	     c=c/10;
	    }
	   x=b;
	   while(x>0)
	   {
	     y=x%10;
	     z=z*10+y;
	     x=x/10;
	    }
	    if(b==z)
	    	System.out.println("the given no is palindrom");
	    else
	    	System.out.println("the given no is not palindrom");
	}

}
