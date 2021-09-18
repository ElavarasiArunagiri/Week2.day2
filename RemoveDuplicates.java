package week2.day2.assignments;

public class RemoveDuplicates {

	public static void main(String[] args) {
		        String text = "We learn java basics as part of java sessions in java week1";
		        String[] arr = text.split(" ");
		        System.out.println("The sentence:");
		        System.out.println(text);
		        
		        for (int i = 0; i <= arr.length - 1; i++) {
		            	            
		            for (int j = i+1; j <= arr.length - 1; j++) {
		                
		                if (arr[i].equalsIgnoreCase(arr[j]) ) 
		                	 arr[j] = "";
		                 	                
		            }
		            System.out.print(arr[i]+" ");
		        }
	}

}
