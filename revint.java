import java.util.Scanner;
public class revint{

	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int r,s=0;
		int N=input.nextInt();
	   while(N>0)
	   {
	     r=N%10;
	     s=s*10+r;
	     N=N/10;
	    }System.out.println(s);
	}

}
