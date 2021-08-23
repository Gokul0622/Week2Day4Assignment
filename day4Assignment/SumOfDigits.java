package week2.day4Assignment;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Tes12Le79af65";
		int sum =0;
		String Test =text.replaceAll("\\D", " ");
		char[] Array = Test.toCharArray();
		for (int i=0; i < Array.length;  i++) {
			int num = Character.getNumericValue(Array[i]);
			
			
			sum=sum+num;

		}
		System.out.println(sum);
	}

}
