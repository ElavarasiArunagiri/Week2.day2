package week2.day2.assignments;

public class ReverseString {

	public static void main(String[] args) {
		String str = "feeling good";
		char[] chstr = str.toCharArray();
		
		System.out.println("The given string: ");
		System.out.println(str);
		System.out.println("The reverse of the string: ");
		for (int j=chstr.length-1; j>=0; j--)
		{
			System.out.print(chstr[j]);
		}

	}

}
