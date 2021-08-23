package week2.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {

		String text = "Tes11Le11af11";
		int sum= 0;
		String text1= text.replaceAll("\\D", "");
		System.out.println(text1);
		char[] char1= text1.toCharArray();
		for (int i = 0; i < char1.length; i++) {
			sum= sum + Character.getNumericValue(char1[i]);
		}
		System.out.println("The Sum of digits is " + sum);
     
	}

}
