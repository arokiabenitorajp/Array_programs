package array;

public class check_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] even = new int[5];
		int i = 0;
		for (int a = 1; i < even.length; a++) {
			if (a % 2 == 0) {
				even[i] = a;
				// System.out.println(even[i]);

				i++;
			} else {

				// even[i]=a;
				// i++;
			}

		}

		myClass.print(even);

	}

}
