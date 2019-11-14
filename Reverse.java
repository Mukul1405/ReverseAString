import java.util.Scanner;

public class reverseAString {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[] ch = str.toCharArray();
		int r = ch.length - 1, l = 0;
		 {

	            if (!Character.isAlphabetic(ch[l])) {
	                l++;
	            }
	            else if(!Character.isAlphabetic(ch[r]))
	            {
	            	r--;
	            }

	            else
	            {
	                char tmp = ch[l];
	                ch[l] = ch[r];
	                ch[r] = tmp;
	                l++;
	                r--;
	            }
	            System.out.println(ch);
	        }
	}
}
