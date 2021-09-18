package week2.day2.assignments;
 
public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum = 0;
		System.out.println("The given string is : " +text);
		
		String number = text.replaceAll("\\D+", "");
		char[] chnum = number.toCharArray();
		
		System.out.println("The numbers in the string: ");
		for(int i = 0; i<chnum.length; i++) {
				char ch = chnum[i];
				System.out.print(ch+ " ");
				sum = sum+Character.getNumericValue(ch);
			
		}
		System.out.println("");
		System.out.println("The sum of the above is :" +sum);	
	}

}
