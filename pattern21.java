import java.util.*;
import java.util.Scanner;
class pattern21
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.print("Enter the character to be printed: ");
String x=input.nextLine();
System.out.print("Max Number of time printed: ");
int n=input.nextInt();
for(int i=1;i<=n;i++)
{
 for(int j=1;j<=i;j++)
 {
 System.out.print(x);
 }
 System.out.print("\n");
}
}
}