import java.util.*;
import java.util.Scanner;
class username
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("enter the username: ");
		String n1=input.nextLine();
		System.out.print("reenter the username: ");
		String n2=input.nextLine();
		if(n1.equals(n2)){
			System.out.println("Valid Usename");
}
		else{
			System.out.println("Username is invalid");
}
}
}
