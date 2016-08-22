import java.util.Scanner;
public class Rev {

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String S,reverse="";
		S=in.next();
		int l=S.length();
		for(int i=l-1;i>=0;i--)
		{
	   reverse=reverse+S.charAt(i);

		}
		
	   System.out.println(reverse);

}
}
