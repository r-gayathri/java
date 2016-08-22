import java.util.Scanner;
public class vowrev {

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s,rev="";
		int length;
		System.out.println("enter string");
		s=in.next();
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
	   rev=rev+s.charAt(i);

		}
		
	   System.out.println(rev);
	   
	   length=rev.length();
	   for(int j=0;j<=l-1;j++)
	   {
		
			 
if(!(rev.charAt(j)=='a'||rev.charAt(j)=='e'||rev.charAt(j)=='i'||rev.charAt(j)=='o'||rev.charAt(j)=='u'))
			System.out.print(rev.charAt(j));
		
			
	}

}


}