import java.util.Scanner;
public class palinTest{

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a,s=0,y;
		int x=input.nextInt();
		y=x;
	   while(y>0)
	   {
	     a=y%10;
	     s=s*10+a;
	     y=y/10;
	    }
	    if(x==y)
	    	System.out.println("the given no is palindrom");
	    else
	    	System.out.println("the given no is not palindrom");
	}

}

	
