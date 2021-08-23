package week2.day2;

public class SumOfDigitsFromString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Tes12Le11af11";
		int sum= 0;
		char[] char1= text.toCharArray();
		for (int i = 0; i < char1.length; i++) {
			if(Character.isDigit(char1[i]))
			{
			sum= sum + Character.getNumericValue(char1[i]);
		}
		}
		System.out.println("The Sum of digits is " + sum);
	}

}
