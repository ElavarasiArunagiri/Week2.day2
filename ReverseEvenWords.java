package week2.day2.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
	    String[] arr = test.split(" ");
	    System.out.println("The sentence:");
        System.out.println(test);
        System.out.println("Reversing the even position words alone:");
        for (int i = 0; i <= arr.length - 1; i++) {
        	if((i%2)!=0)
        	{	
        		for (int j=(arr[i].length())-1; j>=0; j--)
        		{
        			 System.out.print(arr[i].charAt(j));
        		}
        		System.out.print(" ");
        	}
        	else
        		System.out.print(arr[i]+" ");
        }
	}

}
