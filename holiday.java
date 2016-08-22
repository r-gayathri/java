import java.util.Scanner;
public class holiday{

	
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String str;
		String status="";
		
		System.out.println("enter string");
		str=in.next();
		if(str.equalsIgnoreCase("monday"))
		
			status="true";
		else if(str.equalsIgnoreCase("tuesday"))
			status="true";
		
		else if(str.equalsIgnoreCase("wednesday"))
			status="true";
		
		else if(str.equalsIgnoreCase("thursday"))
			status="true";
		
		else if(str.equalsIgnoreCase("friday"))
			status="true";
		
		else if(str.equalsIgnoreCase("saturday"))
			status="true";
		
		else
			status="false";
		
		System.out.println(status);
		
	
	}
	
		
	}
