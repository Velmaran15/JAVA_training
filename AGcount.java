/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class AGcount
{
	public static int countAG(String a) {
		int sum = 0;
		int g = 0;
		for(int i=a.length()-1; i>=0; i--) {

			if(a.charAt(i) == 'G') g++;
			else if(a.charAt(i) == 'A') sum+=g;
		}
		return sum;
		
	}
	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		String n = z.next();

		System.out.print(countAG(n));
	}
}