import java.util.Scanner;

class splchar {
	private static Scanner sc;
	public static void main(String[] args) {
		String st;
		int i, alph, digi, spl;
		alph = digi = spl = 0;
		char ch;
		
		Scanner input = new Scanner(System.in);
		System.out.print("\nPlease Enter the String =  ");
		st = input.nextLine();
		
		for(i = 0; i <st.length(); i++)
		{
			ch = st.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				alph++;
			}
			else if(ch >= '0' && ch <= '9') {
				digi++;
			}
			else {
				System.out.println(" "+st.charAt(i));
				spl++;
			}
		}
		System.out.println("Number of Special Characters   =  " + spl);
	}
}