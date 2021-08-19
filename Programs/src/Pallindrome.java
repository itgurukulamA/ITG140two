import java.util.Scanner;

public class Pallindrome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		int i = 0, count = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				count = 1;
			}
				i++;
				j--;
			}
			if (count == 1) {
				System.out.println("Given string is not a pallindrome");
			} else {
				System.out.println("Given string is a pallindrome");
			}
		}
	}

	
