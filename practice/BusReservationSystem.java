import java.util.Scanner;

class Customer {
    private String name;
    private String phone;
    private String date;

    public Customer(String name, String phone, String date) {
        this.name = name;
        this.phone = phone;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getDate() {
        return date;
    }
}

class BusService {
    public static final double CHARGE_PERCENTAGE = 0.20;
    public static final int BASE_FARE = 5000;

    public static double calculateExtraCharge(double baseFare) {
        return baseFare * CHARGE_PERCENTAGE;
    }

    public static double calculateTotalFare() {
        return BASE_FARE + calculateExtraCharge(BASE_FARE);
    }
}

public class BusReservationSystem {
    public static Customer getCustomerDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer's details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Phone number: ");
        String phone = scanner.nextLine();

        System.out.print("Date of travel (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        return new Customer(name, phone, date);
    }

    public static double calculateExtraCharge(double baseFare) {
        return baseFare * BusService.CHARGE_PERCENTAGE;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Landstar Motors Bus Reservation System");

        Customer customer = getCustomerDetails();

        System.out.println("\nCustomer Details:");
        System.out.println("Name: " + customer.getName());
        System.out.println("Phone: " + customer.getPhone());
        System.out.println("Date of Travel: " + customer.getDate());

        double extraCharge = calculateExtraCharge(BusService.BASE_FARE);
        double totalFare = BusService.calculateTotalFare();

        System.out.println("\nExtra Charge: " + extraCharge);
        System.out.println("Total Fare: " + totalFare);

        System.out.print("\nChoose an option (1 for refund, 2 for rescheduling): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Refund Processed. Have a nice day!");
        } else if (choice == 2) {
            System.out.println("Rescheduling is not available at the moment. Please check later.");
        } else {
            System.out.println("Invalid choice. Please choose 1 for refund or 2 for rescheduling.");
        }

        scanner.close();
    }
}
