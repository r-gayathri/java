
import java.util.Scanner;
public class Introm{

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s;
		int value=0;
		s=in.nextLine();
		int l=s.length();
		for(int i=0;i<l;i++)
		{
			if(s.charAt(i)=='I')
				value+=1;
			else if(s.charAt(i)=='V')
				value+=5;
			else if(s.charAt(i)=='X')
				value+=10;
			
			
		}
		if(s.contains("IV"))
			value-=2;
		if(s.contains("IX"))
			value-=2;
		System.out.println("the corresponding integer is"+value);
	}

}
