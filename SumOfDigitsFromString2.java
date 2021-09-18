package week2.day2.assignments;

public class SumOfDigitsFromString2 {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum = 0;
		System.out.println("The given string is : " +text);
		System.out.println("The numbers in the string: ");
		
		for(int i = 0; i<(text.length()); i++) {
			char chtext = text.charAt(i);
			if(Character.isDigit(chtext))
			{ 
				System.out.print(chtext+ " ");
				sum = sum+Character.getNumericValue(chtext);
			}
		}
		System.out.println("");
		System.out.println("The sum of the above is :" +sum);	

	}

}
