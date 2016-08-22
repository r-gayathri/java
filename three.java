import java.util.Scanner;


public class three {

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,b,c;
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		if(a>b&&a>c)
			System.out.println("a is bigger");
		
		else if(b>a&&b>c)
			System.out.println("b is bigger");
		else if(c>b&&c>a)
			System.out.println("c is bigger");
		
		
	}

}
