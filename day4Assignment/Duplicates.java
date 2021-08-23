package week2.day4Assignment;

public class Duplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] Test = text.split(" ");
		int count = 0;
		for (int i = 0; i < Test.length; i++) {
			for (int j = i + 1; j < Test.length; j++) {
				if (Test[i].equals(Test[j])) {
					count = count + 1;
				}

				if (count >= 1) {
					Test[j] = Test[j].replace(Test[i], " ");
				}

			}

			System.out.println(Test[i]);
		}

	}

}
