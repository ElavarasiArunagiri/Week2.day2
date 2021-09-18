package week2.day2.assignments;

public class ReverseString2 {

	public static void main(String[] args) {
		String str = "feeling good";
		System.out.println("The given string: ");
		System.out.println(str);
		System.out.println("The reverse of the string: ");
		for(int i=(str.length())-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}

	}

}
