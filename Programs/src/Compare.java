import java.util.Scanner;

public class Compare {
	public static void main(String args[]) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		System.out.print("Enter another String: ");
		String str1 = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str1.charAt(i)) {
				count = count + 1;
			}
		}
		if (count > 0)

		{
			System.out.println("Given strings are not  equal");
		}

		else {
			System.out.println("Given Strings are equal");
		}

	}

}
