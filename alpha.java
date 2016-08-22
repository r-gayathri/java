import java.util.Scanner;
public class alpha{

	public static void main(String[] args)throws java.io.IOException {
		Scanner in=new Scanner(System.in);
		char ch;
		ch=(char)System.in.read();
		if(Character.isLetter(ch))
			System.out.println("character is alpha");
		else
			System.out.println("not alpha");
	}

}
