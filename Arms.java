import java.util.Scanner;
public class Arms{

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,t,s=0;
		a=in.nextInt();
		int m,c=0;
		m=a;
		while(m>0)
		{
			c++;
			 m=m/10;
			
		}
		int n=a;
		while(n>0)
		{
			t=n%10;
			s=s+(int)Math.pow(t,c);
			n=n/10;
			
			
		}
		if(a==s)
			System.out.println("armstrong number");
		else
			System.out.println(" not  armstrong number");
		
	}

}
