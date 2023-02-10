import java.util.*;
import java.util.Scanner;

public class righttripat 
{    
public static void main(String[] args)   
{    
 Scanner input=new Scanner(System.in);
int row=input.nextInt();

for (int i=0; i<row; i++)   
{  
  
for (int j=(row-i); j>=0; j--)         
{  
  
System.out.print(" ");   
}   
for (int j=0; j<=i; j++ )   
{   
     
System.out.print("*");   
}   

System.out.println();   
}   
}   
}