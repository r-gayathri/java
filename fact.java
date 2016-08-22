import java.util.Scanner;
public class fact{

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int N=input.nextInt();
		int fact=1;
		for(int i=1;i<=N;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("factorial is"+fact);
	}

}
