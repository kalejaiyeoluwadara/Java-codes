import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double amt;
		double converted;

		System.out.print("---------------User name---------------: ");
		String userName = sc.nextLine();
		System.out.println("Welcome " + userName + ", select which service you'd like us to offer you: ");
		System.out.println("\n========================================");
		System.out.println("Id|Service");
		System.out.println("1. Convert Naira to Dollar\n2. Naira to Pound\n3. Naira to Euro");
		System.out.println("4. Dollar to Naira\n5. Pound to Naira\n6. Euro to Naira\n7. Quit ");
		System.out.println("\n========================================");

		String opt;
		do {
			System.out.print("Service Id: ");
			opt = sc.nextLine();

			switch (opt) {
				case "1":
					System.out.print("Enter amount in Naira: ");
					amt = sc.nextDouble();
					converted = (amt / 775.9);
					System.out.printf("\n\n#%,.2f to dollars is $%,.2f%n", amt, converted);
					break;
				case "2":
					System.out.print("Enter amount in Naira: ");
					amt = sc.nextDouble();
					converted = (amt / 935.18);
					System.out.printf("\n\n#%,.2f to pounds is P%,.2f%n", amt, converted);
					break;
				case "3":
					System.out.print("Enter amount in Naira: ");
					amt = sc.nextDouble();
					converted = (amt / 810.00);
					System.out.printf("\n\n#%,.2f to euros is E%,.2f%n", amt, converted);
					break;
				case "4":
					System.out.print("Enter amount in Dollars $: ");
					amt = sc.nextDouble();
					converted = (amt * 775.90);
					System.out.printf("\n\n$%,.2f to Naira is #%,.2f%n", amt, converted);
					break;
				case "5":
					System.out.print("Enter amount in Pounds £: ");
					amt = sc.nextDouble();
					converted = (amt * 935.18);
					System.out.printf("\n\nP%,.2f to Naira is #%,.2f%n", amt, converted);
					break;
				case "6":
					System.out.print("Enter amount in Euros €: ");
					amt = sc.nextDouble();
					converted = (amt * 810.00);
					System.out.printf("\n\nE%,.2f to Naira is #%,.2f%n", amt, converted);
					break;
				case "7":
					break;

				default:
					System.out.println("Option Id not found! ");
			}

			sc.nextLine();

				System.out.println("\nWould you like to continue? Enter '7' to quit: ");
			System.out.println("========================================");
			System.out.println("Id|Service");
			System.out.println("1. Convert Naira to Dollar\n2. Naira to Pound\n3. Naira to Euro");
			System.out.println("4. Dollar to Naira\n5. Pound to Naira\n6. Euro to Naira\n7. Quit ");
			System.out.println("\n========================================");
		} while (!opt.equals("7"));

		System.out.println("Service closing.");
	}
}
